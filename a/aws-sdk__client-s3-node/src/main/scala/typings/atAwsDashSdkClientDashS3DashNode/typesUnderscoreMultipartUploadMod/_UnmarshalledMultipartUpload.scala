package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMultipartUploadMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInitiatorMod._UnmarshalledInitiator
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMultipartUpload extends _MultipartUpload {
  /**
    * <p>Date and time at which the multipart upload was initiated.</p>
    */
  @JSName("Initiated")
  var Initiated__UnmarshalledMultipartUpload: js.UndefOr[Date] = js.undefined
  /**
    * <p>Identifies who initiated the multipart upload.</p>
    */
  @JSName("Initiator")
  var Initiator__UnmarshalledMultipartUpload: js.UndefOr[_UnmarshalledInitiator] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner__UnmarshalledMultipartUpload: js.UndefOr[_UnmarshalledOwner] = js.undefined
}

object _UnmarshalledMultipartUpload {
  @scala.inline
  def apply(
    Initiated: Date = null,
    Initiator: _UnmarshalledInitiator = null,
    Key: String = null,
    Owner: _UnmarshalledOwner = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    UploadId: String = null
  ): _UnmarshalledMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Initiated != null) __obj.updateDynamic("Initiated")(Initiated.asInstanceOf[js.Any])
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledMultipartUpload]
  }
}

