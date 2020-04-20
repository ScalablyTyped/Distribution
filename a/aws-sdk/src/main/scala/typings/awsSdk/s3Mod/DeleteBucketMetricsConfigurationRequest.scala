package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketMetricsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket containing the metrics configuration to delete.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId = js.native
}

object DeleteBucketMetricsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: MetricsId): DeleteBucketMetricsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketMetricsConfigurationRequest]
  }
}

