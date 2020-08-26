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
  @scala.inline
  implicit class PutBucketMetricsConfigurationRequestOps[Self <: PutBucketMetricsConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: MetricsId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricsConfiguration(value: MetricsConfiguration): Self = this.set("MetricsConfiguration", value.asInstanceOf[js.Any])
  }
  
}

