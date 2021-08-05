package typings.countryTelephoneData

import typings.countryTelephoneData.countryTelephoneDataBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("country-telephone-data", "allCountries")
  @js.native
  val allCountries: js.Array[Country] = js.native
  
  @JSImport("country-telephone-data", "iso2Lookup")
  @js.native
  val iso2Lookup: Record[String, Country] = js.native
  
  trait Country extends StObject {
    
    var dialCode: String
    
    /** A format string for phone numbers. **This could be an empty string.** */
    var format: String
    
    var hasAreaCodes: js.UndefOr[`true`] = js.undefined
    
    /** The {@link https://w.wiki/4kP |ISO 3166-1 alpha-2} country code (in **lowercase**) */
    var iso2: String
    
    var name: String
    
    var priority: Double
  }
  object Country {
    
    inline def apply(dialCode: String, format: String, iso2: String, name: String, priority: Double): Country = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHasAreaCodes(value: `true`): Self = StObject.set(x, "hasAreaCodes", value.asInstanceOf[js.Any])
      
      inline def setHasAreaCodesUndefined: Self = StObject.set(x, "hasAreaCodes", js.undefined)
      
      inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
}
