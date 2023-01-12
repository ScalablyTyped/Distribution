package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@chec/commerce.js.@chec/commerce.js/types/address.Address> */
trait PartialAddress extends StObject {
  
  var country: js.UndefOr[String] = js.undefined
  
  var county_state: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var postal_zip_code: js.UndefOr[String] = js.undefined
  
  var street: js.UndefOr[String] = js.undefined
  
  var street_2: js.UndefOr[String | Null] = js.undefined
  
  var town_city: js.UndefOr[String] = js.undefined
}
object PartialAddress {
  
  inline def apply(): PartialAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAddress] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCounty_state(value: String): Self = StObject.set(x, "county_state", value.asInstanceOf[js.Any])
    
    inline def setCounty_stateUndefined: Self = StObject.set(x, "county_state", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPostal_zip_code(value: String): Self = StObject.set(x, "postal_zip_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_zip_codeUndefined: Self = StObject.set(x, "postal_zip_code", js.undefined)
    
    inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
    
    inline def setStreet_2(value: String): Self = StObject.set(x, "street_2", value.asInstanceOf[js.Any])
    
    inline def setStreet_2Null: Self = StObject.set(x, "street_2", null)
    
    inline def setStreet_2Undefined: Self = StObject.set(x, "street_2", js.undefined)
    
    inline def setTown_city(value: String): Self = StObject.set(x, "town_city", value.asInstanceOf[js.Any])
    
    inline def setTown_cityUndefined: Self = StObject.set(x, "town_city", js.undefined)
  }
}
