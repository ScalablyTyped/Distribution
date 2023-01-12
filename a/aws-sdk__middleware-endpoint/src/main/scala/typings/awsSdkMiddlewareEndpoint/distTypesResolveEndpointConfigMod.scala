package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.anon.Logger
import typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveEndpointConfigMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/resolveEndpointConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveEndpointConfig[T, P /* <: EndpointParameters */](input: T & EndpointInputConfig[P] & PreviouslyResolved[P]): T & EndpointResolvedConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointResolvedConfig[P]]
  
  trait EndpointInputConfig[T /* <: EndpointParameters */] extends StObject {
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using
      * a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2] = js.undefined
    
    var endpointProvider: js.UndefOr[js.Function2[/* params */ T, /* context */ js.UndefOr[Logger], EndpointV2]] = js.undefined
    
    /**
      * Whether TLS is enabled for requests.
      * @deprecated
      */
    var tls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * Enables FIPS compatible endpoints.
      */
    var useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
  }
  object EndpointInputConfig {
    
    inline def apply[T /* <: EndpointParameters */](): EndpointInputConfig[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointInputConfig[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointInputConfig[?], T /* <: EndpointParameters */] (val x: Self & EndpointInputConfig[T]) extends AnyVal {
      
      inline def setEndpoint(value: String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointFunction0(value: () => js.Promise[Endpoint | EndpointV2]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      inline def setEndpointProvider(value: (/* params */ T, /* context */ js.UndefOr[Logger]) => EndpointV2): Self = StObject.set(x, "endpointProvider", js.Any.fromFunction2(value))
      
      inline def setEndpointProviderUndefined: Self = StObject.set(x, "endpointProvider", js.undefined)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useFipsEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
    }
  }
  
  @js.native
  trait EndpointResolvedConfig[T /* <: EndpointParameters */] extends StObject {
    
    /**
      * Custom endpoint provided by the user.
      * This is normalized to a single interface from the various acceptable types.
      * This field will be undefined if a custom endpoint is not provided.
      *
      * As of endpoints 2.0, this config method can not be used to resolve
      * the endpoint for a service and region.
      *
      * @see https://github.com/aws/aws-sdk-js-v3/issues/4122
      * @deprecated Use {@link EndpointResolvedConfig.endpointProvider} instead.
      */
    var endpoint: js.UndefOr[Provider[Endpoint]] = js.native
    
    def endpointProvider(params: T): EndpointV2 = js.native
    def endpointProvider(params: T, context: Logger): EndpointV2 = js.native
    
    /**
      * Whether the endpoint is specified by caller.
      * @internal
      * @deprecated
      */
    var isCustomEndpoint: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether TLS is enabled for requests.
      * @deprecated
      */
    var tls: Boolean = js.native
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    def useDualstackEndpoint(): js.Promise[Boolean] = js.native
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean] = js.native
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.useFipsEndpoint}
      */
    def useFipsEndpoint(): js.Promise[Boolean] = js.native
    /**
      * Resolved value for input {@link EndpointsInputConfig.useFipsEndpoint}
      */
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean] = js.native
  }
  
  @js.native
  trait PreviouslyResolved[T /* <: EndpointParameters */] extends StObject {
    
    def endpointProvider(params: T): EndpointV2 = js.native
    def endpointProvider(params: T, context: Logger): EndpointV2 = js.native
    
    var logger: js.UndefOr[typings.awsSdkTypes.distTypesLoggerMod.Logger] = js.native
    
    def region(): js.Promise[String] = js.native
    @JSName("region")
    var region_Original: Provider[String] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
  }
}
