package typings.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketEndpointAwareInput extends js.Object {
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
  @scala.inline
  def apply(
    Bucket: String,
    $bucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    $forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  ): BucketEndpointAwareInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (!js.isUndefined($bucketEndpoint)) __obj.updateDynamic("$bucketEndpoint")($bucketEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined($forcePathStyle)) __obj.updateDynamic("$forcePathStyle")($forcePathStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined($useAccelerateEndpoint)) __obj.updateDynamic("$useAccelerateEndpoint")($useAccelerateEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined($useDualstackEndpoint)) __obj.updateDynamic("$useDualstackEndpoint")($useDualstackEndpoint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketEndpointAwareInput]
  }
}

