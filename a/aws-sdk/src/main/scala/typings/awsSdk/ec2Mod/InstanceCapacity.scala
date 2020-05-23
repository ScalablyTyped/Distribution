package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCapacity extends js.Object {
  /**
    * The number of instances that can be launched onto the Dedicated Host based on the host's available capacity.
    */
  var AvailableCapacity: js.UndefOr[Integer] = js.native
  /**
    * The instance type supported by the Dedicated Host.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The total number of instances that can be launched onto the Dedicated Host if there are no instances running on it.
    */
  var TotalCapacity: js.UndefOr[Integer] = js.native
}

object InstanceCapacity {
  @scala.inline
  def apply(
    AvailableCapacity: js.UndefOr[Integer] = js.undefined,
    InstanceType: String = null,
    TotalCapacity: js.UndefOr[Integer] = js.undefined
  ): InstanceCapacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AvailableCapacity)) __obj.updateDynamic("AvailableCapacity")(AvailableCapacity.get.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCapacity)) __obj.updateDynamic("TotalCapacity")(TotalCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCapacity]
  }
}

