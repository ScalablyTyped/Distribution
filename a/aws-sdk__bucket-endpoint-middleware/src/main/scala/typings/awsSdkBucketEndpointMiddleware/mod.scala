package typings.awsSdkBucketEndpointMiddleware

import typings.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typings.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostnameParameters
import typings.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostname_
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bucketEndpointMiddleware(): BuildMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")().asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  @scala.inline
  def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")(hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  
  @scala.inline
  def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketHostname")(hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible.asInstanceOf[js.Any]).asInstanceOf[BucketHostname_]
}
