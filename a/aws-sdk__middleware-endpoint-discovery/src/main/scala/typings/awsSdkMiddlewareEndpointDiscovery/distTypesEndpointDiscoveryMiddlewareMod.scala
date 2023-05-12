package typings.awsSdkMiddlewareEndpointDiscovery

import typings.awsSdkMiddlewareEndpointDiscovery.distTypesGetEndpointDiscoveryPluginMod.EndpointDiscoveryMiddlewareConfig
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.EndpointDiscoveryResolvedConfig
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointDiscoveryMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery/dist-types/endpointDiscoveryMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointDiscoveryMiddleware(
    config: EndpointDiscoveryResolvedConfig & PreviouslyResolved,
    middlewareConfig: EndpointDiscoveryMiddlewareConfig
  ): js.Function2[
    /* next */ BuildHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    BuildHandler[Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointDiscoveryMiddleware")(config.asInstanceOf[js.Any], middlewareConfig.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* next */ BuildHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    BuildHandler[Any, MetadataBearer]
  ]]
}
