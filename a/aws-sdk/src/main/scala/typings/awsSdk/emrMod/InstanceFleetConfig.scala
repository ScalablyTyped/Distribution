package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetConfig extends js.Object {
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
    */
  var InstanceFleetType: typings.awsSdk.emrMod.InstanceFleetType = js.native
  /**
    * The instance type configurations that define the EC2 instances in the instance fleet.
    */
  var InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList] = js.native
  /**
    * The launch specification for the instance fleet.
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.native
  /**
    * The friendly name of the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceFleetConfig {
  @scala.inline
  def apply(InstanceFleetType: InstanceFleetType): InstanceFleetConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetType = InstanceFleetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetConfig]
  }
  @scala.inline
  implicit class InstanceFleetConfigOps[Self <: InstanceFleetConfig] (val x: Self) extends AnyVal {
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
    def setInstanceFleetType(value: InstanceFleetType): Self = this.set("InstanceFleetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceTypeConfigsVarargs(value: InstanceTypeConfig*): Self = this.set("InstanceTypeConfigs", js.Array(value :_*))
    @scala.inline
    def setInstanceTypeConfigs(value: InstanceTypeConfigList): Self = this.set("InstanceTypeConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTypeConfigs: Self = this.set("InstanceTypeConfigs", js.undefined)
    @scala.inline
    def setLaunchSpecifications(value: InstanceFleetProvisioningSpecifications): Self = this.set("LaunchSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchSpecifications: Self = this.set("LaunchSpecifications", js.undefined)
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
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

