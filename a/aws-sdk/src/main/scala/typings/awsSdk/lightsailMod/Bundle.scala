package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bundle extends StObject {
  
  /**
    * The bundle ID (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of vCPUs included in the bundle (e.g., 2).
    */
  var cpuCount: js.UndefOr[integer] = js.native
  
  /**
    * The size of the SSD (e.g., 30).
    */
  var diskSizeInGb: js.UndefOr[integer] = js.native
  
  /**
    * The Amazon EC2 instance type (e.g., t2.micro).
    */
  var instanceType: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value indicating whether the bundle is active.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  
  /**
    * A friendly name for the bundle (e.g., Micro).
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A numeric value that represents the power of the bundle (e.g., 500). You can use the bundle's power value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
    */
  var power: js.UndefOr[integer] = js.native
  
  /**
    * The price in US dollars (e.g., 5.0) of the bundle.
    */
  var price: js.UndefOr[float] = js.native
  
  /**
    * The amount of RAM in GB (e.g., 2.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
  
  /**
    * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only launch a WINDOWS bundle on a blueprint that supports the WINDOWS platform. LINUX_UNIX blueprints require a LINUX_UNIX bundle.
    */
  var supportedPlatforms: js.UndefOr[InstancePlatformList] = js.native
  
  /**
    * The data transfer rate per month in GB (e.g., 2000).
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.native
}
object Bundle {
  
  @scala.inline
  def apply(): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bundle]
  }
  
  @scala.inline
  implicit class BundleMutableBuilder[Self <: Bundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setCpuCount(value: integer): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    @scala.inline
    def setDiskSizeInGb(value: integer): Self = StObject.set(x, "diskSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeInGbUndefined: Self = StObject.set(x, "diskSizeInGb", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPower(value: integer): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    @scala.inline
    def setPrice(value: float): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setRamSizeInGb(value: float): Self = StObject.set(x, "ramSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamSizeInGbUndefined: Self = StObject.set(x, "ramSizeInGb", js.undefined)
    
    @scala.inline
    def setSupportedPlatforms(value: InstancePlatformList): Self = StObject.set(x, "supportedPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPlatformsUndefined: Self = StObject.set(x, "supportedPlatforms", js.undefined)
    
    @scala.inline
    def setSupportedPlatformsVarargs(value: InstancePlatform*): Self = StObject.set(x, "supportedPlatforms", js.Array(value :_*))
    
    @scala.inline
    def setTransferPerMonthInGb(value: integer): Self = StObject.set(x, "transferPerMonthInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferPerMonthInGbUndefined: Self = StObject.set(x, "transferPerMonthInGb", js.undefined)
  }
}
