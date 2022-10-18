package typings.awsSdkConfigResolver

import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.RegionInfo
import typings.awsSdkTypes.distTypesUtilMod.RegionInfoProvider
import typings.awsSdkTypes.distTypesUtilMod.RegionInfoProviderOptions
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsConfigUtilsGetEndpointFromRegionMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig/utils/getEndpointFromRegion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointFromRegion(input: GetEndpointFromRegionOptions): js.Promise[Endpoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointFromRegion")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Endpoint]]
  
  trait GetEndpointFromRegionOptions extends StObject {
    
    def region(): js.Promise[String]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    @JSName("region")
    var region_Original: Provider[String]
    
    var tls: js.UndefOr[Boolean] = js.undefined
    
    def urlParser(url: String): Endpoint
    def urlParser(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    def useDualstackEndpoint(): js.Promise[Boolean]
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean]
    
    def useFipsEndpoint(): js.Promise[Boolean]
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean]
  }
  object GetEndpointFromRegionOptions {
    
    inline def apply(
      region: () => js.Promise[String],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      urlParser: /* url */ String | URL => Endpoint,
      useDualstackEndpoint: () => js.Promise[Boolean],
      useFipsEndpoint: () => js.Promise[Boolean]
    ): GetEndpointFromRegionOptions = {
      val __obj = js.Dynamic.literal(region = js.Any.fromFunction0(region), regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), urlParser = js.Any.fromFunction1(urlParser), useDualstackEndpoint = js.Any.fromFunction0(useDualstackEndpoint), useFipsEndpoint = js.Any.fromFunction0(useFipsEndpoint))
      __obj.asInstanceOf[GetEndpointFromRegionOptions]
    }
    
    extension [Self <: GetEndpointFromRegionOptions](x: Self) {
      
      inline def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUseDualstackEndpoint(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseFipsEndpoint(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useFipsEndpoint", js.Any.fromFunction0(value))
    }
  }
}
