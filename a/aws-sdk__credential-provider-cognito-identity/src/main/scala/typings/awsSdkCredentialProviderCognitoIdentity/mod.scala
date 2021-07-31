package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod.FromCognitoIdentityParameters
import typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentity")(parameters.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  @scala.inline
  def fromCognitoIdentityPool(
    hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier: FromCognitoIdentityPoolParameters
  ): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentityPool")(hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
