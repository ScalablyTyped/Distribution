package typings.awsSdkBucketEndpointMiddleware.bucketHostnameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketHostname_ extends js.Object {
  var bucketEndpoint: Boolean
  var hostname: String
}

object BucketHostname_ {
  @scala.inline
  def apply(bucketEndpoint: Boolean, hostname: String): BucketHostname_ = {
    val __obj = js.Dynamic.literal(bucketEndpoint = bucketEndpoint.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketHostname_]
  }
}

