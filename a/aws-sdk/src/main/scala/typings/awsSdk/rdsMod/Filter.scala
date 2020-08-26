package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: String = js.native
  /**
    * One or more filter values. Filter values are case-sensitive.
    */
  var Values: FilterValueList = js.native
}

object Filter {
  @scala.inline
  def apply(Name: String, Values: FilterValueList): Filter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: FilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

