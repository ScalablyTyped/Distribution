package typings.awsSdkClientCognitoIdentityBrowser.typesTooManyRequestsExceptionMod

import typings.awsSdkClientCognitoIdentityBrowser.createIdentityPoolExceptionsUnionMod.CreateIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.deleteIdentitiesExceptionsUnionMod.DeleteIdentitiesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.deleteIdentityPoolExceptionsUnionMod.DeleteIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.describeIdentityExceptionsUnionMod.DescribeIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.describeIdentityPoolExceptionsUnionMod.DescribeIdentityPoolExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityExceptionsUnionMod.GetCredentialsForIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getIdentityPoolRolesExceptionsUnionMod.GetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenExceptionsUnionMod.GetOpenIdTokenExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.listIdentitiesExceptionsUnionMod.ListIdentitiesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.listIdentityPoolsExceptionsUnionMod.ListIdentityPoolsExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.lookupDeveloperIdentityExceptionsUnionMod.LookupDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.mergeDeveloperIdentitiesExceptionsUnionMod.MergeDeveloperIdentitiesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.unlinkDeveloperIdentityExceptionsUnionMod.UnlinkDeveloperIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.unlinkIdentityExceptionsUnionMod.UnlinkIdentityExceptionsUnion
import typings.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooManyRequestsException
  extends ServiceException[TooManyRequestsExceptionDetails]
     with CreateIdentityPoolExceptionsUnion
     with DeleteIdentitiesExceptionsUnion
     with DeleteIdentityPoolExceptionsUnion
     with DescribeIdentityExceptionsUnion
     with DescribeIdentityPoolExceptionsUnion
     with GetCredentialsForIdentityExceptionsUnion
     with GetIdExceptionsUnion
     with GetIdentityPoolRolesExceptionsUnion
     with GetOpenIdTokenExceptionsUnion
     with GetOpenIdTokenForDeveloperIdentityExceptionsUnion
     with ListIdentitiesExceptionsUnion
     with ListIdentityPoolsExceptionsUnion
     with LookupDeveloperIdentityExceptionsUnion
     with MergeDeveloperIdentitiesExceptionsUnion
     with SetIdentityPoolRolesExceptionsUnion
     with UnlinkDeveloperIdentityExceptionsUnion
     with UnlinkIdentityExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_TooManyRequestsException: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException
}

object TooManyRequestsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TooManyRequestsExceptionDetails,
    message: String,
    name: typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.TooManyRequestsException,
    stack: String = null
  ): TooManyRequestsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooManyRequestsException]
  }
}

