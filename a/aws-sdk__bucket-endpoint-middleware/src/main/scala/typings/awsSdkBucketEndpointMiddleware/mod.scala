package typings.awsSdkBucketEndpointMiddleware

import typings.awsSdkBucketEndpointMiddleware.buildBucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typings.awsSdkBucketEndpointMiddleware.buildBucketHostnameMod.BucketHostnameParameters
import typings.awsSdkBucketEndpointMiddleware.buildBucketHostnameMod.BucketHostname_
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bucketEndpointMiddleware(): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")().asInstanceOf[BuildMiddleware[Any, Any]]
  inline def bucketEndpointMiddleware(param0: bucketEndpointMiddlewareConfiguration): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")(param0.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  inline def bucketHostname(param0: BucketHostnameParameters): BucketHostname_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketHostname")(param0.asInstanceOf[js.Any]).asInstanceOf[BucketHostname_]
}
