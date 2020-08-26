package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketAnalyticsConfigurationRequest extends js.Object {
  /**
    * The configuration and any analyses for the analytics filter.
    */
  var AnalyticsConfiguration: typings.awsSdk.s3Mod.AnalyticsConfiguration = js.native
  /**
    * The name of the bucket to which an analytics configuration is stored.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId = js.native
}

object PutBucketAnalyticsConfigurationRequest {
  @scala.inline
  def apply(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: BucketName, Id: AnalyticsId): PutBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAnalyticsConfigurationRequest]
  }
  @scala.inline
  implicit class PutBucketAnalyticsConfigurationRequestOps[Self <: PutBucketAnalyticsConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setAnalyticsConfiguration(value: AnalyticsConfiguration): Self = this.set("AnalyticsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: AnalyticsId): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

