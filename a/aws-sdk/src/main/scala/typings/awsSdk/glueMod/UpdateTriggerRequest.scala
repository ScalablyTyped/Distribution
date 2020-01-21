package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTriggerRequest extends js.Object {
  /**
    * The name of the trigger to update.
    */
  var Name: NameString = js.native
  /**
    * The new values with which to update the trigger.
    */
  var TriggerUpdate: typings.awsSdk.glueMod.TriggerUpdate = js.native
}

object UpdateTriggerRequest {
  @scala.inline
  def apply(Name: NameString, TriggerUpdate: TriggerUpdate): UpdateTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TriggerUpdate = TriggerUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateTriggerRequest]
  }
}

