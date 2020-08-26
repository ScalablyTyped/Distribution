package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOTAUpdateRequest extends js.Object {
  /**
    * Specifies if the stream associated with an OTA update should be deleted when the OTA update is deleted.
    */
  var deleteStream: js.UndefOr[DeleteStream] = js.native
  /**
    * Specifies if the AWS Job associated with the OTA update should be deleted when the OTA update is deleted.
    */
  var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.native
  /**
    * The ID of the OTA update to delete.
    */
  var otaUpdateId: OTAUpdateId = js.native
}

object DeleteOTAUpdateRequest {
  @scala.inline
  def apply(otaUpdateId: OTAUpdateId): DeleteOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOTAUpdateRequest]
  }
  @scala.inline
  implicit class DeleteOTAUpdateRequestOps[Self <: DeleteOTAUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = this.set("otaUpdateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteStream(value: DeleteStream): Self = this.set("deleteStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteStream: Self = this.set("deleteStream", js.undefined)
    @scala.inline
    def setForceDeleteAWSJob(value: ForceDeleteAWSJob): Self = this.set("forceDeleteAWSJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDeleteAWSJob: Self = this.set("forceDeleteAWSJob", js.undefined)
  }
  
}

