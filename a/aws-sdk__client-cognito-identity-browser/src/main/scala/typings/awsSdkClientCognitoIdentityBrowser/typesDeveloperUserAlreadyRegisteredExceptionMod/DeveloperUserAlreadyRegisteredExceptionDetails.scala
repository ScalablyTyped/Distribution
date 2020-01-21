package typings.awsSdkClientCognitoIdentityBrowser.typesDeveloperUserAlreadyRegisteredExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperUserAlreadyRegisteredExceptionDetails extends js.Object {
  /**
    * <p>This developer user identifier is already registered with Cognito.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object DeveloperUserAlreadyRegisteredExceptionDetails {
  @scala.inline
  def apply(message: String = null): DeveloperUserAlreadyRegisteredExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperUserAlreadyRegisteredExceptionDetails]
  }
}

