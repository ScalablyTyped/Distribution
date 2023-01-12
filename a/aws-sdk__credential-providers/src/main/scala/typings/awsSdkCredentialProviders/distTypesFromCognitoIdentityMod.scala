package typings.awsSdkCredentialProviders

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientConfig
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesLoginsMod.Logins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromCognitoIdentityMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromCognitoIdentity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCognitoIdentity(options: FromCognitoIdentityParameters): typings.awsSdkCredentialProviderCognitoIdentity.distTypesFromCognitoIdentityMod.CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentity")(options.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkCredentialProviderCognitoIdentity.distTypesFromCognitoIdentityMod.CognitoIdentityCredentialProvider]
  
  type CognitoIdentityCredentialProvider = typings.awsSdkCredentialProviderCognitoIdentity.distTypesFromCognitoIdentityMod.CognitoIdentityCredentialProvider
  
  /* Inlined parent std.Omit<@aws-sdk/credential-provider-cognito-identity.@aws-sdk/credential-provider-cognito-identity.FromCognitoIdentityParameters, 'client'> */
  trait FromCognitoIdentityParameters extends StObject {
    
    /**
      * Custom client configuration if you need overwrite default Cognito Identity client configuration.
      */
    var clientConfig: js.UndefOr[CognitoIdentityClientConfig] = js.undefined
    
    var customRoleArn: js.UndefOr[String] = js.undefined
    
    var identityId: String
    
    var logins: js.UndefOr[Logins] = js.undefined
  }
  object FromCognitoIdentityParameters {
    
    inline def apply(identityId: String): FromCognitoIdentityParameters = {
      val __obj = js.Dynamic.literal(identityId = identityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromCognitoIdentityParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromCognitoIdentityParameters] (val x: Self) extends AnyVal {
      
      inline def setClientConfig(value: CognitoIdentityClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setCustomRoleArn(value: String): Self = StObject.set(x, "customRoleArn", value.asInstanceOf[js.Any])
      
      inline def setCustomRoleArnUndefined: Self = StObject.set(x, "customRoleArn", js.undefined)
      
      inline def setIdentityId(value: String): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
      
      inline def setLogins(value: Logins): Self = StObject.set(x, "logins", value.asInstanceOf[js.Any])
      
      inline def setLoginsUndefined: Self = StObject.set(x, "logins", js.undefined)
    }
  }
}
