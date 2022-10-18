package typings.awsSdkBucketEndpointMiddleware

import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildBucketEndpointMiddlewareMod {
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware/build/bucketEndpointMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bucketEndpointMiddleware(): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")().asInstanceOf[BuildMiddleware[Any, Any]]
  inline def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")(hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  trait BucketEndpointAwareInput extends StObject {
    
    @JSName("$bucketEndpoint")
    var $bucketEndpoint: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$forcePathStyle")
    var $forcePathStyle: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$useAccelerateEndpoint")
    var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$useDualstackEndpoint")
    var $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var Bucket: String
  }
  object BucketEndpointAwareInput {
    
    inline def apply(Bucket: String): BucketEndpointAwareInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketEndpointAwareInput]
    }
    
    extension [Self <: BucketEndpointAwareInput](x: Self) {
      
      inline def set$bucketEndpoint(value: Boolean): Self = StObject.set(x, "$bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$bucketEndpointUndefined: Self = StObject.set(x, "$bucketEndpoint", js.undefined)
      
      inline def set$forcePathStyle(value: Boolean): Self = StObject.set(x, "$forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def set$forcePathStyleUndefined: Self = StObject.set(x, "$forcePathStyle", js.undefined)
      
      inline def set$useAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "$useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$useAccelerateEndpointUndefined: Self = StObject.set(x, "$useAccelerateEndpoint", js.undefined)
      
      inline def set$useDualstackEndpoint(value: Boolean): Self = StObject.set(x, "$useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$useDualstackEndpointUndefined: Self = StObject.set(x, "$useDualstackEndpoint", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    }
  }
  
  trait bucketEndpointMiddlewareConfiguration extends StObject {
    
    var forcePathStyle: js.UndefOr[Boolean] = js.undefined
    
    var preformedBucketEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  }
  object bucketEndpointMiddlewareConfiguration {
    
    inline def apply(): bucketEndpointMiddlewareConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[bucketEndpointMiddlewareConfiguration]
    }
    
    extension [Self <: bucketEndpointMiddlewareConfiguration](x: Self) {
      
      inline def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def setForcePathStyleUndefined: Self = StObject.set(x, "forcePathStyle", js.undefined)
      
      inline def setPreformedBucketEndpoint(value: Boolean): Self = StObject.set(x, "preformedBucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setPreformedBucketEndpointUndefined: Self = StObject.set(x, "preformedBucketEndpoint", js.undefined)
      
      inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
    }
  }
}
