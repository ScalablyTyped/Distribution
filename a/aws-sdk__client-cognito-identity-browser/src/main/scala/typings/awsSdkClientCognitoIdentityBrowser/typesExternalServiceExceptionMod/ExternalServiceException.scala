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

@js.native
trait ExternalServiceException
  extends ServiceException[ExternalServiceExceptionDetails]
     with GetCredentialsForIdentityExceptionsUnion
     with GetIdExceptionsUnion
     with GetOpenIdTokenExceptionsUnion
     with UnlinkIdentityExceptionsUnion {
  @JSName("name")
  var name_ExternalServiceException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException = js.native
}

object ExternalServiceException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExternalServiceExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
  ): ExternalServiceException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalServiceException]
  }
  @scala.inline
  implicit class ExternalServiceExceptionOps[Self <: ExternalServiceException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ExternalServiceException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

