package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTriggerRequest extends js.Object {
  /**
    * The name of the trigger to stop.
    */
  var Name: NameString = js.native
}

object StopTriggerRequest {
  @scala.inline
  def apply(Name: NameString): StopTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTriggerRequest]
  }
}

