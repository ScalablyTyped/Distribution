package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.awsSdkConfigResolverBooleans.`true`
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveEndpointsConfigMod.EndpointsInputConfig
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveEndpointsConfigMod.EndpointsResolvedConfig
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsConfigResolveCustomEndpointsConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig/resolveCustomEndpointsConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveCustomEndpointsConfig[T](input: T & CustomEndpointsInputConfig & PreviouslyResolved): T & CustomEndpointsResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCustomEndpointsConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & CustomEndpointsResolvedConfig]
  
  trait CustomEndpointsInputConfig
    extends StObject
       with EndpointsInputConfig {
    
    /**
      * The fully qualified endpoint of the webservice.
      */
    @JSName("endpoint")
    var endpoint_CustomEndpointsInputConfig: String | Endpoint | Provider[Endpoint]
  }
  object CustomEndpointsInputConfig {
    
    inline def apply(endpoint: String | Endpoint | Provider[Endpoint]): CustomEndpointsInputConfig = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEndpointsInputConfig]
    }
    
    extension [Self <: CustomEndpointsInputConfig](x: Self) {
      
      inline def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointFunction0(value: () => js.Promise[Endpoint]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
    }
  }
  
  trait CustomEndpointsResolvedConfig
    extends StObject
       with EndpointsResolvedConfig {
    
    /**
      * Whether the endpoint is specified by caller.
      * @internal
      */
    @JSName("isCustomEndpoint")
    var isCustomEndpoint_CustomEndpointsResolvedConfig: `true`
  }
  object CustomEndpointsResolvedConfig {
    
    inline def apply(
      endpoint: () => js.Promise[Endpoint],
      tls: Boolean,
      useDualstackEndpoint: () => js.Promise[Boolean]
    ): CustomEndpointsResolvedConfig = {
      val __obj = js.Dynamic.literal(endpoint = js.Any.fromFunction0(endpoint), isCustomEndpoint = true, tls = tls.asInstanceOf[js.Any], useDualstackEndpoint = js.Any.fromFunction0(useDualstackEndpoint))
      __obj.asInstanceOf[CustomEndpointsResolvedConfig]
    }
    
    extension [Self <: CustomEndpointsResolvedConfig](x: Self) {
      
      inline def setIsCustomEndpoint(value: `true`): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviouslyResolved extends StObject {
    
    def urlParser(url: String): Endpoint
    def urlParser(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
  }
  object PreviouslyResolved {
    
    inline def apply(urlParser: /* url */ String | URL => Endpoint): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(urlParser = js.Any.fromFunction1(urlParser))
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
    }
  }
}
