package typings.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyUnavailableExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object KeyUnavailableExceptionDetails {
  @scala.inline
  def apply(message: String = null): KeyUnavailableExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyUnavailableExceptionDetails]
  }
}

