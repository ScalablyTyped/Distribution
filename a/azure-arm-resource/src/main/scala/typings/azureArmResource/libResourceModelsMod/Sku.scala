package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sku extends StObject {
  
  /**
    * The SKU capacity.
    */
  var capacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The SKU family.
    */
  var family: js.UndefOr[String] = js.undefined
  
  /**
    * The SKU model.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * The SKU name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The SKU size.
    */
  var size: js.UndefOr[String] = js.undefined
  
  /**
    * The SKU tier.
    */
  var tier: js.UndefOr[String] = js.undefined
}
object Sku {
  
  inline def apply(): Sku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sku]
  }
  
  extension [Self <: Sku](x: Self) {
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
