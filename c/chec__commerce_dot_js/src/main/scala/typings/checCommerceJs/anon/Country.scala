package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  var country: String
  
  var region: js.UndefOr[String] = js.undefined
  
  var shipping_option_id: String
}
object Country {
  
  inline def apply(country: String, shipping_option_id: String): Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], shipping_option_id = shipping_option_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  
  extension [Self <: Country](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setShipping_option_id(value: String): Self = StObject.set(x, "shipping_option_id", value.asInstanceOf[js.Any])
  }
}
