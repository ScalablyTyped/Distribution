package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTriggerRequest extends js.Object {
  /**
    * The name of the trigger to start.
    */
  var Name: NameString = js.native
}

object StartTriggerRequest {
  @scala.inline
  def apply(Name: NameString): StartTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTriggerRequest]
  }
}

