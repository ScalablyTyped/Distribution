package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupConfig extends StObject {
  
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[typings.awsSdk.emrMod.AutoScalingPolicy] = js.undefined
  
  /**
    * If specified, indicates that the instance group uses Spot Instances. This is the maximum price you are willing to pay for Spot Instances. Specify OnDemandPrice to set the amount equal to the On-Demand price, or specify an amount in USD.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  
  /**
    * The custom AMI ID to use for the provisioned instance group.
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * EBS configurations that will be attached to each EC2 instance in the instance group.
    */
  var EbsConfiguration: js.UndefOr[typings.awsSdk.emrMod.EbsConfiguration] = js.undefined
  
  /**
    * Target number of instances for the instance group.
    */
  var InstanceCount: Integer
  
  /**
    * The role of the instance group in the cluster.
    */
  var InstanceRole: InstanceRoleType
  
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: typings.awsSdk.emrMod.InstanceType
  
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: js.UndefOr[MarketType] = js.undefined
  
  /**
    * Friendly name given to the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object InstanceGroupConfig {
  
  inline def apply(InstanceCount: Integer, InstanceRole: InstanceRoleType, InstanceType: InstanceType): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupConfig]
  }
  
  extension [Self <: InstanceGroupConfig](x: Self) {
    
    inline def setAutoScalingPolicy(value: AutoScalingPolicy): Self = StObject.set(x, "AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingPolicyUndefined: Self = StObject.set(x, "AutoScalingPolicy", js.undefined)
    
    inline def setBidPrice(value: XmlStringMaxLen256): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    inline def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value*))
    
    inline def setCustomAmiId(value: XmlStringMaxLen256): Self = StObject.set(x, "CustomAmiId", value.asInstanceOf[js.Any])
    
    inline def setCustomAmiIdUndefined: Self = StObject.set(x, "CustomAmiId", js.undefined)
    
    inline def setEbsConfiguration(value: EbsConfiguration): Self = StObject.set(x, "EbsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEbsConfigurationUndefined: Self = StObject.set(x, "EbsConfiguration", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceRole(value: InstanceRoleType): Self = StObject.set(x, "InstanceRole", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    inline def setMarketUndefined: Self = StObject.set(x, "Market", js.undefined)
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
