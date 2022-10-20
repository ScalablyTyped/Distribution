package typings.awsSdkCredentialProviders

import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromTokenFileMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromTokenFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromTokenFile(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")().asInstanceOf[CredentialProvider]
  inline def fromTokenFile(init: FromTokenFileInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  trait FromTokenFileInit
    extends StObject
       with typings.awsSdkCredentialProviderWebIdentity.distTypesFromTokenFileMod.FromTokenFileInit {
    
    var clientConfig: js.UndefOr[STSClientConfig] = js.undefined
    
    var clientPlugins: js.UndefOr[js.Array[Pluggable[Any, Any]]] = js.undefined
  }
  object FromTokenFileInit {
    
    inline def apply(): FromTokenFileInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromTokenFileInit]
    }
    
    extension [Self <: FromTokenFileInit](x: Self) {
      
      inline def setClientConfig(value: STSClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setClientPlugins(value: js.Array[Pluggable[Any, Any]]): Self = StObject.set(x, "clientPlugins", value.asInstanceOf[js.Any])
      
      inline def setClientPluginsUndefined: Self = StObject.set(x, "clientPlugins", js.undefined)
      
      inline def setClientPluginsVarargs(value: (Pluggable[Any, Any])*): Self = StObject.set(x, "clientPlugins", js.Array(value*))
    }
  }
}
