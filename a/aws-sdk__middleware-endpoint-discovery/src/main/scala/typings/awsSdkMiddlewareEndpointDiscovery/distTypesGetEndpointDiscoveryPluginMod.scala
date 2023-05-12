package typings.awsSdkMiddlewareEndpointDiscovery

import typings.awsSdkMiddlewareEndpointDiscovery.anon.OmitEndpointDiscoveryMidd
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.EndpointDiscoveryResolvedConfig
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetEndpointDiscoveryPluginMod {
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery/dist-types/getEndpointDiscoveryPlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery/dist-types/getEndpointDiscoveryPlugin", "endpointDiscoveryMiddlewareOptions")
  @js.native
  val endpointDiscoveryMiddlewareOptions: BuildHandlerOptions = js.native
  
  inline def getEndpointDiscoveryOptionalPlugin(
    pluginConfig: EndpointDiscoveryResolvedConfig & PreviouslyResolved,
    middlewareConfig: OmitEndpointDiscoveryMidd
  ): Pluggable[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointDiscoveryOptionalPlugin")(pluginConfig.asInstanceOf[js.Any], middlewareConfig.asInstanceOf[js.Any])).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getEndpointDiscoveryPlugin(
    pluginConfig: EndpointDiscoveryResolvedConfig & PreviouslyResolved,
    middlewareConfig: EndpointDiscoveryMiddlewareConfig
  ): Pluggable[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointDiscoveryPlugin")(pluginConfig.asInstanceOf[js.Any], middlewareConfig.asInstanceOf[js.Any])).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getEndpointDiscoveryRequiredPlugin(
    pluginConfig: EndpointDiscoveryResolvedConfig & PreviouslyResolved,
    middlewareConfig: OmitEndpointDiscoveryMidd
  ): Pluggable[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointDiscoveryRequiredPlugin")(pluginConfig.asInstanceOf[js.Any], middlewareConfig.asInstanceOf[js.Any])).asInstanceOf[Pluggable[Any, Any]]
  
  trait EndpointDiscoveryMiddlewareConfig extends StObject {
    
    var clientStack: MiddlewareStack[Any, Any]
    
    var identifiers: js.UndefOr[Record[String, String]] = js.undefined
    
    var isDiscoveredEndpointRequired: Boolean
    
    var options: js.UndefOr[HttpHandlerOptions] = js.undefined
  }
  object EndpointDiscoveryMiddlewareConfig {
    
    inline def apply(clientStack: MiddlewareStack[Any, Any], isDiscoveredEndpointRequired: Boolean): EndpointDiscoveryMiddlewareConfig = {
      val __obj = js.Dynamic.literal(clientStack = clientStack.asInstanceOf[js.Any], isDiscoveredEndpointRequired = isDiscoveredEndpointRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointDiscoveryMiddlewareConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointDiscoveryMiddlewareConfig] (val x: Self) extends AnyVal {
      
      inline def setClientStack(value: MiddlewareStack[Any, Any]): Self = StObject.set(x, "clientStack", value.asInstanceOf[js.Any])
      
      inline def setIdentifiers(value: Record[String, String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
      
      inline def setIsDiscoveredEndpointRequired(value: Boolean): Self = StObject.set(x, "isDiscoveredEndpointRequired", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: HttpHandlerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
