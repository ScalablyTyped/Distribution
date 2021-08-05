package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServicePower extends StObject {
  
  /**
    * The number of vCPUs included in the power.
    */
  var cpuCount: js.UndefOr[float] = js.undefined
  
  /**
    * A Boolean value indicating whether the power is active and can be specified for container services.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The friendly name of the power (e.g., nano).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the power (e.g., nano-1).
    */
  var powerId: js.UndefOr[String] = js.undefined
  
  /**
    * The monthly price of the power in USD.
    */
  var price: js.UndefOr[float] = js.undefined
  
  /**
    * The amount of RAM (in GB) of the power.
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
}
object ContainerServicePower {
  
  inline def apply(): ContainerServicePower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServicePower]
  }
  
  extension [Self <: ContainerServicePower](x: Self) {
    
    inline def setCpuCount(value: float): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPowerId(value: String): Self = StObject.set(x, "powerId", value.asInstanceOf[js.Any])
    
    inline def setPowerIdUndefined: Self = StObject.set(x, "powerId", js.undefined)
    
    inline def setPrice(value: float): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRamSizeInGb(value: float): Self = StObject.set(x, "ramSizeInGb", value.asInstanceOf[js.Any])
    
    inline def setRamSizeInGbUndefined: Self = StObject.set(x, "ramSizeInGb", js.undefined)
  }
}
