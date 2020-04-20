package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketMetricsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket for which the metrics configuration is set.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId = js.native
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: typings.awsSdk.s3Mod.MetricsConfiguration = js.native
}

object PutBucketMetricsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: MetricsId, MetricsConfiguration: MetricsConfiguration): PutBucketMetricsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketMetricsConfigurationRequest]
  }
}

