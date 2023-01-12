package typings.awsSdkCredentialProviders

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientConfig
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesFromCognitoIdentityMod.CognitoIdentityCredentialProvider
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesLoginsMod.Logins
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesStorageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromCognitoIdentityPoolMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromCognitoIdentityPool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCognitoIdentityPool(options: FromCognitoIdentityPoolParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentityPool")(options.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  /* Inlined parent std.Omit<@aws-sdk/credential-provider-cognito-identity.@aws-sdk/credential-provider-cognito-identity.FromCognitoIdentityPoolParameters, 'client'> */
  trait FromCognitoIdentityPoolParameters extends StObject {
    
    var accountId: js.UndefOr[String] = js.undefined
    
    var cache: js.UndefOr[Storage] = js.undefined
    
    var clientConfig: js.UndefOr[CognitoIdentityClientConfig] = js.undefined
    
    var customRoleArn: js.UndefOr[String] = js.undefined
    
    var identityPoolId: String
    
    var logins: js.UndefOr[Logins] = js.undefined
    
    var userIdentifier: js.UndefOr[String] = js.undefined
  }
  object FromCognitoIdentityPoolParameters {
    
    inline def apply(identityPoolId: String): FromCognitoIdentityPoolParameters = {
      val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromCognitoIdentityPoolParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromCognitoIdentityPoolParameters] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setCache(value: Storage): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setClientConfig(value: CognitoIdentityClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setCustomRoleArn(value: String): Self = StObject.set(x, "customRoleArn", value.asInstanceOf[js.Any])
      
      inline def setCustomRoleArnUndefined: Self = StObject.set(x, "customRoleArn", js.undefined)
      
      inline def setIdentityPoolId(value: String): Self = StObject.set(x, "identityPoolId", value.asInstanceOf[js.Any])
      
      inline def setLogins(value: Logins): Self = StObject.set(x, "logins", value.asInstanceOf[js.Any])
      
      inline def setLoginsUndefined: Self = StObject.set(x, "logins", js.undefined)
      
      inline def setUserIdentifier(value: String): Self = StObject.set(x, "userIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUserIdentifierUndefined: Self = StObject.set(x, "userIdentifier", js.undefined)
    }
  }
}
