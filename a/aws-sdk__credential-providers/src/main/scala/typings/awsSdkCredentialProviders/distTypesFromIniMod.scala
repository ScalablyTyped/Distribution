package typings.awsSdkCredentialProviders

import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromIniMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromIni", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromIni(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")().asInstanceOf[CredentialProvider]
  inline def fromIni(init: FromIniInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  trait FromIniInit
    extends StObject
       with typings.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit {
    
    var clientConfig: js.UndefOr[STSClientConfig] = js.undefined
    
    var clientPlugins: js.UndefOr[js.Array[Pluggable[Any, Any]]] = js.undefined
  }
  object FromIniInit {
    
    inline def apply(): FromIniInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromIniInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromIniInit] (val x: Self) extends AnyVal {
      
      inline def setClientConfig(value: STSClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setClientPlugins(value: js.Array[Pluggable[Any, Any]]): Self = StObject.set(x, "clientPlugins", value.asInstanceOf[js.Any])
      
      inline def setClientPluginsUndefined: Self = StObject.set(x, "clientPlugins", js.undefined)
      
      inline def setClientPluginsVarargs(value: (Pluggable[Any, Any])*): Self = StObject.set(x, "clientPlugins", js.Array(value*))
    }
  }
}
