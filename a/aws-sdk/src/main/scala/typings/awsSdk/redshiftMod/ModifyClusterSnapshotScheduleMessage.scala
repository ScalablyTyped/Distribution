package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterSnapshotScheduleMessage extends js.Object {
  /**
    * A unique identifier for the cluster whose snapshot schedule you want to modify. 
    */
  var ClusterIdentifier: String = js.native
  /**
    * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
    */
  var DisassociateSchedule: js.UndefOr[BooleanOptional] = js.native
  /**
    * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
}

object ModifyClusterSnapshotScheduleMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    DisassociateSchedule: js.UndefOr[scala.Boolean] = js.undefined,
    ScheduleIdentifier: String = null
  ): ModifyClusterSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(DisassociateSchedule)) __obj.updateDynamic("DisassociateSchedule")(DisassociateSchedule.asInstanceOf[js.Any])
    if (ScheduleIdentifier != null) __obj.updateDynamic("ScheduleIdentifier")(ScheduleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSnapshotScheduleMessage]
  }
}

