package typings.checCommerceJs.anon

import typings.checCommerceJs.typesPriceMod.Price
import typings.checCommerceJs.typesShippingMethodMod.ShippingMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Availableoptions extends StObject {
  
  var available_options: js.Array[ShippingMethod]
  
  var price: Price
}
object Availableoptions {
  
  inline def apply(available_options: js.Array[ShippingMethod], price: Price): Availableoptions = {
    val __obj = js.Dynamic.literal(available_options = available_options.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[Availableoptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Availableoptions] (val x: Self) extends AnyVal {
    
    inline def setAvailable_options(value: js.Array[ShippingMethod]): Self = StObject.set(x, "available_options", value.asInstanceOf[js.Any])
    
    inline def setAvailable_optionsVarargs(value: ShippingMethod*): Self = StObject.set(x, "available_options", js.Array(value*))
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
  }
}
