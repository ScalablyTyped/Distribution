package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotInfo extends js.Object {
  /**
    * Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * Account id used when creating this snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Progress this snapshot has made towards completing.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * Snapshot id that can be used to describe this snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * Time this snapshot was started. This is the same for all snapshots initiated by the same request.
    */
  var StartTime: js.UndefOr[MillisecondDateTime] = js.native
  /**
    * Current state of the snapshot.
    */
  var State: js.UndefOr[SnapshotState] = js.native
  /**
    * Tags associated with this snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Source volume from which this snapshot was created.
    */
  var VolumeId: js.UndefOr[String] = js.native
  /**
    * Size of the volume from which this snapshot was created.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
}

object SnapshotInfo {
  @scala.inline
  def apply(
    Description: String = null,
    Encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    OwnerId: String = null,
    Progress: String = null,
    SnapshotId: String = null,
    StartTime: MillisecondDateTime = null,
    State: SnapshotState = null,
    Tags: TagList = null,
    VolumeId: String = null,
    VolumeSize: Int | scala.Double = null
  ): SnapshotInfo = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    if (VolumeSize != null) __obj.updateDynamic("VolumeSize")(VolumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotInfo]
  }
}

