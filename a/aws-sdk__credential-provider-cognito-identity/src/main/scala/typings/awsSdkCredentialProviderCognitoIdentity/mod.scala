package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod.CognitoIdentityCredentialProvider
import typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod.FromCognitoIdentityParameters
import typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentity")(parameters.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  inline def fromCognitoIdentityPool(
    hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier: FromCognitoIdentityPoolParameters
  ): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentityPool")(hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
}
