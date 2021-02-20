package typings.awsSdkConfigResolver

import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RegionInfo
import typings.awsSdkTypes.utilMod.RegionInfoProvider
import typings.awsSdkTypes.utilMod.UrlParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointsConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist/cjs/EndpointsConfig", "resolveEndpointsConfig")
  @js.native
  def resolveEndpointsConfig[T](input: T with EndpointsInputConfig with PreviouslyResolved): T with EndpointsResolvedConfig = js.native
  
  @js.native
  trait EndpointsInputConfig extends StObject {
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.native
    
    /**
      * Whether TLS is enabled for requests.
      */
    var tls: js.UndefOr[Boolean] = js.native
  }
  object EndpointsInputConfig {
    
    @scala.inline
    def apply(): EndpointsInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointsInputConfig]
    }
    
    @scala.inline
    implicit class EndpointsInputConfigMutableBuilder[Self <: EndpointsInputConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointFunction0(value: () => js.Promise[Endpoint]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
  
  /* Inlined parent std.Required<@aws-sdk/config-resolver.@aws-sdk/config-resolver/dist/cjs/EndpointsConfig.EndpointsInputConfig> */
  @js.native
  trait EndpointsResolvedConfig extends StObject {
    
    def endpoint(): js.Promise[Endpoint] = js.native
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint] = js.native
    
    var isCustomEndpoint: Boolean = js.native
    
    var tls: Boolean = js.native
  }
  
  @js.native
  trait PreviouslyResolved extends StObject {
    
    def region(): js.Promise[String] = js.native
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider = js.native
    
    @JSName("region")
    var region_Original: Provider[String] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
  }
}
