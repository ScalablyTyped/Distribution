package typings.awsSdkCredentialProviders

import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typings.awsSdkCredentialProviderNode.distTypesDefaultProviderMod.DefaultProviderInit
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromNodeProviderChainMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromNodeProviderChain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromNodeProviderChain(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeProviderChain")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromNodeProviderChain(init: fromNodeProviderChainInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeProviderChain")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  trait fromNodeProviderChainInit
    extends StObject
       with DefaultProviderInit {
    
    var clientConfig: js.UndefOr[STSClientConfig] = js.undefined
    
    var clientPlugins: js.UndefOr[js.Array[Pluggable[Any, Any]]] = js.undefined
  }
  object fromNodeProviderChainInit {
    
    inline def apply(): fromNodeProviderChainInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[fromNodeProviderChainInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fromNodeProviderChainInit] (val x: Self) extends AnyVal {
      
      inline def setClientConfig(value: STSClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
      
      inline def setClientPlugins(value: js.Array[Pluggable[Any, Any]]): Self = StObject.set(x, "clientPlugins", value.asInstanceOf[js.Any])
      
      inline def setClientPluginsUndefined: Self = StObject.set(x, "clientPlugins", js.undefined)
      
      inline def setClientPluginsVarargs(value: (Pluggable[Any, Any])*): Self = StObject.set(x, "clientPlugins", js.Array(value*))
    }
  }
}
