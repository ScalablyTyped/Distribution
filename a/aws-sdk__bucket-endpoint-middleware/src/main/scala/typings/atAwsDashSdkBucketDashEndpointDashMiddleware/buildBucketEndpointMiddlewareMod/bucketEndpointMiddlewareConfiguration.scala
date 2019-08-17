package typings.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketEndpointMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bucketEndpointMiddlewareConfiguration extends js.Object {
  var forcePathStyle: js.UndefOr[Boolean] = js.undefined
  var preformedBucketEndpoint: js.UndefOr[Boolean] = js.undefined
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  var useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
}

object bucketEndpointMiddlewareConfiguration {
  @scala.inline
  def apply(
    forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    preformedBucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  ): bucketEndpointMiddlewareConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forcePathStyle)) __obj.updateDynamic("forcePathStyle")(forcePathStyle)
    if (!js.isUndefined(preformedBucketEndpoint)) __obj.updateDynamic("preformedBucketEndpoint")(preformedBucketEndpoint)
    if (!js.isUndefined(useAccelerateEndpoint)) __obj.updateDynamic("useAccelerateEndpoint")(useAccelerateEndpoint)
    if (!js.isUndefined(useDualstackEndpoint)) __obj.updateDynamic("useDualstackEndpoint")(useDualstackEndpoint)
    __obj.asInstanceOf[bucketEndpointMiddlewareConfiguration]
  }
}

