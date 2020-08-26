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
  def apply(InstanceFleetId: InstanceFleetId): InstanceFleetModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetId = InstanceFleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetModifyConfig]
  }
  @scala.inline
  implicit class InstanceFleetModifyConfigOps[Self <: InstanceFleetModifyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceFleetId(value: InstanceFleetId): Self = this.set("InstanceFleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetOnDemandCapacity(value: WholeNumber): Self = this.set("TargetOnDemandCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetOnDemandCapacity: Self = this.set("TargetOnDemandCapacity", js.undefined)
    @scala.inline
    def setTargetSpotCapacity(value: WholeNumber): Self = this.set("TargetSpotCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSpotCapacity: Self = this.set("TargetSpotCapacity", js.undefined)
  }
  
}

