package typings.atAwsDashSdkBucketDashEndpointDashMiddleware

import typings.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typings.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketHostnameMod.BucketHostname
import typings.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketHostnameMod.BucketHostnameParameters
import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/bucket-endpoint-middleware", JSImport.Namespace)
@js.native
object atAwsDashSdkBucketDashEndpointDashMiddlewareMod extends js.Object {
  def bucketEndpointMiddleware(): BuildMiddleware[_, _, _] = js.native
  def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[_, _, _] = js.native
  def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname = js.native
}

