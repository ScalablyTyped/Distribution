package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inventorymanaged extends StObject {
  
  var active: Boolean
  
  var inventory_managed: Boolean
  
  var pay_what_you_want: Boolean
  
  var sold_out: Boolean
  
  var tax_exempt: Boolean
}
object Inventorymanaged {
  
  inline def apply(
    active: Boolean,
    inventory_managed: Boolean,
    pay_what_you_want: Boolean,
    sold_out: Boolean,
    tax_exempt: Boolean
  ): Inventorymanaged = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inventory_managed = inventory_managed.asInstanceOf[js.Any], pay_what_you_want = pay_what_you_want.asInstanceOf[js.Any], sold_out = sold_out.asInstanceOf[js.Any], tax_exempt = tax_exempt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inventorymanaged]
  }
  
  extension [Self <: Inventorymanaged](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setInventory_managed(value: Boolean): Self = StObject.set(x, "inventory_managed", value.asInstanceOf[js.Any])
    
    inline def setPay_what_you_want(value: Boolean): Self = StObject.set(x, "pay_what_you_want", value.asInstanceOf[js.Any])
    
    inline def setSold_out(value: Boolean): Self = StObject.set(x, "sold_out", value.asInstanceOf[js.Any])
    
    inline def setTax_exempt(value: Boolean): Self = StObject.set(x, "tax_exempt", value.asInstanceOf[js.Any])
  }
}
