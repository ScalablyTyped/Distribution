package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeModification extends js.Object {
  /**
    * The modification completion or failure time.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * The current modification state. The modification state is null for unmodified volumes.
    */
  var ModificationState: js.UndefOr[VolumeModificationState] = js.native
  /**
    * The original IOPS rate of the volume.
    */
  var OriginalIops: js.UndefOr[Integer] = js.native
  /**
    * The original size of the volume, in GiB.
    */
  var OriginalSize: js.UndefOr[Integer] = js.native
  /**
    * The original EBS volume type of the volume.
    */
  var OriginalVolumeType: js.UndefOr[VolumeType] = js.native
  /**
    * The modification progress, from 0 to 100 percent complete.
    */
  var Progress: js.UndefOr[Long] = js.native
  /**
    * The modification start time.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * A status message about the modification progress or failure.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The target IOPS rate of the volume.
    */
  var TargetIops: js.UndefOr[Integer] = js.native
  /**
    * The target size of the volume, in GiB.
    */
  var TargetSize: js.UndefOr[Integer] = js.native
  /**
    * The target EBS volume type of the volume.
    */
  var TargetVolumeType: js.UndefOr[VolumeType] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}

object VolumeModification {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    ModificationState: VolumeModificationState = null,
    OriginalIops: js.UndefOr[Integer] = js.undefined,
    OriginalSize: js.UndefOr[Integer] = js.undefined,
    OriginalVolumeType: VolumeType = null,
    Progress: js.UndefOr[Long] = js.undefined,
    StartTime: DateTime = null,
    StatusMessage: String = null,
    TargetIops: js.UndefOr[Integer] = js.undefined,
    TargetSize: js.UndefOr[Integer] = js.undefined,
    TargetVolumeType: VolumeType = null,
    VolumeId: String = null
  ): VolumeModification = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ModificationState != null) __obj.updateDynamic("ModificationState")(ModificationState.asInstanceOf[js.Any])
    if (!js.isUndefined(OriginalIops)) __obj.updateDynamic("OriginalIops")(OriginalIops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(OriginalSize)) __obj.updateDynamic("OriginalSize")(OriginalSize.get.asInstanceOf[js.Any])
    if (OriginalVolumeType != null) __obj.updateDynamic("OriginalVolumeType")(OriginalVolumeType.asInstanceOf[js.Any])
    if (!js.isUndefined(Progress)) __obj.updateDynamic("Progress")(Progress.get.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(TargetIops)) __obj.updateDynamic("TargetIops")(TargetIops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TargetSize)) __obj.updateDynamic("TargetSize")(TargetSize.get.asInstanceOf[js.Any])
    if (TargetVolumeType != null) __obj.updateDynamic("TargetVolumeType")(TargetVolumeType.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeModification]
  }
}

