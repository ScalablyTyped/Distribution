package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotLimitsResult extends js.Object {
  /**
    * A SnapshotLimits object that contains the manual snapshot limits for the specified directory.
    */
  var SnapshotLimits: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotLimits] = js.native
}

object GetSnapshotLimitsResult {
  @scala.inline
  def apply(): GetSnapshotLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotLimitsResult]
  }
  @scala.inline
  implicit class GetSnapshotLimitsResultOps[Self <: GetSnapshotLimitsResult] (val x: Self) extends AnyVal {
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
    def setSnapshotLimits(value: SnapshotLimits): Self = this.set("SnapshotLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotLimits: Self = this.set("SnapshotLimits", js.undefined)
  }
  
}

