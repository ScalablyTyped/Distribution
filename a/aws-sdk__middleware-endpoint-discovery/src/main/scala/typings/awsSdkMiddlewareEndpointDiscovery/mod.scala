package typings.awsSdkMiddlewareEndpointDiscovery

import typings.awsSdkMiddlewareEndpointDiscovery.anon.OmitEndpointDiscoveryMidd
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesGetEndpointDiscoveryPluginMod.EndpointDiscoveryMiddlewareConfig
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.EndpointDiscoveryConfigOptions
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.EndpointDiscoveryInputConfig
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.EndpointDiscoveryResolvedConfig
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.PreviouslyResolved
import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery", "NODE_ENDPOINT_DISCOVERY_CONFIG_OPTIONS")
  @js.native
  val NODE_ENDPOINT_DISCOVERY_CONFIG_OPTIONS: LoadedConfigSelectors[js.UndefOr[Boolean]] = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery", "endpointDiscoveryMiddlewareOptions")
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
  
  inline def resolveEndpointDiscoveryConfig[T](
    input: T & PreviouslyResolved & EndpointDiscoveryInputConfig,
    param1: EndpointDiscoveryConfigOptions
  ): T & EndpointDiscoveryResolvedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointDiscoveryConfig")(input.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[T & EndpointDiscoveryResolvedConfig]
}
