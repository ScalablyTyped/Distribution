package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableCapacity extends js.Object {
  /**
    * The number of instances that can be launched onto the Dedicated Host depending on the host's available capacity. For Dedicated Hosts that support multiple instance types, this parameter represents the number of instances for each instance size that is supported on the host.
    */
  var AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList] = js.native
  /**
    * The number of vCPUs available for launching instances onto the Dedicated Host.
    */
  var AvailableVCpus: js.UndefOr[Integer] = js.native
}

object AvailableCapacity {
  @scala.inline
  def apply(
    AvailableInstanceCapacity: AvailableInstanceCapacityList = null,
    AvailableVCpus: Int | scala.Double = null
  ): AvailableCapacity = {
    val __obj = js.Dynamic.literal()
    if (AvailableInstanceCapacity != null) __obj.updateDynamic("AvailableInstanceCapacity")(AvailableInstanceCapacity.asInstanceOf[js.Any])
    if (AvailableVCpus != null) __obj.updateDynamic("AvailableVCpus")(AvailableVCpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableCapacity]
  }
}

