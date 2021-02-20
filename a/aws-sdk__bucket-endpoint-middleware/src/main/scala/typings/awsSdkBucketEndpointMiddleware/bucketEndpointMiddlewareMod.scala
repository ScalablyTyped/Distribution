package typings.awsSdkBucketEndpointMiddleware

import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketEndpointMiddlewareMod {
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware/build/bucketEndpointMiddleware", "bucketEndpointMiddleware")
  @js.native
  def bucketEndpointMiddleware(): BuildMiddleware[_, _] = js.native
  @JSImport("@aws-sdk/bucket-endpoint-middleware/build/bucketEndpointMiddleware", "bucketEndpointMiddleware")
  @js.native
  def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[_, _] = js.native
  
  @js.native
  trait BucketEndpointAwareInput extends StObject {
    
    @JSName("$bucketEndpoint")
    var $bucketEndpoint: js.UndefOr[Boolean] = js.native
    
    @JSName("$forcePathStyle")
    var $forcePathStyle: js.UndefOr[Boolean] = js.native
    
    @JSName("$useAccelerateEndpoint")
    var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
    
    @JSName("$useDualstackEndpoint")
    var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
    
    var Bucket: String = js.native
  }
  object BucketEndpointAwareInput {
    
    @scala.inline
    def apply(Bucket: String): BucketEndpointAwareInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketEndpointAwareInput]
    }
    
    @scala.inline
    implicit class BucketEndpointAwareInputMutableBuilder[Self <: BucketEndpointAwareInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$bucketEndpoint(value: Boolean): Self = StObject.set(x, "$bucketEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$bucketEndpointUndefined: Self = StObject.set(x, "$bucketEndpoint", js.undefined)
      
      @scala.inline
      def set$forcePathStyle(value: Boolean): Self = StObject.set(x, "$forcePathStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$forcePathStyleUndefined: Self = StObject.set(x, "$forcePathStyle", js.undefined)
      
      @scala.inline
      def set$useAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "$useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$useAccelerateEndpointUndefined: Self = StObject.set(x, "$useAccelerateEndpoint", js.undefined)
      
      @scala.inline
      def set$useDualstackEndpoint(value: Boolean): Self = StObject.set(x, "$useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$useDualstackEndpointUndefined: Self = StObject.set(x, "$useDualstackEndpoint", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait bucketEndpointMiddlewareConfiguration extends StObject {
    
    var forcePathStyle: js.UndefOr[Boolean] = js.native
    
    var preformedBucketEndpoint: js.UndefOr[Boolean] = js.native
    
    var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
    
    var useDualstackEndpoint: js.UndefOr[Boolean] = js.native
  }
  object bucketEndpointMiddlewareConfiguration {
    
    @scala.inline
    def apply(): bucketEndpointMiddlewareConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[bucketEndpointMiddlewareConfiguration]
    }
    
    @scala.inline
    implicit class bucketEndpointMiddlewareConfigurationMutableBuilder[Self <: bucketEndpointMiddlewareConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcePathStyleUndefined: Self = StObject.set(x, "forcePathStyle", js.undefined)
      
      @scala.inline
      def setPreformedBucketEndpoint(value: Boolean): Self = StObject.set(x, "preformedBucketEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreformedBucketEndpointUndefined: Self = StObject.set(x, "preformedBucketEndpoint", js.undefined)
      
      @scala.inline
      def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
      
      @scala.inline
      def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
    }
  }
}
