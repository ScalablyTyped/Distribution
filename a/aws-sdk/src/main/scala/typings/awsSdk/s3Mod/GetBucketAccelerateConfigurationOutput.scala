package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAccelerateConfigurationOutput extends js.Object {
  /**
    * The accelerate configuration of the bucket.
    */
  var Status: js.UndefOr[BucketAccelerateStatus] = js.native
}

object GetBucketAccelerateConfigurationOutput {
  @scala.inline
  def apply(): GetBucketAccelerateConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketAccelerateConfigurationOutputOps[Self <: GetBucketAccelerateConfigurationOutput] (val x: Self) extends AnyVal {
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
    def setStatus(value: BucketAccelerateStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

