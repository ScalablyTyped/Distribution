package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteResultPoi extends StObject {
  
  var City: String = js.native
  
  var business: String = js.native
  
  // wtf
  var district: String = js.native
  
  var province: String = js.native
  
  var street: String = js.native
  
  var streetNumber: String = js.native
}
object AutocompleteResultPoi {
  
  @scala.inline
  def apply(
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
  implicit class AutocompleteResultPoiMutableBuilder[Self <: AutocompleteResultPoi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
  }
}
