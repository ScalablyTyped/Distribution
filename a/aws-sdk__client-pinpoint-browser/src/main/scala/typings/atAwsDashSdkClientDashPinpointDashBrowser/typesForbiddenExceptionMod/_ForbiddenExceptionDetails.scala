package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesForbiddenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ForbiddenExceptionDetails extends js.Object {
  /**
    * The error message that's returned from the API.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The unique message body ID.
    */
  var RequestID: js.UndefOr[String] = js.undefined
}

object _ForbiddenExceptionDetails {
  @scala.inline
  def apply(Message: String = null, RequestID: String = null): _ForbiddenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (RequestID != null) __obj.updateDynamic("RequestID")(RequestID)
    __obj.asInstanceOf[_ForbiddenExceptionDetails]
  }
}

