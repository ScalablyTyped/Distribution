package typings.checCommerceJs.anon

import typings.checCommerceJs.typesDiscountMod.DiscountType
import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@chec/commerce.js.@chec/commerce.js/types/discount.Discount, 'valid'> */
trait OmitDiscountvalid extends StObject {
  
  var amount_saved: Price
  
  var code: String
  
  var `type`: DiscountType
  
  var value: Double
}
object OmitDiscountvalid {
  
  inline def apply(amount_saved: Price, code: String, `type`: DiscountType, value: Double): OmitDiscountvalid = {
    val __obj = js.Dynamic.literal(amount_saved = amount_saved.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDiscountvalid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitDiscountvalid] (val x: Self) extends AnyVal {
    
    inline def setAmount_saved(value: Price): Self = StObject.set(x, "amount_saved", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setType(value: DiscountType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
