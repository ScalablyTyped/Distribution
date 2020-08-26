package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketAnalyticsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket from which an analytics configuration is deleted.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId = js.native
}

object DeleteBucketAnalyticsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: AnalyticsId): DeleteBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketAnalyticsConfigurationRequest]
  }
  @scala.inline
  implicit class DeleteBucketAnalyticsConfigurationRequestOps[Self <: DeleteBucketAnalyticsConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setId(value: AnalyticsId): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

