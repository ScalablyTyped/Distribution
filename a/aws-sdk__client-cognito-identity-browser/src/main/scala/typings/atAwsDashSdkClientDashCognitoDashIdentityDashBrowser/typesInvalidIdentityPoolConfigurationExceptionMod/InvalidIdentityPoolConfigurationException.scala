package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInvalidIdentityPoolConfigurationExceptionMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidIdentityPoolConfigurationException
  extends ServiceException[_InvalidIdentityPoolConfigurationExceptionDetails]
     with GetCredentialsForIdentityExceptionsUnion {
  @JSName("name")
  var name_InvalidIdentityPoolConfigurationException: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.InvalidIdentityPoolConfigurationException
}

object InvalidIdentityPoolConfigurationException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidIdentityPoolConfigurationExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.InvalidIdentityPoolConfigurationException,
    stack: String = null
  ): InvalidIdentityPoolConfigurationException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIdentityPoolConfigurationException]
  }
}

