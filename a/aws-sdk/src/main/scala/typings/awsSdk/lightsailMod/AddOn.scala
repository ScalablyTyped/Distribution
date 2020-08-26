package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOn extends js.Object {
  /**
    * The name of the add-on.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The next daily time an automatic snapshot will be created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var nextSnapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  /**
    * The daily time when an automatic snapshot is created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  /**
    * The status of the add-on.
    */
  var status: js.UndefOr[String] = js.native
}

object AddOn {
  @scala.inline
  def apply(): AddOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOn]
  }
  @scala.inline
  implicit class AddOnOps[Self <: AddOn] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNextSnapshotTimeOfDay(value: TimeOfDay): Self = this.set("nextSnapshotTimeOfDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSnapshotTimeOfDay: Self = this.set("nextSnapshotTimeOfDay", js.undefined)
    @scala.inline
    def setSnapshotTimeOfDay(value: TimeOfDay): Self = this.set("snapshotTimeOfDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotTimeOfDay: Self = this.set("snapshotTimeOfDay", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

