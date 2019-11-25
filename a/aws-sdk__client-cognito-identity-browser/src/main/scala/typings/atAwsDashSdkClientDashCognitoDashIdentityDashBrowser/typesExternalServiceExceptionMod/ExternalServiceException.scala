package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesExternalServiceExceptionMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalServiceException
  extends ServiceException[_ExternalServiceExceptionDetails]
     with GetCredentialsForIdentityExceptionsUnion
     with GetIdExceptionsUnion
     with GetOpenIdTokenExceptionsUnion
     with UnlinkIdentityExceptionsUnion {
  @JSName("name")
  var name_ExternalServiceException: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.ExternalServiceException
}

object ExternalServiceException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ExternalServiceExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.ExternalServiceException,
    stack: String = null
  ): ExternalServiceException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalServiceException]
  }
}

