package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotLimits extends js.Object {
  /**
    * The current number of manual snapshots of the directory.
    */
  var ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of manual snapshots allowed.
    */
  var ManualSnapshotsLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the manual snapshot limit has been reached.
    */
  var ManualSnapshotsLimitReached: js.UndefOr[typings.awsSdk.directoryserviceMod.ManualSnapshotsLimitReached] = js.native
}

object SnapshotLimits {
  @scala.inline
  def apply(): SnapshotLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotLimits]
  }
  @scala.inline
  implicit class SnapshotLimitsOps[Self <: SnapshotLimits] (val x: Self) extends AnyVal {
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
    def setManualSnapshotsCurrentCount(value: Limit): Self = this.set("ManualSnapshotsCurrentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSnapshotsCurrentCount: Self = this.set("ManualSnapshotsCurrentCount", js.undefined)
    @scala.inline
    def setManualSnapshotsLimit(value: Limit): Self = this.set("ManualSnapshotsLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSnapshotsLimit: Self = this.set("ManualSnapshotsLimit", js.undefined)
    @scala.inline
    def setManualSnapshotsLimitReached(value: ManualSnapshotsLimitReached): Self = this.set("ManualSnapshotsLimitReached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSnapshotsLimitReached: Self = this.set("ManualSnapshotsLimitReached", js.undefined)
  }
  
}

