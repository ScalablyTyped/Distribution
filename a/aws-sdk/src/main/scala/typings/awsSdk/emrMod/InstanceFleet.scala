package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleet extends js.Object {
  /**
    * The unique identifier of the instance fleet.
    */
  var Id: js.UndefOr[InstanceFleetId] = js.native
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK. 
    */
  var InstanceFleetType: js.UndefOr[typings.awsSdk.emrMod.InstanceFleetType] = js.native
  /**
    * The specification for the instance types that comprise an instance fleet. Up to five unique instance specifications may be defined for each instance fleet. 
    */
  var InstanceTypeSpecifications: js.UndefOr[InstanceTypeSpecificationList] = js.native
  /**
    * Describes the launch specification for an instance fleet. 
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.native
  /**
    * A friendly name for the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The number of On-Demand units that have been provisioned for the instance fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
    */
  var ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The number of Spot units that have been provisioned for this instance fleet to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
    */
  var ProvisionedSpotCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The current status of the instance fleet. 
    */
  var Status: js.UndefOr[InstanceFleetStatus] = js.native
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedOnDemandCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedSpotCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceFleet {
  @scala.inline
  def apply(): InstanceFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleet]
  }
  @scala.inline
  implicit class InstanceFleetOps[Self <: InstanceFleet] (val x: Self) extends AnyVal {
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
    def setId(value: InstanceFleetId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setInstanceFleetType(value: InstanceFleetType): Self = this.set("InstanceFleetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceFleetType: Self = this.set("InstanceFleetType", js.undefined)
    @scala.inline
    def setInstanceTypeSpecificationsVarargs(value: InstanceTypeSpecification*): Self = this.set("InstanceTypeSpecifications", js.Array(value :_*))
    @scala.inline
    def setInstanceTypeSpecifications(value: InstanceTypeSpecificationList): Self = this.set("InstanceTypeSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTypeSpecifications: Self = this.set("InstanceTypeSpecifications", js.undefined)
    @scala.inline
    def setLaunchSpecifications(value: InstanceFleetProvisioningSpecifications): Self = this.set("LaunchSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchSpecifications: Self = this.set("LaunchSpecifications", js.undefined)
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setProvisionedOnDemandCapacity(value: WholeNumber): Self = this.set("ProvisionedOnDemandCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedOnDemandCapacity: Self = this.set("ProvisionedOnDemandCapacity", js.undefined)
    @scala.inline
    def setProvisionedSpotCapacity(value: WholeNumber): Self = this.set("ProvisionedSpotCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedSpotCapacity: Self = this.set("ProvisionedSpotCapacity", js.undefined)
    @scala.inline
    def setStatus(value: InstanceFleetStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
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

