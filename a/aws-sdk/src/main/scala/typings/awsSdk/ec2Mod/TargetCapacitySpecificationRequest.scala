package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetCapacitySpecificationRequest extends js.Object {
  /**
    * The default TotalTargetCapacity, which is either Spot or On-Demand.
    */
  var DefaultTargetCapacityType: js.UndefOr[typings.awsSdk.ec2Mod.DefaultTargetCapacityType] = js.native
  /**
    * The number of On-Demand units to request.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The number of Spot units to request.
    */
  var SpotTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The number of units to request, filled using DefaultTargetCapacityType.
    */
  var TotalTargetCapacity: Integer = js.native
}

object TargetCapacitySpecificationRequest {
  @scala.inline
  def apply(
    TotalTargetCapacity: Integer,
    DefaultTargetCapacityType: DefaultTargetCapacityType = null,
    OnDemandTargetCapacity: Int | scala.Double = null,
    SpotTargetCapacity: Int | scala.Double = null
  ): TargetCapacitySpecificationRequest = {
    val __obj = js.Dynamic.literal(TotalTargetCapacity = TotalTargetCapacity.asInstanceOf[js.Any])
    if (DefaultTargetCapacityType != null) __obj.updateDynamic("DefaultTargetCapacityType")(DefaultTargetCapacityType.asInstanceOf[js.Any])
    if (OnDemandTargetCapacity != null) __obj.updateDynamic("OnDemandTargetCapacity")(OnDemandTargetCapacity.asInstanceOf[js.Any])
    if (SpotTargetCapacity != null) __obj.updateDynamic("SpotTargetCapacity")(SpotTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCapacitySpecificationRequest]
  }
}

