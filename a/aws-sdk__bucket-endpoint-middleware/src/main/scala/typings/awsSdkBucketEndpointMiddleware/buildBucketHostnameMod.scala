package typings.awsSdkBucketEndpointMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildBucketHostnameMod {
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware/build/bucketHostname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bucketHostname(param0: BucketHostnameParameters): BucketHostname_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketHostname")(param0.asInstanceOf[js.Any]).asInstanceOf[BucketHostname_]
  
  trait BucketHostnameParameters extends StObject {
    
    var accelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var baseHostname: String
    
    var bucketName: String
    
    var dualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var pathStyleEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var sslCompatible: js.UndefOr[Boolean] = js.undefined
  }
  object BucketHostnameParameters {
    
    inline def apply(baseHostname: String, bucketName: String): BucketHostnameParameters = {
      val __obj = js.Dynamic.literal(baseHostname = baseHostname.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketHostnameParameters]
    }
    
    extension [Self <: BucketHostnameParameters](x: Self) {
      
      inline def setAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "accelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAccelerateEndpointUndefined: Self = StObject.set(x, "accelerateEndpoint", js.undefined)
      
      inline def setBaseHostname(value: String): Self = StObject.set(x, "baseHostname", value.asInstanceOf[js.Any])
      
      inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setDualstackEndpoint(value: Boolean): Self = StObject.set(x, "dualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setDualstackEndpointUndefined: Self = StObject.set(x, "dualstackEndpoint", js.undefined)
      
      inline def setPathStyleEndpoint(value: Boolean): Self = StObject.set(x, "pathStyleEndpoint", value.asInstanceOf[js.Any])
      
      inline def setPathStyleEndpointUndefined: Self = StObject.set(x, "pathStyleEndpoint", js.undefined)
      
      inline def setSslCompatible(value: Boolean): Self = StObject.set(x, "sslCompatible", value.asInstanceOf[js.Any])
      
      inline def setSslCompatibleUndefined: Self = StObject.set(x, "sslCompatible", js.undefined)
    }
  }
  
  trait BucketHostname_ extends StObject {
    
    var bucketEndpoint: Boolean
    
    var hostname: String
  }
  object BucketHostname_ {
    
    inline def apply(bucketEndpoint: Boolean, hostname: String): BucketHostname_ = {
      val __obj = js.Dynamic.literal(bucketEndpoint = bucketEndpoint.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketHostname_]
    }
    
    extension [Self <: BucketHostname_](x: Self) {
      
      inline def setBucketEndpoint(value: Boolean): Self = StObject.set(x, "bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    }
  }
}
