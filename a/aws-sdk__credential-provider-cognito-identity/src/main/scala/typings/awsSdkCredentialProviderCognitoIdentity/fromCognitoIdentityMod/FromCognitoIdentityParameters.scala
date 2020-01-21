package typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityClientMod.CognitoIdentityClient
import typings.awsSdkCredentialProviderCognitoIdentity.cognitoProviderParametersMod.CognitoProviderParameters
import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.Logins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromCognitoIdentityParameters extends CognitoProviderParameters {
  /**
    * The unique identifier for the identity against which credentials will be
    * issued.
    */
  var identityId: String
}

object FromCognitoIdentityParameters {
  @scala.inline
  def apply(
    client: CognitoIdentityClient,
    identityId: String,
    customRoleArn: String = null,
    logins: Logins = null
  ): FromCognitoIdentityParameters = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any])
    if (customRoleArn != null) __obj.updateDynamic("customRoleArn")(customRoleArn.asInstanceOf[js.Any])
    if (logins != null) __obj.updateDynamic("logins")(logins.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromCognitoIdentityParameters]
  }
}

