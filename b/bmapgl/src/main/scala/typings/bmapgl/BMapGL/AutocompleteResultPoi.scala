package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteResultPoi extends StObject {
  
  var business: String
  
  var city: String
  
  // The offical doc says `City`, but actual code is `city`
  var district: String
  
  var province: String
  
  var street: String
  
  var streetNumber: String
}
object AutocompleteResultPoi {
  
  inline def apply(
    business: String,
    city: String,
    district: String,
    province: String,
    street: String,
    streetNumber: String
  ): AutocompleteResultPoi = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResultPoi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompleteResultPoi] (val x: Self) extends AnyVal {
    
    inline def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
  }
}
