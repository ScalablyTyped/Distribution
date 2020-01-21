package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportInstanceVolumeDetailItem extends js.Object {
  /**
    * The Availability Zone where the resulting instance will reside.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of bytes converted so far.
    */
  var BytesConverted: js.UndefOr[Long] = js.native
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The image.
    */
  var Image: js.UndefOr[DiskImageDescription] = js.native
  /**
    * The status of the import of this particular disk image.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The status information or errors related to the disk image.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The volume.
    */
  var Volume: js.UndefOr[DiskImageVolumeDescription] = js.native
}

object ImportInstanceVolumeDetailItem {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    BytesConverted: Int | scala.Double = null,
    Description: String = null,
    Image: DiskImageDescription = null,
    Status: String = null,
    StatusMessage: String = null,
    Volume: DiskImageVolumeDescription = null
  ): ImportInstanceVolumeDetailItem = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (BytesConverted != null) __obj.updateDynamic("BytesConverted")(BytesConverted.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Image != null) __obj.updateDynamic("Image")(Image.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Volume != null) __obj.updateDynamic("Volume")(Volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportInstanceVolumeDetailItem]
  }
}

