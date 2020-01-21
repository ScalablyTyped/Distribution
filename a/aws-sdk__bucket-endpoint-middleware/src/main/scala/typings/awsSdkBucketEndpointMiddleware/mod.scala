package typings.awsSdkBucketEndpointMiddleware

import typings.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typings.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostnameParameters
import typings.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostname_
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/bucket-endpoint-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def bucketEndpointMiddleware(): BuildMiddleware[_, _, _] = js.native
  def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[_, _, _] = js.native
  def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname_ = js.native
}

