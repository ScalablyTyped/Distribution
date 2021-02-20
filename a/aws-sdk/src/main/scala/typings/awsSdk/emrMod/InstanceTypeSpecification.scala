package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTypeSpecification extends StObject {
  
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
  implicit class InstanceTypeSpecificationMutableBuilder[Self <: InstanceTypeSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidPrice(value: XmlStringMaxLen256): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceAsPercentageOfOnDemandPrice(value: NonNegativeDouble): Self = StObject.set(x, "BidPriceAsPercentageOfOnDemandPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceAsPercentageOfOnDemandPriceUndefined: Self = StObject.set(x, "BidPriceAsPercentageOfOnDemandPrice", js.undefined)
    
    @scala.inline
    def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    @scala.inline
    def setConfigurations(value: ConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value :_*))
    
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
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: WholeNumber): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
