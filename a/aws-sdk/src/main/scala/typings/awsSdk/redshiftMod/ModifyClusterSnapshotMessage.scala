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
  def apply(SnapshotIdentifier: String): ModifyClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSnapshotMessage]
  }
  @scala.inline
  implicit class ModifyClusterSnapshotMessageOps[Self <: ModifyClusterSnapshotMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setForce(value: Boolean): Self = this.set("Force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("Force", js.undefined)
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
  }
  
}

