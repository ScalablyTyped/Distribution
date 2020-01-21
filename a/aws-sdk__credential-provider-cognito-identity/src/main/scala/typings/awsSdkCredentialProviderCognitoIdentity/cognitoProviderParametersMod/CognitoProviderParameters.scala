package typings.awsSdkCredentialProviderCognitoIdentity.cognitoProviderParametersMod

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityClientMod.CognitoIdentityClient
import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.Logins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoProviderParameters extends js.Object {
  /**
    * The SDK client with which the credential provider will contact the Amazon
    * Cognito service.
    */
  var client: CognitoIdentityClient
  /**
    * The Amazon Resource Name (ARN) of the role to be assumed when multiple
    * roles were received in the token from the identity provider. For example,
    * a SAML-based identity provider. This parameter is optional for identity
    * providers that do not support role customization.
    */
  var customRoleArn: js.UndefOr[String] = js.undefined
  /**
    * A set of key-value pairs that map external identity provider names to
    * login tokens or functions that return promises for login tokens. The
    * latter should be used when login tokens must be periodically refreshed.
    *
    * Logins should not be specified when trying to get credentials for an
    * unauthenticated identity.
    */
  var logins: js.UndefOr[Logins] = js.undefined
}

object CognitoProviderParameters {
  @scala.inline
  def apply(client: CognitoIdentityClient, customRoleArn: String = null, logins: Logins = null): CognitoProviderParameters = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (customRoleArn != null) __obj.updateDynamic("customRoleArn")(customRoleArn.asInstanceOf[js.Any])
    if (logins != null) __obj.updateDynamic("logins")(logins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoProviderParameters]
  }
}

