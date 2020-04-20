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
}

