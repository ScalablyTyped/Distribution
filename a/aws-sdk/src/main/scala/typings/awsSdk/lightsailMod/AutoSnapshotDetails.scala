package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSnapshotDetails extends js.Object {
  /**
    * The timestamp when the automatic snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The date of the automatic snapshot in YYYY-MM-DD format.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot was created.
    */
  var fromAttachedDisks: js.UndefOr[AttachedDiskList] = js.native
  /**
    * The status of the automatic snapshot.
    */
  var status: js.UndefOr[AutoSnapshotStatus] = js.native
}

object AutoSnapshotDetails {
  @scala.inline
  def apply(): AutoSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSnapshotDetails]
  }
  @scala.inline
  implicit class AutoSnapshotDetailsOps[Self <: AutoSnapshotDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setFromAttachedDisksVarargs(value: AttachedDisk*): Self = this.set("fromAttachedDisks", js.Array(value :_*))
    @scala.inline
    def setFromAttachedDisks(value: AttachedDiskList): Self = this.set("fromAttachedDisks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromAttachedDisks: Self = this.set("fromAttachedDisks", js.undefined)
    @scala.inline
    def setStatus(value: AutoSnapshotStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

