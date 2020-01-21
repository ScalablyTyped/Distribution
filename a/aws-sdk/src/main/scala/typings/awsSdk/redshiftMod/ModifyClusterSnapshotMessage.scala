package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterSnapshotMessage extends js.Object {
  /**
    * A Boolean option to override an exception if the retention period has already passed.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. If the manual snapshot falls outside of the new retention period, you can specify the force option to immediately delete the snapshot. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The identifier of the snapshot whose setting you want to modify.
    */
  var SnapshotIdentifier: String = js.native
}

object ModifyClusterSnapshotMessage {
  @scala.inline
  def apply(
    SnapshotIdentifier: String,
    Force: js.UndefOr[scala.Boolean] = js.undefined,
    ManualSnapshotRetentionPeriod: Int | scala.Double = null
  ): ModifyClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.asInstanceOf[js.Any])
    if (ManualSnapshotRetentionPeriod != null) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSnapshotMessage]
  }
}

