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
    val __obj = js.Dynamic.literal(bucketEndpoint = bucketEndpoint, hostname = hostname)
  
    __obj.asInstanceOf[BucketHostname]
  }
}

