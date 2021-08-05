package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  /**
    * The country code of the remote IP address.
    */
  var CountryCode: js.UndefOr[String] = js.undefined
  
  /**
    * The country name of the remote IP address.
    */
  var CountryName: js.UndefOr[String] = js.undefined
}
object Country {
  
  inline def apply(): Country = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Country]
  }
  
  extension [Self <: Country](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setCountryName(value: String): Self = StObject.set(x, "CountryName", value.asInstanceOf[js.Any])
    
    inline def setCountryNameUndefined: Self = StObject.set(x, "CountryName", js.undefined)
  }
}
