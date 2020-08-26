package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupFilter extends js.Object {
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: GroupFilterName = js.native
  /**
    * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
    */
  var Values: GroupFilterValues = js.native
}

object GroupFilter {
  @scala.inline
  def apply(Name: GroupFilterName, Values: GroupFilterValues): GroupFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupFilter]
  }
  @scala.inline
  implicit class GroupFilterOps[Self <: GroupFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: GroupFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: GroupFilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: GroupFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

