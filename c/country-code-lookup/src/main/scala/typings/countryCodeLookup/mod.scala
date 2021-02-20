package typings.countryCodeLookup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("country-code-lookup", "byCountry")
  @js.native
  def byCountry(country: String): CountryCode = js.native
  
  @JSImport("country-code-lookup", "byFips")
  @js.native
  def byFips(code: String): CountryCode = js.native
  
  @JSImport("country-code-lookup", "byInternet")
  @js.native
  def byInternet(code: String): CountryCode = js.native
  
  @JSImport("country-code-lookup", "byIso")
  @js.native
  def byIso(code: String): CountryCode = js.native
  @JSImport("country-code-lookup", "byIso")
  @js.native
  def byIso(code: Double): CountryCode = js.native
  
  @JSImport("country-code-lookup", "countries")
  @js.native
  val countries: js.Array[CountryCode] = js.native
  
  @js.native
  trait CountryCode extends StObject {
    
    var capital: String = js.native
    
    var continent: String = js.native
    
    var country: String = js.native
    
    var fips: String = js.native
    
    var internet: String = js.native
    
    var iso2: String = js.native
    
    var iso3: String = js.native
    
    var isoNo: String = js.native
    
    var region: String = js.native
  }
  object CountryCode {
    
    @scala.inline
    def apply(
      capital: String,
      continent: String,
      country: String,
      fips: String,
      internet: String,
      iso2: String,
      iso3: String,
      isoNo: String,
      region: String
    ): CountryCode = {
      val __obj = js.Dynamic.literal(capital = capital.asInstanceOf[js.Any], continent = continent.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fips = fips.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], iso3 = iso3.asInstanceOf[js.Any], isoNo = isoNo.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryCode]
    }
    
    @scala.inline
    implicit class CountryCodeMutableBuilder[Self <: CountryCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapital(value: String): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFips(value: String): Self = StObject.set(x, "fips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternet(value: String): Self = StObject.set(x, "internet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIso3(value: String): Self = StObject.set(x, "iso3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsoNo(value: String): Self = StObject.set(x, "isoNo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
}
