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
  def apply(TotalTargetCapacity: Integer): TargetCapacitySpecificationRequest = {
    val __obj = js.Dynamic.literal(TotalTargetCapacity = TotalTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCapacitySpecificationRequest]
  }
  @scala.inline
  implicit class TargetCapacitySpecificationRequestOps[Self <: TargetCapacitySpecificationRequest] (val x: Self) extends AnyVal {
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
    def setTotalTargetCapacity(value: Integer): Self = this.set("TotalTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTargetCapacityType(value: DefaultTargetCapacityType): Self = this.set("DefaultTargetCapacityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTargetCapacityType: Self = this.set("DefaultTargetCapacityType", js.undefined)
    @scala.inline
    def setOnDemandTargetCapacity(value: Integer): Self = this.set("OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandTargetCapacity: Self = this.set("OnDemandTargetCapacity", js.undefined)
    @scala.inline
    def setSpotTargetCapacity(value: Integer): Self = this.set("SpotTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotTargetCapacity: Self = this.set("SpotTargetCapacity", js.undefined)
  }
  
}

