package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionFilter extends js.Object {
  /**
    * The type of element to filter. 
    */
  var Name: ScheduledActionFilterName = js.native
  /**
    * List of values. Compare if the value (of type defined by Name) equals an item in the list of scheduled actions. 
    */
  var Values: ValueStringList = js.native
}

object ScheduledActionFilter {
  @scala.inline
  def apply(Name: ScheduledActionFilterName, Values: ValueStringList): ScheduledActionFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionFilter]
  }
  @scala.inline
  implicit class ScheduledActionFilterOps[Self <: ScheduledActionFilter] (val x: Self) extends AnyVal {
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
    def setName(value: ScheduledActionFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: ValueStringList): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

