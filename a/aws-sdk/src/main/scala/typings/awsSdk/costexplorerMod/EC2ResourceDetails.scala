package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2ResourceDetails extends StObject {
  
  /**
    * The hourly public On-Demand rate for the instance type.
    */
  var HourlyOnDemandRate: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The type of Amazon Web Services instance.
    */
  var InstanceType: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The memory capacity of the Amazon Web Services instance.
    */
  var Memory: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The network performance capacity of the Amazon Web Services instance.
    */
  var NetworkPerformance: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The platform of the Amazon Web Services instance. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Web Services Region of the instance.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The SKU of the product.
    */
  var Sku: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The disk storage of the Amazon Web Services instance. This doesn't include EBS storage.
    */
  var Storage: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The number of VCPU cores in the Amazon Web Services instance type.
    */
  var Vcpu: js.UndefOr[GenericString] = js.undefined
}
object EC2ResourceDetails {
  
  inline def apply(): EC2ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2ResourceDetails]
  }
  
  extension [Self <: EC2ResourceDetails](x: Self) {
    
    inline def setHourlyOnDemandRate(value: GenericString): Self = StObject.set(x, "HourlyOnDemandRate", value.asInstanceOf[js.Any])
    
    inline def setHourlyOnDemandRateUndefined: Self = StObject.set(x, "HourlyOnDemandRate", js.undefined)
    
    inline def setInstanceType(value: GenericString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setMemory(value: GenericString): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
    
    inline def setNetworkPerformance(value: GenericString): Self = StObject.set(x, "NetworkPerformance", value.asInstanceOf[js.Any])
    
    inline def setNetworkPerformanceUndefined: Self = StObject.set(x, "NetworkPerformance", js.undefined)
    
    inline def setPlatform(value: GenericString): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setSku(value: GenericString): Self = StObject.set(x, "Sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "Sku", js.undefined)
    
    inline def setStorage(value: GenericString): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "Storage", js.undefined)
    
    inline def setVcpu(value: GenericString): Self = StObject.set(x, "Vcpu", value.asInstanceOf[js.Any])
    
    inline def setVcpuUndefined: Self = StObject.set(x, "Vcpu", js.undefined)
  }
}
