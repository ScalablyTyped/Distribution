package typings.atAwsDashSdkBucketDashEndpointDashMiddleware.buildBucketHostnameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketHostname extends js.Object {
  var bucketEndpoint: Boolean
  var hostname: String
}

object BucketHostname {
  @scala.inline
  def apply(bucketEndpoint: Boolean, hostname: String): BucketHostname = {
    val __obj = js.Dynamic.literal(bucketEndpoint = bucketEndpoint.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketHostname]
  }
}

@JSImport("@aws-sdk/bucket-endpoint-middleware/build/bucketHostname", "bucketHostname")
@js.native
object bucketHostname extends js.Object {
  def apply(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname = js.native
}

