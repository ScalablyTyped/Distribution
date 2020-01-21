package typings.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodNotAllowedExceptionDetails extends js.Object {
  /**
    * The error message that's returned from the API.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The unique message body ID.
    */
  var RequestID: js.UndefOr[String] = js.undefined
}

object MethodNotAllowedExceptionDetails {
  @scala.inline
  def apply(Message: String = null, RequestID: String = null): MethodNotAllowedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (RequestID != null) __obj.updateDynamic("RequestID")(RequestID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodNotAllowedExceptionDetails]
  }
}

