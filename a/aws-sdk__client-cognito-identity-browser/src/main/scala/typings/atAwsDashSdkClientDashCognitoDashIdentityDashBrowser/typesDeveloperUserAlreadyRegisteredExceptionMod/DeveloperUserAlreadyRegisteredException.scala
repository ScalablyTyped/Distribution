package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDeveloperUserAlreadyRegisteredExceptionMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _DeveloperUserAlreadyRegisteredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.DeveloperUserAlreadyRegisteredException,
    stack: String = null
  ): DeveloperUserAlreadyRegisteredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperUserAlreadyRegisteredException]
  }
}

