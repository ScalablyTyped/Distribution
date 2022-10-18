package typings.checCommerceJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddressMod {
  
  trait Address extends StObject {
    
    var country: String
    
    var county_state: String
    
    var meta: js.UndefOr[Any] = js.undefined
    
    var name: String
    
    var postal_zip_code: String
    
    var street: String
    
    var street_2: String | Null
    
    var town_city: String
  }
  object Address {
    
    inline def apply(
      country: String,
      county_state: String,
      name: String,
      postal_zip_code: String,
      street: String,
      town_city: String
    ): Address = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], county_state = county_state.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postal_zip_code = postal_zip_code.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], town_city = town_city.asInstanceOf[js.Any], street_2 = null)
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCounty_state(value: String): Self = StObject.set(x, "county_state", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPostal_zip_code(value: String): Self = StObject.set(x, "postal_zip_code", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setStreet_2(value: String): Self = StObject.set(x, "street_2", value.asInstanceOf[js.Any])
      
      inline def setStreet_2Null: Self = StObject.set(x, "street_2", null)
      
      inline def setTown_city(value: String): Self = StObject.set(x, "town_city", value.asInstanceOf[js.Any])
    }
  }
}
