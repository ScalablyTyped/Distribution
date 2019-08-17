package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInvalidIdentityPoolConfigurationExceptionMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _InvalidIdentityPoolConfigurationExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.InvalidIdentityPoolConfigurationException,
    stack: String = null
  ): InvalidIdentityPoolConfigurationException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidIdentityPoolConfigurationException]
  }
}

