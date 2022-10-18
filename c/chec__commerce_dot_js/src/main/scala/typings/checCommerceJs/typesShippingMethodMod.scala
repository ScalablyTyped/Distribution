package typings.checCommerceJs

import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesShippingMethodMod {
  
  trait ShippingMethod extends StObject {
    
    var countries: js.Array[String]
    
    var description: String
    
    var id: String
    
    var price: Price
  }
  object ShippingMethod {
    
    inline def apply(countries: js.Array[String], description: String, id: String, price: Price): ShippingMethod = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShippingMethod]
    }
    
    extension [Self <: ShippingMethod](x: Self) {
      
      inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
}
