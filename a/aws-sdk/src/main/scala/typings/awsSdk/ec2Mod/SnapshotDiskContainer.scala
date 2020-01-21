package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDiskContainer extends js.Object {
  /**
    * The description of the disk image being imported.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The format of the disk image being imported. Valid values: VHD | VMDK 
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..).
    */
  var Url: js.UndefOr[String] = js.native
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[typings.awsSdk.ec2Mod.UserBucket] = js.native
}

object SnapshotDiskContainer {
  @scala.inline
  def apply(
    Description: String = null,
    Format: String = null,
    Url: String = null,
    UserBucket: UserBucket = null
  ): SnapshotDiskContainer = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (UserBucket != null) __obj.updateDynamic("UserBucket")(UserBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDiskContainer]
  }
}

