package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketVersioningOutput extends js.Object {
  /**
    * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
    */
  var MFADelete: js.UndefOr[MFADeleteStatus] = js.native
  /**
    * The versioning state of the bucket.
    */
  var Status: js.UndefOr[BucketVersioningStatus] = js.native
}

object GetBucketVersioningOutput {
  @scala.inline
  def apply(): GetBucketVersioningOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketVersioningOutput]
  }
  @scala.inline
  implicit class GetBucketVersioningOutputOps[Self <: GetBucketVersioningOutput] (val x: Self) extends AnyVal {
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
    def setMFADelete(value: MFADeleteStatus): Self = this.set("MFADelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMFADelete: Self = this.set("MFADelete", js.undefined)
    @scala.inline
    def setStatus(value: BucketVersioningStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

