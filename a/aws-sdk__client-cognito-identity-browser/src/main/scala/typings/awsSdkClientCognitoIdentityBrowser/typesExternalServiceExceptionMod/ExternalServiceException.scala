package typings.awsSdkClientCognitoIdentityBrowser.typesExternalServiceExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.unlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalServiceException
  extends ServiceException[ExternalServiceExceptionDetails]
     with GetCredentialsForIdentityExceptionsUnion
     with GetIdExceptionsUnion
     with GetOpenIdTokenExceptionsUnion
     with UnlinkIdentityExceptionsUnion {
  @JSName("name")
  var name_ExternalServiceException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
}

object ExternalServiceException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExternalServiceExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException,
    stack: String = null
  ): ExternalServiceException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalServiceException]
  }
}

