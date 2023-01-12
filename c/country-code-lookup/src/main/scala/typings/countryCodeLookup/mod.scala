package typings.countryCodeLookup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("country-code-lookup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def byCountry(country: String): SearchOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("byCountry")(country.asInstanceOf[js.Any]).asInstanceOf[SearchOutput]
  
  inline def byFips(code: String): SearchOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("byFips")(code.asInstanceOf[js.Any]).asInstanceOf[SearchOutput]
  
  inline def byInternet(code: String): SearchOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("byInternet")(code.asInstanceOf[js.Any]).asInstanceOf[SearchOutput]
  
  inline def byIso(code: String): SearchOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("byIso")(code.asInstanceOf[js.Any]).asInstanceOf[SearchOutput]
  inline def byIso(code: Double): SearchOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("byIso")(code.asInstanceOf[js.Any]).asInstanceOf[SearchOutput]
  
  @JSImport("country-code-lookup", "countries")
  @js.native
  val countries: js.Array[Country] = js.native
  
  trait Country extends StObject {
    
    var capital: String
    
    var continent: String
    
    var country: String
    
    var fips: String
    
    var internet: String
    
    var iso2: String
    
    var iso3: String
    
    var isoNo: String
    
    var region: String
  }
  object Country {
    
    inline def apply(
      capital: String,
      continent: String,
      country: String,
      fips: String,
      internet: String,
      iso2: String,
      iso3: String,
      isoNo: String,
      region: String
    ): Country = {
      val __obj = js.Dynamic.literal(capital = capital.asInstanceOf[js.Any], continent = continent.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fips = fips.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], iso3 = iso3.asInstanceOf[js.Any], isoNo = isoNo.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      inline def setCapital(value: String): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
      
      inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setFips(value: String): Self = StObject.set(x, "fips", value.asInstanceOf[js.Any])
      
      inline def setInternet(value: String): Self = StObject.set(x, "internet", value.asInstanceOf[js.Any])
      
      inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      inline def setIso3(value: String): Self = StObject.set(x, "iso3", value.asInstanceOf[js.Any])
      
      inline def setIsoNo(value: String): Self = StObject.set(x, "isoNo", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  type SearchOutput = Country | Null
}
