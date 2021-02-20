package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sku extends StObject {
  
  /**
    * The SKU capacity.
    */
  var capacity: js.UndefOr[Double] = js.native
  
  /**
    * The SKU family.
    */
  var family: js.UndefOr[String] = js.native
  
  /**
    * The SKU model.
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * The SKU name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The SKU size.
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * The SKU tier.
    */
  var tier: js.UndefOr[String] = js.native
}
object Sku {
  
  @scala.inline
  def apply(): Sku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sku]
  }
  
  @scala.inline
  implicit class SkuMutableBuilder[Self <: Sku] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
