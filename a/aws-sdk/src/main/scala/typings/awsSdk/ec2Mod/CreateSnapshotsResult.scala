package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotsResult extends js.Object {
  /**
    * List of snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotSet] = js.native
}

object CreateSnapshotsResult {
  @scala.inline
  def apply(): CreateSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotsResult]
  }
  @scala.inline
  implicit class CreateSnapshotsResultOps[Self <: CreateSnapshotsResult] (val x: Self) extends AnyVal {
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
    def setSnapshotsVarargs(value: SnapshotInfo*): Self = this.set("Snapshots", js.Array(value :_*))
    @scala.inline
    def setSnapshots(value: SnapshotSet): Self = this.set("Snapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshots: Self = this.set("Snapshots", js.undefined)
  }
  
}

