package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceHardware extends js.Object {
  /**
    * The number of vCPUs the instance has.
    */
  var cpuCount: js.UndefOr[integer] = js.native
  /**
    * The disks attached to the instance.
    */
  var disks: js.UndefOr[DiskList] = js.native
  /**
    * The amount of RAM in GB on the instance (e.g., 1.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
}

object InstanceHardware {
  @scala.inline
  def apply(
    cpuCount: js.UndefOr[integer] = js.undefined,
    disks: DiskList = null,
    ramSizeInGb: js.UndefOr[float] = js.undefined
  ): InstanceHardware = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpuCount)) __obj.updateDynamic("cpuCount")(cpuCount.get.asInstanceOf[js.Any])
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (!js.isUndefined(ramSizeInGb)) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceHardware]
  }
}

