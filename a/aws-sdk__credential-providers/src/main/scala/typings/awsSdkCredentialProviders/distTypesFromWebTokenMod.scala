package typings.awsSdkCredentialProviders

import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromWebTokenMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromWebToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromWebToken(init: FromWebTokenInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebToken")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  trait FromWebTokenInit
    extends StObject
       with typings.awsSdkCredentialProviderWebIdentity.distTypesFromWebTokenMod.FromWebTokenInit {
    
    var clientConfig: js.UndefOr[STSClientConfig] = js.undefined
    
    var clientPlugins: js.UndefOr[js.Array[Pluggable[Any, Any]]] = js.undefined
  }
  object FromWebTokenInit {
    
    inline def apply(RoleArn: String, RoleSessionName: String, WebIdentityToken: String): FromWebTokenInit = {
      val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any], WebIdentityToken = WebIdentityToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromWebTokenInit]
    }
    
    extension [Self <: FromWebTokenInit](x: Self) {
      
      inline def setClientConfig(value: STSClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setClientPlugins(value: js.Array[Pluggable[Any, Any]]): Self = StObject.set(x, "clientPlugins", value.asInstanceOf[js.Any])
      
      inline def setClientPluginsUndefined: Self = StObject.set(x, "clientPlugins", js.undefined)
      
      inline def setClientPluginsVarargs(value: (Pluggable[Any, Any])*): Self = StObject.set(x, "clientPlugins", js.Array(value*))
    }
  }
}
