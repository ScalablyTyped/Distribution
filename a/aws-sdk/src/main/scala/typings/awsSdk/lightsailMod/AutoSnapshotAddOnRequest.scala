package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSnapshotAddOnRequest extends js.Object {
  /**
    * The daily time when an automatic snapshot will be created. Constraints:   Must be in HH:00 format, and in an hourly increment.   Specified in Coordinated Universal Time (UTC).   The snapshot will be automatically created between the time specified and up to 45 minutes after.  
    */
  var snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
}

object AutoSnapshotAddOnRequest {
  @scala.inline
  def apply(): AutoSnapshotAddOnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSnapshotAddOnRequest]
  }
  @scala.inline
  implicit class AutoSnapshotAddOnRequestOps[Self <: AutoSnapshotAddOnRequest] (val x: Self) extends AnyVal {
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
    def setSnapshotTimeOfDay(value: TimeOfDay): Self = this.set("snapshotTimeOfDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotTimeOfDay: Self = this.set("snapshotTimeOfDay", js.undefined)
  }
  
}

