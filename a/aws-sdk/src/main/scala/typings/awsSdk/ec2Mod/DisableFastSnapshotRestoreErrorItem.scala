package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableFastSnapshotRestoreErrorItem extends js.Object {
  /**
    * The errors.
    */
  var FastSnapshotRestoreStateErrors: js.UndefOr[DisableFastSnapshotRestoreStateErrorSet] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
}

object DisableFastSnapshotRestoreErrorItem {
  @scala.inline
  def apply(): DisableFastSnapshotRestoreErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoreErrorItem]
  }
  @scala.inline
  implicit class DisableFastSnapshotRestoreErrorItemOps[Self <: DisableFastSnapshotRestoreErrorItem] (val x: Self) extends AnyVal {
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
    def setFastSnapshotRestoreStateErrorsVarargs(value: DisableFastSnapshotRestoreStateErrorItem*): Self = this.set("FastSnapshotRestoreStateErrors", js.Array(value :_*))
    @scala.inline
    def setFastSnapshotRestoreStateErrors(value: DisableFastSnapshotRestoreStateErrorSet): Self = this.set("FastSnapshotRestoreStateErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastSnapshotRestoreStateErrors: Self = this.set("FastSnapshotRestoreStateErrors", js.undefined)
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
  }
  
}

