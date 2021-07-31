package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressComponent extends StObject {
  
  var city: String
  
  var district: String
  
  var province: String
  
  var street: String
  
  var streetNumber: String
}
object AddressComponent {
  
  @scala.inline
  def apply(city: String, district: String, province: String, street: String, streetNumber: String): AddressComponent = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent]
  }
  
  @scala.inline
  implicit class AddressComponentMutableBuilder[Self <: AddressComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
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
