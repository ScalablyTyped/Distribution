package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketAccelerateConfigurationRequest extends js.Object {
  /**
    * Container for setting the transfer acceleration state.
    */
  var AccelerateConfiguration: typings.awsSdk.s3Mod.AccelerateConfiguration = js.native
  /**
    * Name of the bucket for which the accelerate configuration is set.
    */
  var Bucket: BucketName = js.native
}

object PutBucketAccelerateConfigurationRequest {
  @scala.inline
  def apply(AccelerateConfiguration: AccelerateConfiguration, Bucket: BucketName): PutBucketAccelerateConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAccelerateConfigurationRequest]
  }
  @scala.inline
  implicit class PutBucketAccelerateConfigurationRequestOps[Self <: PutBucketAccelerateConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setAccelerateConfiguration(value: AccelerateConfiguration): Self = this.set("AccelerateConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
  }
  
}

