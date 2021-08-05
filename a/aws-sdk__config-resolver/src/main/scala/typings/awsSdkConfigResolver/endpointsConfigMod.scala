package typings.awsSdkConfigResolver

import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RegionInfo
import typings.awsSdkTypes.utilMod.RegionInfoProvider
import typings.awsSdkTypes.utilMod.UrlParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointsConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist/cjs/EndpointsConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveEndpointsConfig[T](input: T & EndpointsInputConfig & PreviouslyResolved): T & EndpointsResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointsConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointsResolvedConfig]
  
  trait EndpointsInputConfig extends StObject {
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.undefined
    
    /**
      * Whether TLS is enabled for requests.
      */
    var tls: js.UndefOr[Boolean] = js.undefined
  }
  object EndpointsInputConfig {
    
    inline def apply(): EndpointsInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointsInputConfig]
    }
    
    extension [Self <: EndpointsInputConfig](x: Self) {
      
      inline def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointFunction0(value: () => js.Promise[Endpoint]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
  
  /* Inlined parent std.Required<@aws-sdk/config-resolver.@aws-sdk/config-resolver/dist/cjs/EndpointsConfig.EndpointsInputConfig> */
  trait EndpointsResolvedConfig extends StObject {
    
    def endpoint(): js.Promise[Endpoint]
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint]
    
    var isCustomEndpoint: Boolean
    
    var tls: Boolean
  }
  object EndpointsResolvedConfig {
    
    inline def apply(endpoint: () => js.Promise[Endpoint], isCustomEndpoint: Boolean, tls: Boolean): EndpointsResolvedConfig = {
      val __obj = js.Dynamic.literal(endpoint = js.Any.fromFunction0(endpoint), isCustomEndpoint = isCustomEndpoint.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointsResolvedConfig]
    }
    
    extension [Self <: EndpointsResolvedConfig](x: Self) {
      
      inline def setEndpoint(value: () => js.Promise[Endpoint]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviouslyResolved extends StObject {
    
    def region(): js.Promise[String]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    @JSName("region")
    var region_Original: Provider[String]
    
    def urlParser(url: String): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
  }
  object PreviouslyResolved {
    
    inline def apply(
      region: () => js.Promise[String],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]],
      urlParser: /* url */ String => Endpoint
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(region = js.Any.fromFunction0(region), regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), urlParser = js.Any.fromFunction1(urlParser))
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setUrlParser(value: /* url */ String => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
    }
  }
}
