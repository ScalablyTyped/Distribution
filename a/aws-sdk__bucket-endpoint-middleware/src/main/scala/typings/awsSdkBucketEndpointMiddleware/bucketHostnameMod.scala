package typings.awsSdkBucketEndpointMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketHostnameMod {
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware/build/bucketHostname", "bucketHostname")
  @js.native
  def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname_ = js.native
  
  @js.native
  trait BucketHostnameParameters extends StObject {
    
    var accelerateEndpoint: js.UndefOr[Boolean] = js.native
    
    var baseHostname: String = js.native
    
    var bucketName: String = js.native
    
    var dualstackEndpoint: js.UndefOr[Boolean] = js.native
    
    var pathStyleEndpoint: js.UndefOr[Boolean] = js.native
    
    var sslCompatible: js.UndefOr[Boolean] = js.native
  }
  object BucketHostnameParameters {
    
    @scala.inline
    def apply(baseHostname: String, bucketName: String): BucketHostnameParameters = {
      val __obj = js.Dynamic.literal(baseHostname = baseHostname.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketHostnameParameters]
    }
    
    @scala.inline
    implicit class BucketHostnameParametersMutableBuilder[Self <: BucketHostnameParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "accelerateEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerateEndpointUndefined: Self = StObject.set(x, "accelerateEndpoint", js.undefined)
      
      @scala.inline
      def setBaseHostname(value: String): Self = StObject.set(x, "baseHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDualstackEndpoint(value: Boolean): Self = StObject.set(x, "dualstackEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDualstackEndpointUndefined: Self = StObject.set(x, "dualstackEndpoint", js.undefined)
      
      @scala.inline
      def setPathStyleEndpoint(value: Boolean): Self = StObject.set(x, "pathStyleEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathStyleEndpointUndefined: Self = StObject.set(x, "pathStyleEndpoint", js.undefined)
      
      @scala.inline
      def setSslCompatible(value: Boolean): Self = StObject.set(x, "sslCompatible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCompatibleUndefined: Self = StObject.set(x, "sslCompatible", js.undefined)
    }
  }
  
  @js.native
  trait BucketHostname_ extends StObject {
    
    var bucketEndpoint: Boolean = js.native
    
    var hostname: String = js.native
  }
  object BucketHostname_ {
    
    @scala.inline
    def apply(bucketEndpoint: Boolean, hostname: String): BucketHostname_ = {
      val __obj = js.Dynamic.literal(bucketEndpoint = bucketEndpoint.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketHostname_]
    }
    
    @scala.inline
    implicit class BucketHostname_MutableBuilder[Self <: BucketHostname_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketEndpoint(value: Boolean): Self = StObject.set(x, "bucketEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    }
  }
}
