package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipaddress extends StObject {
  
  var country: js.UndefOr[String] = js.undefined
  
  var ip_address: js.UndefOr[String] = js.undefined
  
  var postal_zip_code: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
}
object Ipaddress {
  
  inline def apply(): Ipaddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipaddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ipaddress] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
    
    inline def setPostal_zip_code(value: String): Self = StObject.set(x, "postal_zip_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_zip_codeUndefined: Self = StObject.set(x, "postal_zip_code", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
