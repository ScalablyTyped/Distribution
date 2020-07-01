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
  def apply(
    otaUpdateId: OTAUpdateId,
    deleteStream: js.UndefOr[DeleteStream] = js.undefined,
    forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined
  ): DeleteOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteStream)) __obj.updateDynamic("deleteStream")(deleteStream.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDeleteAWSJob)) __obj.updateDynamic("forceDeleteAWSJob")(forceDeleteAWSJob.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOTAUpdateRequest]
  }
}

