package typings.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod

import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/bucket-endpoint-middleware/build/bucketEndpointMiddleware", "bucketEndpointMiddleware")
@js.native
object bucketEndpointMiddleware extends js.Object {
  def apply(): BuildMiddleware[_, _, _] = js.native
  def apply(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[_, _, _] = js.native
}

