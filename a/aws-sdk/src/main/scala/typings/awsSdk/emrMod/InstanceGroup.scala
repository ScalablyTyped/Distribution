package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroup extends js.Object {
  
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.native
  
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[String] = js.native
  
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  
  /**
    * The version number of the requested configuration specification for this instance group.
    */
  var ConfigurationsVersion: js.UndefOr[Long] = js.native
  
  /**
    * The EBS block devices that are mapped to this instance group.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.native
  
  /**
    * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack and provides additional, dedicated capacity for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The identifier of the instance group.
    */
  var Id: js.UndefOr[InstanceGroupId] = js.native
  
  /**
    * The type of the instance group. Valid values are MASTER, CORE or TASK.
    */
  var InstanceGroupType: js.UndefOr[typings.awsSdk.emrMod.InstanceGroupType] = js.native
  
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.emrMod.InstanceType] = js.native
  
  /**
    * A list of configurations that were successfully applied for an instance group last time.
    */
  var LastSuccessfullyAppliedConfigurations: js.UndefOr[ConfigurationList] = js.native
  
  /**
    * The version number of a configuration specification that was successfully applied for an instance group last time. 
    */
  var LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Long] = js.native
  
  /**
    * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
    */
  var Market: js.UndefOr[MarketType] = js.native
  
  /**
    * The name of the instance group.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The target number of instances for the instance group.
    */
  var RequestedInstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances currently running in this instance group.
    */
  var RunningInstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsSdk.emrMod.ShrinkPolicy] = js.native
  
  /**
    * The current status of the instance group.
    */
  var Status: js.UndefOr[InstanceGroupStatus] = js.native
}
object InstanceGroup {
  
  @scala.inline
  def apply(): InstanceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroup]
  }
  
  @scala.inline
  implicit class InstanceGroupOps[Self <: InstanceGroup] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingPolicy(value: AutoScalingPolicyDescription): Self = this.set("AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingPolicy: Self = this.set("AutoScalingPolicy", js.undefined)
    
    @scala.inline
    def setBidPrice(value: String): Self = this.set("BidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPrice: Self = this.set("BidPrice", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = this.set("Configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = this.set("Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurations: Self = this.set("Configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVersion(value: Long): Self = this.set("ConfigurationsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationsVersion: Self = this.set("ConfigurationsVersion", js.undefined)
    
    @scala.inline
    def setEbsBlockDevicesVarargs(value: EbsBlockDevice*): Self = this.set("EbsBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEbsBlockDevices(value: EbsBlockDeviceList): Self = this.set("EbsBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("EbsBlockDevices", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: BooleanObject): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    
    @scala.inline
    def setId(value: InstanceGroupId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setInstanceGroupType(value: InstanceGroupType): Self = this.set("InstanceGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroupType: Self = this.set("InstanceGroupType", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setLastSuccessfullyAppliedConfigurationsVarargs(value: Configuration*): Self = this.set("LastSuccessfullyAppliedConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setLastSuccessfullyAppliedConfigurations(value: ConfigurationList): Self = this.set("LastSuccessfullyAppliedConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSuccessfullyAppliedConfigurations: Self = this.set("LastSuccessfullyAppliedConfigurations", js.undefined)
    
    @scala.inline
    def setLastSuccessfullyAppliedConfigurationsVersion(value: Long): Self = this.set("LastSuccessfullyAppliedConfigurationsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSuccessfullyAppliedConfigurationsVersion: Self = this.set("LastSuccessfullyAppliedConfigurationsVersion", js.undefined)
    
    @scala.inline
    def setMarket(value: MarketType): Self = this.set("Market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarket: Self = this.set("Market", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRequestedInstanceCount(value: Integer): Self = this.set("RequestedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedInstanceCount: Self = this.set("RequestedInstanceCount", js.undefined)
    
    @scala.inline
    def setRunningInstanceCount(value: Integer): Self = this.set("RunningInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunningInstanceCount: Self = this.set("RunningInstanceCount", js.undefined)
    
    @scala.inline
    def setShrinkPolicy(value: ShrinkPolicy): Self = this.set("ShrinkPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShrinkPolicy: Self = this.set("ShrinkPolicy", js.undefined)
    
    @scala.inline
    def setStatus(value: InstanceGroupStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
