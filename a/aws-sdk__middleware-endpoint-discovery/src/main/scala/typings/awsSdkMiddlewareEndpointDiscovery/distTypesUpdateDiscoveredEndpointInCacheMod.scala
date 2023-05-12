package typings.awsSdkMiddlewareEndpointDiscovery

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesGetEndpointDiscoveryPluginMod.EndpointDiscoveryMiddlewareConfig
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.EndpointDiscoveryResolvedConfig
import typings.awsSdkMiddlewareEndpointDiscovery.distTypesResolveEndpointDiscoveryConfigMod.PreviouslyResolved
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUpdateDiscoveredEndpointInCacheMod {
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery/dist-types/updateDiscoveredEndpointInCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateDiscoveredEndpointInCache(
    config: EndpointDiscoveryResolvedConfig & PreviouslyResolved,
    options: UpdateDiscoveredEndpointInCacheOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDiscoveredEndpointInCache")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait UpdateDiscoveredEndpointInCacheOptions
    extends StObject
       with EndpointDiscoveryMiddlewareConfig {
    
    var cacheKey: String
    
    var commandName: String
    
    var endpointDiscoveryCommandCtor: Instantiable1[/* comandConfig */ Any, Any]
  }
  object UpdateDiscoveredEndpointInCacheOptions {
    
    inline def apply(
      cacheKey: String,
      clientStack: MiddlewareStack[Any, Any],
      commandName: String,
      endpointDiscoveryCommandCtor: Instantiable1[/* comandConfig */ Any, Any],
      isDiscoveredEndpointRequired: Boolean
    ): UpdateDiscoveredEndpointInCacheOptions = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], clientStack = clientStack.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], endpointDiscoveryCommandCtor = endpointDiscoveryCommandCtor.asInstanceOf[js.Any], isDiscoveredEndpointRequired = isDiscoveredEndpointRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateDiscoveredEndpointInCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateDiscoveredEndpointInCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
      
      inline def setEndpointDiscoveryCommandCtor(value: Instantiable1[/* comandConfig */ Any, Any]): Self = StObject.set(x, "endpointDiscoveryCommandCtor", value.asInstanceOf[js.Any])
    }
  }
}
