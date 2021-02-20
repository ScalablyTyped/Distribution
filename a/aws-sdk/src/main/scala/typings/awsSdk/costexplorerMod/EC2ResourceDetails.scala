package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2ResourceDetails extends StObject {
  
  /**
    *  Hourly public On-Demand rate for the instance type.
    */
  var HourlyOnDemandRate: js.UndefOr[GenericString] = js.native
  
  /**
    *  The type of AWS instance.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  
  /**
    *  Memory capacity of the AWS instance.
    */
  var Memory: js.UndefOr[GenericString] = js.native
  
  /**
    *  Network performance capacity of the AWS instance.
    */
  var NetworkPerformance: js.UndefOr[GenericString] = js.native
  
  /**
    *  The platform of the AWS instance. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.native
  
  /**
    *  The AWS Region of the instance.
    */
  var Region: js.UndefOr[GenericString] = js.native
  
  /**
    *  The SKU of the product.
    */
  var Sku: js.UndefOr[GenericString] = js.native
  
  /**
    *  The disk storage of the AWS instance (not EBS storage).
    */
  var Storage: js.UndefOr[GenericString] = js.native
  
  /**
    *  Number of VCPU cores in the AWS instance type.
    */
  var Vcpu: js.UndefOr[GenericString] = js.native
}
object EC2ResourceDetails {
  
  @scala.inline
  def apply(): EC2ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2ResourceDetails]
  }
  
  @scala.inline
  implicit class EC2ResourceDetailsMutableBuilder[Self <: EC2ResourceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHourlyOnDemandRate(value: GenericString): Self = StObject.set(x, "HourlyOnDemandRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyOnDemandRateUndefined: Self = StObject.set(x, "HourlyOnDemandRate", js.undefined)
    
    @scala.inline
    def setInstanceType(value: GenericString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setMemory(value: GenericString): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
    
    @scala.inline
    def setNetworkPerformance(value: GenericString): Self = StObject.set(x, "NetworkPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPerformanceUndefined: Self = StObject.set(x, "NetworkPerformance", js.undefined)
    
    @scala.inline
    def setPlatform(value: GenericString): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setSku(value: GenericString): Self = StObject.set(x, "Sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuUndefined: Self = StObject.set(x, "Sku", js.undefined)
    
    @scala.inline
    def setStorage(value: GenericString): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "Storage", js.undefined)
    
    @scala.inline
    def setVcpu(value: GenericString): Self = StObject.set(x, "Vcpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcpuUndefined: Self = StObject.set(x, "Vcpu", js.undefined)
  }
}
