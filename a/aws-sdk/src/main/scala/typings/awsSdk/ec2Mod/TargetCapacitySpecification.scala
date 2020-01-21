package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetCapacitySpecification extends js.Object {
  /**
    * The default TotalTargetCapacity, which is either Spot or On-Demand.
    */
  var DefaultTargetCapacityType: js.UndefOr[typings.awsSdk.ec2Mod.DefaultTargetCapacityType] = js.native
  /**
    * The number of On-Demand units to request. If you specify a target capacity for Spot units, you cannot specify a target capacity for On-Demand units.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The maximum number of Spot units to launch. If you specify a target capacity for On-Demand units, you cannot specify a target capacity for Spot units.
    */
  var SpotTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The number of units to request, filled using DefaultTargetCapacityType.
    */
  var TotalTargetCapacity: js.UndefOr[Integer] = js.native
}

object TargetCapacitySpecification {
  @scala.inline
  def apply(
    DefaultTargetCapacityType: DefaultTargetCapacityType = null,
    OnDemandTargetCapacity: Int | scala.Double = null,
    SpotTargetCapacity: Int | scala.Double = null,
    TotalTargetCapacity: Int | scala.Double = null
  ): TargetCapacitySpecification = {
    val __obj = js.Dynamic.literal()
    if (DefaultTargetCapacityType != null) __obj.updateDynamic("DefaultTargetCapacityType")(DefaultTargetCapacityType.asInstanceOf[js.Any])
    if (OnDemandTargetCapacity != null) __obj.updateDynamic("OnDemandTargetCapacity")(OnDemandTargetCapacity.asInstanceOf[js.Any])
    if (SpotTargetCapacity != null) __obj.updateDynamic("SpotTargetCapacity")(SpotTargetCapacity.asInstanceOf[js.Any])
    if (TotalTargetCapacity != null) __obj.updateDynamic("TotalTargetCapacity")(TotalTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCapacitySpecification]
  }
}

