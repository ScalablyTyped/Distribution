package typings.awsSdkMiddlewareBucketEndpoint

import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.RegionInfo
import typings.awsSdkTypes.distTypesUtilMod.RegionInfoProvider
import typings.awsSdkTypes.distTypesUtilMod.RegionInfoProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigurationsMod {
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint/dist-types/configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveBucketEndpointConfig[T](input: T & PreviouslyResolved & BucketEndpointInputConfig): T & BucketEndpointResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveBucketEndpointConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & BucketEndpointResolvedConfig]
  
  trait BucketEndpointInputConfig extends StObject {
    
    /**
      * Whether to use the bucket name as the endpoint for this request. The bucket
      * name must be a domain name with a CNAME record alias to an appropriate virtual
      * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
      * record of:
      *
      * ```
      * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
      * ```
      *
      * @see https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html#VirtualHostingCustomURLs
      */
    var bucketEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to prevent SDK from making cross-region request when supplied bucket is a multi-region access point ARN.
      * Defaults to false
      */
    var disableMultiregionAccessPoints: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    var forcePathStyle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to override the request region with the region inferred from requested resource's ARN. Defaults to false
      */
    var useArnRegion: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
  }
  object BucketEndpointInputConfig {
    
    inline def apply(): BucketEndpointInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketEndpointInputConfig]
    }
    
    extension [Self <: BucketEndpointInputConfig](x: Self) {
      
      inline def setBucketEndpoint(value: Boolean): Self = StObject.set(x, "bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setBucketEndpointUndefined: Self = StObject.set(x, "bucketEndpoint", js.undefined)
      
      inline def setDisableMultiregionAccessPoints(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "disableMultiregionAccessPoints", value.asInstanceOf[js.Any])
      
      inline def setDisableMultiregionAccessPointsFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "disableMultiregionAccessPoints", js.Any.fromFunction0(value))
      
      inline def setDisableMultiregionAccessPointsUndefined: Self = StObject.set(x, "disableMultiregionAccessPoints", js.undefined)
      
      inline def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def setForcePathStyleUndefined: Self = StObject.set(x, "forcePathStyle", js.undefined)
      
      inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
      
      inline def setUseArnRegion(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useArnRegion", value.asInstanceOf[js.Any])
      
      inline def setUseArnRegionFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useArnRegion", js.Any.fromFunction0(value))
      
      inline def setUseArnRegionUndefined: Self = StObject.set(x, "useArnRegion", js.undefined)
    }
  }
  
  trait BucketEndpointResolvedConfig extends StObject {
    
    /**
      * Resolved value for input config {@link BucketEndpointInputConfig.bucketEndpoint}
      */
    var bucketEndpoint: Boolean
    
    def disableMultiregionAccessPoints(): js.Promise[Boolean]
    @JSName("disableMultiregionAccessPoints")
    var disableMultiregionAccessPoints_Original: Provider[Boolean]
    
    /**
      * Resolved value for input config {@link BucketEndpointInputConfig.forcePathStyle}
      */
    var forcePathStyle: Boolean
    
    /**
      * Whether the endpoint is specified by caller.
      * @internal
      */
    var isCustomEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    def region(): js.Promise[String]
    
    /**
      * Fetch related hostname, signing name or signing region with given region.
      * @internal
      */
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    /**
      * Fetch related hostname, signing name or signing region with given region.
      * @internal
      */
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    @JSName("region")
    var region_Original: Provider[String]
    
    /**
      * Resolved value for input config {@link BucketEndpointInputConfig.useAccelerateEndpoint}
      */
    var useAccelerateEndpoint: Boolean
    
    /**
      * Resolved value for input config {@link BucketEndpointInputConfig.useArnRegion}
      */
    def useArnRegion(): js.Promise[Boolean]
    /**
      * Resolved value for input config {@link BucketEndpointInputConfig.useArnRegion}
      */
    @JSName("useArnRegion")
    var useArnRegion_Original: Provider[Boolean]
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    def useDualstackEndpoint(): js.Promise[Boolean]
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean]
    
    /**
      * Enables FIPS compatible endpoints.
      */
    def useFipsEndpoint(): js.Promise[Boolean]
    /**
      * Enables FIPS compatible endpoints.
      */
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean]
  }
  object BucketEndpointResolvedConfig {
    
    inline def apply(
      bucketEndpoint: Boolean,
      disableMultiregionAccessPoints: () => js.Promise[Boolean],
      forcePathStyle: Boolean,
      region: () => js.Promise[String],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      useAccelerateEndpoint: Boolean,
      useArnRegion: () => js.Promise[Boolean],
      useDualstackEndpoint: () => js.Promise[Boolean],
      useFipsEndpoint: () => js.Promise[Boolean]
    ): BucketEndpointResolvedConfig = {
      val __obj = js.Dynamic.literal(bucketEndpoint = bucketEndpoint.asInstanceOf[js.Any], disableMultiregionAccessPoints = js.Any.fromFunction0(disableMultiregionAccessPoints), forcePathStyle = forcePathStyle.asInstanceOf[js.Any], region = js.Any.fromFunction0(region), regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), useAccelerateEndpoint = useAccelerateEndpoint.asInstanceOf[js.Any], useArnRegion = js.Any.fromFunction0(useArnRegion), useDualstackEndpoint = js.Any.fromFunction0(useDualstackEndpoint), useFipsEndpoint = js.Any.fromFunction0(useFipsEndpoint))
      __obj.asInstanceOf[BucketEndpointResolvedConfig]
    }
    
    extension [Self <: BucketEndpointResolvedConfig](x: Self) {
      
      inline def setBucketEndpoint(value: Boolean): Self = StObject.set(x, "bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setDisableMultiregionAccessPoints(value: () => js.Promise[Boolean]): Self = StObject.set(x, "disableMultiregionAccessPoints", js.Any.fromFunction0(value))
      
      inline def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpointUndefined: Self = StObject.set(x, "isCustomEndpoint", js.undefined)
      
      inline def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseArnRegion(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useArnRegion", js.Any.fromFunction0(value))
      
      inline def setUseDualstackEndpoint(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseFipsEndpoint(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useFipsEndpoint", js.Any.fromFunction0(value))
    }
  }
  
  trait PreviouslyResolved extends StObject {
    
    var isCustomEndpoint: js.UndefOr[Boolean] = js.undefined
    
    def region(): js.Promise[String]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    @JSName("region")
    var region_Original: Provider[String]
    
    def useDualstackEndpoint(): js.Promise[Boolean]
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean]
    
    def useFipsEndpoint(): js.Promise[Boolean]
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean]
  }
  object PreviouslyResolved {
    
    inline def apply(
      region: () => js.Promise[String],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]],
      useDualstackEndpoint: () => js.Promise[Boolean],
      useFipsEndpoint: () => js.Promise[Boolean]
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(region = js.Any.fromFunction0(region), regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), useDualstackEndpoint = js.Any.fromFunction0(useDualstackEndpoint), useFipsEndpoint = js.Any.fromFunction0(useFipsEndpoint))
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpointUndefined: Self = StObject.set(x, "isCustomEndpoint", js.undefined)
      
      inline def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setUseDualstackEndpoint(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseFipsEndpoint(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useFipsEndpoint", js.Any.fromFunction0(value))
    }
  }
}
