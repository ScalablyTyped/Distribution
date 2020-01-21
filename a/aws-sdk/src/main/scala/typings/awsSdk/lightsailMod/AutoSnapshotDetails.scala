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
  def apply(
    createdAt: IsoDate = null,
    date: String = null,
    fromAttachedDisks: AttachedDiskList = null,
    status: AutoSnapshotStatus = null
  ): AutoSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (fromAttachedDisks != null) __obj.updateDynamic("fromAttachedDisks")(fromAttachedDisks.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSnapshotDetails]
  }
}

