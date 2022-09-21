package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundle extends StObject {
  
  /**
    * The bundle ID (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of vCPUs included in the bundle (e.g., 2).
    */
  var cpuCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The size of the SSD (e.g., 30).
    */
  var diskSizeInGb: js.UndefOr[integer] = js.undefined
  
  /**
    * The Amazon EC2 instance type (e.g., t2.micro).
    */
  var instanceType: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value indicating whether the bundle is active.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A friendly name for the bundle (e.g., Micro).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A numeric value that represents the power of the bundle (e.g., 500). You can use the bundle's power value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
    */
  var power: js.UndefOr[integer] = js.undefined
  
  /**
    * The price in US dollars (e.g., 5.0) of the bundle.
    */
  var price: js.UndefOr[float] = js.undefined
  
  /**
    * The amount of RAM in GB (e.g., 2.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
  
  /**
    * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only launch a WINDOWS bundle on a blueprint that supports the WINDOWS platform. LINUX_UNIX blueprints require a LINUX_UNIX bundle.
    */
  var supportedPlatforms: js.UndefOr[InstancePlatformList] = js.undefined
  
  /**
    * The data transfer rate per month in GB (e.g., 2000).
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.undefined
}
object Bundle {
  
  inline def apply(): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bundle]
  }
  
  extension [Self <: Bundle](x: Self) {
    
    inline def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setCpuCount(value: integer): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    inline def setDiskSizeInGb(value: integer): Self = StObject.set(x, "diskSizeInGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeInGbUndefined: Self = StObject.set(x, "diskSizeInGb", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPower(value: integer): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    inline def setPrice(value: float): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRamSizeInGb(value: float): Self = StObject.set(x, "ramSizeInGb", value.asInstanceOf[js.Any])
    
    inline def setRamSizeInGbUndefined: Self = StObject.set(x, "ramSizeInGb", js.undefined)
    
    inline def setSupportedPlatforms(value: InstancePlatformList): Self = StObject.set(x, "supportedPlatforms", value.asInstanceOf[js.Any])
    
    inline def setSupportedPlatformsUndefined: Self = StObject.set(x, "supportedPlatforms", js.undefined)
    
    inline def setSupportedPlatformsVarargs(value: InstancePlatform*): Self = StObject.set(x, "supportedPlatforms", js.Array(value*))
    
    inline def setTransferPerMonthInGb(value: integer): Self = StObject.set(x, "transferPerMonthInGb", value.asInstanceOf[js.Any])
    
    inline def setTransferPerMonthInGbUndefined: Self = StObject.set(x, "transferPerMonthInGb", js.undefined)
  }
}
