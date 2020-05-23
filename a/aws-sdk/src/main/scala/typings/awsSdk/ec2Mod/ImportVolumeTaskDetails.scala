package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportVolumeTaskDetails extends js.Object {
  /**
    * The Availability Zone where the resulting volume will reside.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of bytes converted so far.
    */
  var BytesConverted: js.UndefOr[Long] = js.native
  /**
    * The description you provided when starting the import volume task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The image.
    */
  var Image: js.UndefOr[DiskImageDescription] = js.native
  /**
    * The volume.
    */
  var Volume: js.UndefOr[DiskImageVolumeDescription] = js.native
}

object ImportVolumeTaskDetails {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    BytesConverted: js.UndefOr[Long] = js.undefined,
    Description: String = null,
    Image: DiskImageDescription = null,
    Volume: DiskImageVolumeDescription = null
  ): ImportVolumeTaskDetails = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (!js.isUndefined(BytesConverted)) __obj.updateDynamic("BytesConverted")(BytesConverted.get.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Image != null) __obj.updateDynamic("Image")(Image.asInstanceOf[js.Any])
    if (Volume != null) __obj.updateDynamic("Volume")(Volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportVolumeTaskDetails]
  }
}

