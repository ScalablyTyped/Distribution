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
  def apply(
    cpuCount: js.UndefOr[integer] = js.undefined,
    diskSizeInGb: js.UndefOr[integer] = js.undefined,
    ramSizeInGb: js.UndefOr[float] = js.undefined
  ): RelationalDatabaseHardware = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpuCount)) __obj.updateDynamic("cpuCount")(cpuCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diskSizeInGb)) __obj.updateDynamic("diskSizeInGb")(diskSizeInGb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ramSizeInGb)) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseHardware]
  }
}

