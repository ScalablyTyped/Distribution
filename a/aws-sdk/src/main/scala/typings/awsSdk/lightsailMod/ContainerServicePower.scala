package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServicePower extends StObject {
  
  /**
    * The number of vCPUs included in the power.
    */
  var cpuCount: js.UndefOr[float] = js.native
  
  /**
    * A Boolean value indicating whether the power is active and can be specified for container services.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  
  /**
    * The friendly name of the power (e.g., nano).
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ID of the power (e.g., nano-1).
    */
  var powerId: js.UndefOr[String] = js.native
  
  /**
    * The monthly price of the power in USD.
    */
  var price: js.UndefOr[float] = js.native
  
  /**
    * The amount of RAM (in GB) of the power.
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
}
object ContainerServicePower {
  
  @scala.inline
  def apply(): ContainerServicePower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServicePower]
  }
  
  @scala.inline
  implicit class ContainerServicePowerMutableBuilder[Self <: ContainerServicePower] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuCount(value: float): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPowerId(value: String): Self = StObject.set(x, "powerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerIdUndefined: Self = StObject.set(x, "powerId", js.undefined)
    
    @scala.inline
    def setPrice(value: float): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setRamSizeInGb(value: float): Self = StObject.set(x, "ramSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamSizeInGbUndefined: Self = StObject.set(x, "ramSizeInGb", js.undefined)
  }
}
