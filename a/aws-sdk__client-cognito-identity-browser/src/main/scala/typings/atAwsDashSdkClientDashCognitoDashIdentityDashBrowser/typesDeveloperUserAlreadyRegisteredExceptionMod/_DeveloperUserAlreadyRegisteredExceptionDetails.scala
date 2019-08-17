package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDeveloperUserAlreadyRegisteredExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeveloperUserAlreadyRegisteredExceptionDetails extends js.Object {
  /**
    * <p>This developer user identifier is already registered with Cognito.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _DeveloperUserAlreadyRegisteredExceptionDetails {
  @scala.inline
  def apply(message: String = null): _DeveloperUserAlreadyRegisteredExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_DeveloperUserAlreadyRegisteredExceptionDetails]
  }
}

