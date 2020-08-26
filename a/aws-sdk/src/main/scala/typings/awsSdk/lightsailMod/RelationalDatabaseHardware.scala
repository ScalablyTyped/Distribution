package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseHardware extends js.Object {
  /**
    * The number of vCPUs for the database.
    */
  var cpuCount: js.UndefOr[integer] = js.native
  /**
    * The size of the disk for the database.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.native
  /**
    * The amount of RAM in GB for the database.
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
}

object RelationalDatabaseHardware {
  @scala.inline
  def apply(): RelationalDatabaseHardware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseHardware]
  }
  @scala.inline
  implicit class RelationalDatabaseHardwareOps[Self <: RelationalDatabaseHardware] (val x: Self) extends AnyVal {
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
    def setCpuCount(value: integer): Self = this.set("cpuCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuCount: Self = this.set("cpuCount", js.undefined)
    @scala.inline
    def setDiskSizeInGb(value: integer): Self = this.set("diskSizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskSizeInGb: Self = this.set("diskSizeInGb", js.undefined)
    @scala.inline
    def setRamSizeInGb(value: float): Self = this.set("ramSizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamSizeInGb: Self = this.set("ramSizeInGb", js.undefined)
  }
  
}

