package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceFilter extends js.Object {
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: ResourceFilterName = js.native
  /**
    * One or more filter values. Allowed filter values vary by resource filter name, and are case-sensitive.
    */
  var Values: ResourceFilterValues = js.native
}

object ResourceFilter {
  @scala.inline
  def apply(Name: ResourceFilterName, Values: ResourceFilterValues): ResourceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFilter]
  }
  @scala.inline
  implicit class ResourceFilterOps[Self <: ResourceFilter] (val x: Self) extends AnyVal {
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
    def setName(value: ResourceFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: ResourceFilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: ResourceFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

