package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageDiskContainer extends js.Object {
  /**
    * The description of the disk image.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The block device mapping for the disk.
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * The format of the disk image being imported. Valid values: VHD | VMDK | OVA 
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * The ID of the EBS snapshot to be used for importing the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotId] = js.native
  /**
    * The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..) or an Amazon S3 URL (s3://..)
    */
  var Url: js.UndefOr[String] = js.native
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[typings.awsSdk.ec2Mod.UserBucket] = js.native
}

object ImageDiskContainer {
  @scala.inline
  def apply(
    Description: String = null,
    DeviceName: String = null,
    Format: String = null,
    SnapshotId: SnapshotId = null,
    Url: String = null,
    UserBucket: UserBucket = null
  ): ImageDiskContainer = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (UserBucket != null) __obj.updateDynamic("UserBucket")(UserBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDiskContainer]
  }
}

