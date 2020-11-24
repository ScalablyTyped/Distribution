package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupConfig extends js.Object {
  
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
  implicit class InstanceGroupConfigOps[Self <: InstanceGroupConfig] (val x: Self) extends AnyVal {
    
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
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRole(value: InstanceRoleType): Self = this.set("InstanceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingPolicy(value: AutoScalingPolicy): Self = this.set("AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingPolicy: Self = this.set("AutoScalingPolicy", js.undefined)
    
    @scala.inline
    def setBidPrice(value: XmlStringMaxLen256): Self = this.set("BidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPrice: Self = this.set("BidPrice", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = this.set("Configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = this.set("Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurations: Self = this.set("Configurations", js.undefined)
    
    @scala.inline
    def setEbsConfiguration(value: EbsConfiguration): Self = this.set("EbsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsConfiguration: Self = this.set("EbsConfiguration", js.undefined)
    
    @scala.inline
    def setMarket(value: MarketType): Self = this.set("Market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarket: Self = this.set("Market", js.undefined)
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
