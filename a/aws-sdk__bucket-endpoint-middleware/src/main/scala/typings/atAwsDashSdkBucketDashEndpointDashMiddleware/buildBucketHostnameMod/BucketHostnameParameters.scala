package typings.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketHostnameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketHostnameParameters extends js.Object {
  var accelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  var baseHostname: String
  var bucketName: String
  var dualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  var pathStyleEndpoint: js.UndefOr[Boolean] = js.undefined
  var sslCompatible: js.UndefOr[Boolean] = js.undefined
}

object BucketHostnameParameters {
  @scala.inline
  def apply(
    baseHostname: String,
    bucketName: String,
    accelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    dualstackEndpoint: js.UndefOr[Boolean] = js.undefined,
    pathStyleEndpoint: js.UndefOr[Boolean] = js.undefined,
    sslCompatible: js.UndefOr[Boolean] = js.undefined
  ): BucketHostnameParameters = {
    val __obj = js.Dynamic.literal(baseHostname = baseHostname.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any])
    if (!js.isUndefined(accelerateEndpoint)) __obj.updateDynamic("accelerateEndpoint")(accelerateEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(dualstackEndpoint)) __obj.updateDynamic("dualstackEndpoint")(dualstackEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(pathStyleEndpoint)) __obj.updateDynamic("pathStyleEndpoint")(pathStyleEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompatible)) __obj.updateDynamic("sslCompatible")(sslCompatible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketHostnameParameters]
  }
}

