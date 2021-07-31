package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroup extends StObject {
  
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
  
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[String] = js.undefined
  
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The version number of the requested configuration specification for this instance group.
    */
  var ConfigurationsVersion: js.UndefOr[Long] = js.undefined
  
  /**
    * The EBS block devices that are mapped to this instance group.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined
  
  /**
    * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack and provides additional, dedicated capacity for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The identifier of the instance group.
    */
  var Id: js.UndefOr[InstanceGroupId] = js.undefined
  
  /**
    * The type of the instance group. Valid values are MASTER, CORE or TASK.
    */
  var InstanceGroupType: js.UndefOr[typings.awsSdk.emrMod.InstanceGroupType] = js.undefined
  
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.emrMod.InstanceType] = js.undefined
  
  /**
    * A list of configurations that were successfully applied for an instance group last time.
    */
  var LastSuccessfullyAppliedConfigurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The version number of a configuration specification that was successfully applied for an instance group last time. 
    */
  var LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Long] = js.undefined
  
  /**
    * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
    */
  var Market: js.UndefOr[MarketType] = js.undefined
  
  /**
    * The name of the instance group.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The target number of instances for the instance group.
    */
  var RequestedInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances currently running in this instance group.
    */
  var RunningInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsSdk.emrMod.ShrinkPolicy] = js.undefined
  
  /**
    * The current status of the instance group.
    */
  var Status: js.UndefOr[InstanceGroupStatus] = js.undefined
}
object InstanceGroup {
  
  @scala.inline
  def apply(): InstanceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroup]
  }
  
  @scala.inline
  implicit class InstanceGroupMutableBuilder[Self <: InstanceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingPolicy(value: AutoScalingPolicyDescription): Self = StObject.set(x, "AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingPolicyUndefined: Self = StObject.set(x, "AutoScalingPolicy", js.undefined)
    
    @scala.inline
    def setBidPrice(value: String): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationsVersion(value: Long): Self = StObject.set(x, "ConfigurationsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsVersionUndefined: Self = StObject.set(x, "ConfigurationsVersion", js.undefined)
    
    @scala.inline
    def setEbsBlockDevices(value: EbsBlockDeviceList): Self = StObject.set(x, "EbsBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsBlockDevicesUndefined: Self = StObject.set(x, "EbsBlockDevices", js.undefined)
    
    @scala.inline
    def setEbsBlockDevicesVarargs(value: EbsBlockDevice*): Self = StObject.set(x, "EbsBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEbsOptimized(value: BooleanObject): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setId(value: InstanceGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInstanceGroupType(value: InstanceGroupType): Self = StObject.set(x, "InstanceGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupTypeUndefined: Self = StObject.set(x, "InstanceGroupType", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLastSuccessfullyAppliedConfigurations(value: ConfigurationList): Self = StObject.set(x, "LastSuccessfullyAppliedConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfullyAppliedConfigurationsUndefined: Self = StObject.set(x, "LastSuccessfullyAppliedConfigurations", js.undefined)
    
    @scala.inline
    def setLastSuccessfullyAppliedConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "LastSuccessfullyAppliedConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setLastSuccessfullyAppliedConfigurationsVersion(value: Long): Self = StObject.set(x, "LastSuccessfullyAppliedConfigurationsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfullyAppliedConfigurationsVersionUndefined: Self = StObject.set(x, "LastSuccessfullyAppliedConfigurationsVersion", js.undefined)
    
    @scala.inline
    def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketUndefined: Self = StObject.set(x, "Market", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRequestedInstanceCount(value: Integer): Self = StObject.set(x, "RequestedInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedInstanceCountUndefined: Self = StObject.set(x, "RequestedInstanceCount", js.undefined)
    
    @scala.inline
    def setRunningInstanceCount(value: Integer): Self = StObject.set(x, "RunningInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningInstanceCountUndefined: Self = StObject.set(x, "RunningInstanceCount", js.undefined)
    
    @scala.inline
    def setShrinkPolicy(value: ShrinkPolicy): Self = StObject.set(x, "ShrinkPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkPolicyUndefined: Self = StObject.set(x, "ShrinkPolicy", js.undefined)
    
    @scala.inline
    def setStatus(value: InstanceGroupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
