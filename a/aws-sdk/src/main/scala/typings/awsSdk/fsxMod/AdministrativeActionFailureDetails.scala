package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdministrativeActionFailureDetails extends js.Object {
  /**
    * Error message providing details about the failure.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
}

object AdministrativeActionFailureDetails {
  @scala.inline
  def apply(Message: ErrorMessage = null): AdministrativeActionFailureDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrativeActionFailureDetails]
  }
}

