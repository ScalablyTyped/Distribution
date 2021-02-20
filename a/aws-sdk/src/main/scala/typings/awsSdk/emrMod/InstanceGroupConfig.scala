package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupConfig extends StObject {
  
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[typings.awsSdk.emrMod.AutoScalingPolicy] = js.native
  
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  
  /**
    * EBS configurations that will be attached to each EC2 instance in the instance group.
    */
  var EbsConfiguration: js.UndefOr[typings.awsSdk.emrMod.EbsConfiguration] = js.native
  
  /**
    * Target number of instances for the instance group.
    */
  var InstanceCount: Integer = js.native
  
  /**
    * The role of the instance group in the cluster.
    */
  var InstanceRole: InstanceRoleType = js.native
  
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: typings.awsSdk.emrMod.InstanceType = js.native
  
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: js.UndefOr[MarketType] = js.native
  
  /**
    * Friendly name given to the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
}
object InstanceGroupConfig {
  
  @scala.inline
  def apply(InstanceCount: Integer, InstanceRole: InstanceRoleType, InstanceType: InstanceType): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupConfig]
  }
  
  @scala.inline
  implicit class InstanceGroupConfigMutableBuilder[Self <: InstanceGroupConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingPolicy(value: AutoScalingPolicy): Self = StObject.set(x, "AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingPolicyUndefined: Self = StObject.set(x, "AutoScalingPolicy", js.undefined)
    
    @scala.inline
    def setBidPrice(value: XmlStringMaxLen256): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value :_*))
    
    @scala.inline
    def setEbsConfiguration(value: EbsConfiguration): Self = StObject.set(x, "EbsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsConfigurationUndefined: Self = StObject.set(x, "EbsConfiguration", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRole(value: InstanceRoleType): Self = StObject.set(x, "InstanceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketUndefined: Self = StObject.set(x, "Market", js.undefined)
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
