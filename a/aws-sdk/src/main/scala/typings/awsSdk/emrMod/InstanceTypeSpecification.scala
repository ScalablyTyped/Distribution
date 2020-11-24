package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTypeSpecification extends js.Object {
  
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%).
    */
  var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.native
  
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software bundled with Amazon EMR.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  
  /**
    * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by InstanceType.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.native
  
  /**
    * Evaluates to TRUE when the specified InstanceType is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.emrMod.InstanceType] = js.native
  
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. Capacity values represent performance characteristics such as vCPUs, memory, or I/O. If not specified, the default value is 1.
    */
  var WeightedCapacity: js.UndefOr[WholeNumber] = js.native
}
object InstanceTypeSpecification {
  
  @scala.inline
  def apply(): InstanceTypeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeSpecification]
  }
  
  @scala.inline
  implicit class InstanceTypeSpecificationOps[Self <: InstanceTypeSpecification] (val x: Self) extends AnyVal {
    
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
    def setBidPrice(value: XmlStringMaxLen256): Self = this.set("BidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPrice: Self = this.set("BidPrice", js.undefined)
    
    @scala.inline
    def setBidPriceAsPercentageOfOnDemandPrice(value: NonNegativeDouble): Self = this.set("BidPriceAsPercentageOfOnDemandPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidPriceAsPercentageOfOnDemandPrice: Self = this.set("BidPriceAsPercentageOfOnDemandPrice", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = this.set("Configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = this.set("Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurations: Self = this.set("Configurations", js.undefined)
    
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
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: WholeNumber): Self = this.set("WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("WeightedCapacity", js.undefined)
  }
}
