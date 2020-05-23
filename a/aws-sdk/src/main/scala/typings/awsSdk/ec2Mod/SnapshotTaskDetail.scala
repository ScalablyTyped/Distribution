package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotTaskDetail extends js.Object {
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The size of the disk in the snapshot, in GiB.
    */
  var DiskImageSize: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The format of the disk image from which the snapshot is created.
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The percentage of completion for the import snapshot task.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * The snapshot ID of the disk being imported.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * A brief status for the import snapshot task.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * A detailed status message for the import snapshot task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The URL of the disk image from which the snapshot is created.
    */
  var Url: js.UndefOr[String] = js.native
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[UserBucketDetails] = js.native
}

object SnapshotTaskDetail {
  @scala.inline
  def apply(
    Description: String = null,
    DiskImageSize: js.UndefOr[Double] = js.undefined,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Format: String = null,
    KmsKeyId: String = null,
    Progress: String = null,
    SnapshotId: String = null,
    Status: String = null,
    StatusMessage: String = null,
    Url: String = null,
    UserBucket: UserBucketDetails = null
  ): SnapshotTaskDetail = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DiskImageSize)) __obj.updateDynamic("DiskImageSize")(DiskImageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.get.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (UserBucket != null) __obj.updateDynamic("UserBucket")(UserBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotTaskDetail]
  }
}

