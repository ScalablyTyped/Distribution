package typings.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalServiceExceptionDetails extends js.Object {
  /**
    * <p>The message returned by an ExternalServiceException</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object ExternalServiceExceptionDetails {
  @scala.inline
  def apply(message: String = null): ExternalServiceExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalServiceExceptionDetails]
  }
}

