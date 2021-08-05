package typings.countrySelectJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountrySelectJs {
  
  trait CountryData extends StObject {
    
    var iso2: String
    
    var name: String
  }
  object CountryData {
    
    inline def apply(iso2: String, name: String): CountryData = {
      val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryData]
    }
    
    extension [Self <: CountryData](x: Self) {
      
      inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Set the default country by it's country code. Otherwise it will just be
      * the first country in the list.
      */
    var defaultCountry: js.UndefOr[String] = js.undefined
    
    /**
      * Display only the countries you specify. Takes an array of country codes.
      */
    var onlyCountries: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Specify the countries to appear at the top of the list. Defaults to
      * ["us", "gb"]
      */
    var preferredCountries: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Set the dropdown's width to be the same as the input. This is
      * automatically enabled for small screens.
      */
    var responsiveDropdown: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefaultCountry(value: String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      inline def setOnlyCountries(value: js.Array[String]): Self = StObject.set(x, "onlyCountries", value.asInstanceOf[js.Any])
      
      inline def setOnlyCountriesUndefined: Self = StObject.set(x, "onlyCountries", js.undefined)
      
      inline def setOnlyCountriesVarargs(value: String*): Self = StObject.set(x, "onlyCountries", js.Array(value :_*))
      
      inline def setPreferredCountries(value: js.Array[String]): Self = StObject.set(x, "preferredCountries", value.asInstanceOf[js.Any])
      
      inline def setPreferredCountriesUndefined: Self = StObject.set(x, "preferredCountries", js.undefined)
      
      inline def setPreferredCountriesVarargs(value: String*): Self = StObject.set(x, "preferredCountries", js.Array(value :_*))
      
      inline def setResponsiveDropdown(value: Boolean): Self = StObject.set(x, "responsiveDropdown", value.asInstanceOf[js.Any])
      
      inline def setResponsiveDropdownUndefined: Self = StObject.set(x, "responsiveDropdown", js.undefined)
    }
  }
}
