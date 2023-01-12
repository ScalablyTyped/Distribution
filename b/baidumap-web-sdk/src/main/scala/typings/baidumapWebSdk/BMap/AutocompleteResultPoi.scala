package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteResultPoi extends StObject {
  
  var City: String
  
  var business: String
  
  // wtf
  var district: String
  
  var province: String
  
  var street: String
  
  var streetNumber: String
}
object AutocompleteResultPoi {
  
  inline def apply(
    City: String,
    business: String,
    district: String,
    province: String,
    street: String,
    streetNumber: String
  ): AutocompleteResultPoi = {
    val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResultPoi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompleteResultPoi] (val x: Self) extends AnyVal {
    
    inline def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
  }
}
