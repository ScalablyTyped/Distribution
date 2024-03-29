package typings.awsSdkCredentialProviders

import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClientConfig
import typings.awsSdkClientSso.mod.SSOClient
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromSSOMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromSSO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSSO(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromSSO(init: FromSSOInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  /* Inlined parent std.Omit<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso.FromSSOInit, 'client'> */
  trait FromSSOInit extends StObject {
    
    var clientConfig: js.UndefOr[SSOClientConfig] = js.undefined
    
    var configFilepath: js.UndefOr[String] = js.undefined
    
    var filepath: js.UndefOr[String] = js.undefined
    
    var ignoreCache: js.UndefOr[Boolean] = js.undefined
    
    var profile: js.UndefOr[String] = js.undefined
    
    var ssoClient: js.UndefOr[SSOClient] = js.undefined
  }
  object FromSSOInit {
    
    inline def apply(): FromSSOInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromSSOInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromSSOInit] (val x: Self) extends AnyVal {
      
      inline def setClientConfig(value: SSOClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setConfigFilepath(value: String): Self = StObject.set(x, "configFilepath", value.asInstanceOf[js.Any])
      
      inline def setConfigFilepathUndefined: Self = StObject.set(x, "configFilepath", js.undefined)
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      inline def setIgnoreCache(value: Boolean): Self = StObject.set(x, "ignoreCache", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCacheUndefined: Self = StObject.set(x, "ignoreCache", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSsoClient(value: SSOClient): Self = StObject.set(x, "ssoClient", value.asInstanceOf[js.Any])
      
      inline def setSsoClientUndefined: Self = StObject.set(x, "ssoClient", js.undefined)
    }
  }
}
