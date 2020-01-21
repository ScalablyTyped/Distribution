package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetModifyConfig extends js.Object {
  /**
    * A unique identifier for the instance fleet.
    */
  var InstanceFleetId: typings.awsSdk.emrMod.InstanceFleetId = js.native
  /**
    * The target capacity of On-Demand units for the instance fleet. For more information see InstanceFleetConfig$TargetOnDemandCapacity.
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The target capacity of Spot units for the instance fleet. For more information, see InstanceFleetConfig$TargetSpotCapacity.
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceFleetModifyConfig {
  @scala.inline
  def apply(
    InstanceFleetId: InstanceFleetId,
    TargetOnDemandCapacity: Int | Double = null,
    TargetSpotCapacity: Int | Double = null
  ): InstanceFleetModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetId = InstanceFleetId.asInstanceOf[js.Any])
    if (TargetOnDemandCapacity != null) __obj.updateDynamic("TargetOnDemandCapacity")(TargetOnDemandCapacity.asInstanceOf[js.Any])
    if (TargetSpotCapacity != null) __obj.updateDynamic("TargetSpotCapacity")(TargetSpotCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetModifyConfig]
  }
}

