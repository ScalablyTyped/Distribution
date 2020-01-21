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
  def apply(cpuCount: Int | Double = null, disks: DiskList = null, ramSizeInGb: Int | Double = null): InstanceHardware = {
    val __obj = js.Dynamic.literal()
    if (cpuCount != null) __obj.updateDynamic("cpuCount")(cpuCount.asInstanceOf[js.Any])
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (ramSizeInGb != null) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceHardware]
  }
}

