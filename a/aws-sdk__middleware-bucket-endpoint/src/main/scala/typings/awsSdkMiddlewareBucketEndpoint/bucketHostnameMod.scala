package typings.awsSdkMiddlewareBucketEndpoint

import typings.awsSdkMiddlewareBucketEndpoint.bucketHostnameUtilsMod.ArnHostnameParams
import typings.awsSdkMiddlewareBucketEndpoint.bucketHostnameUtilsMod.BucketHostnameParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketHostnameMod {
  
  @JSImport("@aws-sdk/middleware-bucket-endpoint/dist-types/bucketHostname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bucketHostname(options: ArnHostnameParams): BucketHostname_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketHostname")(options.asInstanceOf[js.Any]).asInstanceOf[BucketHostname_]
  inline def bucketHostname(options: BucketHostnameParams): BucketHostname_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketHostname")(options.asInstanceOf[js.Any]).asInstanceOf[BucketHostname_]
  
  trait BucketHostname_ extends StObject {
    
    var bucketEndpoint: Boolean
    
    var hostname: String
    
    var signingRegion: js.UndefOr[String] = js.undefined
    
    var signingService: js.UndefOr[String] = js.undefined
  }
  object BucketHostname_ {
    
    inline def apply(bucketEndpoint: Boolean, hostname: String): BucketHostname_ = {
      val __obj = js.Dynamic.literal(bucketEndpoint = bucketEndpoint.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketHostname_]
    }
    
    extension [Self <: BucketHostname_](x: Self) {
      
      inline def setBucketEndpoint(value: Boolean): Self = StObject.set(x, "bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      inline def setSigningService(value: String): Self = StObject.set(x, "signingService", value.asInstanceOf[js.Any])
      
      inline def setSigningServiceUndefined: Self = StObject.set(x, "signingService", js.undefined)
    }
  }
}
