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
  def apply(cpuCount: Int | Double = null, diskSizeInGb: Int | Double = null, ramSizeInGb: Int | Double = null): RelationalDatabaseHardware = {
    val __obj = js.Dynamic.literal()
    if (cpuCount != null) __obj.updateDynamic("cpuCount")(cpuCount.asInstanceOf[js.Any])
    if (diskSizeInGb != null) __obj.updateDynamic("diskSizeInGb")(diskSizeInGb.asInstanceOf[js.Any])
    if (ramSizeInGb != null) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseHardware]
  }
}

