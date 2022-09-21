package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  /**
    * The 2-letter ISO 3166 country code for the country.
    */
  var CountryCode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the country.
    */
  var CountryName: js.UndefOr[NonEmptyString] = js.undefined
}
object Country {
  
  inline def apply(): Country = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Country]
  }
  
  extension [Self <: Country](x: Self) {
    
    inline def setCountryCode(value: NonEmptyString): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setCountryName(value: NonEmptyString): Self = StObject.set(x, "CountryName", value.asInstanceOf[js.Any])
    
    inline def setCountryNameUndefined: Self = StObject.set(x, "CountryName", js.undefined)
  }
}
