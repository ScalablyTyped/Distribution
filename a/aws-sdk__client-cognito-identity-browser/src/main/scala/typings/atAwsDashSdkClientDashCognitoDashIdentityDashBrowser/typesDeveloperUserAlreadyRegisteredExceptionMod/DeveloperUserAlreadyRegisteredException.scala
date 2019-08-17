package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDeveloperUserAlreadyRegisteredExceptionMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperUserAlreadyRegisteredException
  extends ServiceException[_DeveloperUserAlreadyRegisteredExceptionDetails]
     with GetOpenIdTokenForDeveloperIdentityExceptionsUnion {
  @JSName("name")
  var name_DeveloperUserAlreadyRegisteredException: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.DeveloperUserAlreadyRegisteredException
}

object DeveloperUserAlreadyRegisteredException {
  @scala.inline
  def apply(
    details: _DeveloperUserAlreadyRegisteredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.DeveloperUserAlreadyRegisteredException,
    stack: String = null
  ): DeveloperUserAlreadyRegisteredException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[DeveloperUserAlreadyRegisteredException]
  }
}

