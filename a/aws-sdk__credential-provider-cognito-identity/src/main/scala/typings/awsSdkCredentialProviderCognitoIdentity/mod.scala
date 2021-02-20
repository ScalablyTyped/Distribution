package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod.FromCognitoIdentityParameters
import typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity", "fromCognitoIdentity")
  @js.native
  def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CredentialProvider = js.native
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity", "fromCognitoIdentityPool")
  @js.native
  def fromCognitoIdentityPool(
    hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier: FromCognitoIdentityPoolParameters
  ): CredentialProvider = js.native
}
