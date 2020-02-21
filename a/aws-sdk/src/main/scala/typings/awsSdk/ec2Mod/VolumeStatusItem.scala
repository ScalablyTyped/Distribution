package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusItem extends js.Object {
  /**
    * The details of the operation.
    */
  var Actions: js.UndefOr[VolumeStatusActionsList] = js.native
  /**
    * Information about the instances to which the volume is attached.
    */
  var AttachmentStatuses: js.UndefOr[VolumeStatusAttachmentStatusList] = js.native
  /**
    * The Availability Zone of the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * A list of events associated with the volume.
    */
  var Events: js.UndefOr[VolumeStatusEventsList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.native
  /**
    * The volume status.
    */
  var VolumeStatus: js.UndefOr[VolumeStatusInfo] = js.native
}

object VolumeStatusItem {
  @scala.inline
  def apply(
    Actions: VolumeStatusActionsList = null,
    AttachmentStatuses: VolumeStatusAttachmentStatusList = null,
    AvailabilityZone: String = null,
    Events: VolumeStatusEventsList = null,
    OutpostArn: String = null,
    VolumeId: String = null,
    VolumeStatus: VolumeStatusInfo = null
  ): VolumeStatusItem = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (AttachmentStatuses != null) __obj.updateDynamic("AttachmentStatuses")(AttachmentStatuses.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    if (VolumeStatus != null) __obj.updateDynamic("VolumeStatus")(VolumeStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeStatusItem]
  }
}

