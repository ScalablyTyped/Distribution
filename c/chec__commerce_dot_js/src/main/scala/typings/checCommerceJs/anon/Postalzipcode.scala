package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Postalzipcode extends StObject {
  
  var country: String
  
  var ip_address: String | Null
  
  var postal_zip_code: String
  
  var region: String
}
object Postalzipcode {
  
  inline def apply(country: String, postal_zip_code: String, region: String): Postalzipcode = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], postal_zip_code = postal_zip_code.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], ip_address = null)
    __obj.asInstanceOf[Postalzipcode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Postalzipcode] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    inline def setIp_addressNull: Self = StObject.set(x, "ip_address", null)
    
    inline def setPostal_zip_code(value: String): Self = StObject.set(x, "postal_zip_code", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
