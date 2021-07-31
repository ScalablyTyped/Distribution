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
    
    @scala.inline
    def apply(iso2: String, name: String): CountryData = {
      val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryData]
    }
    
    @scala.inline
    implicit class CountryDataMutableBuilder[Self <: CountryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultCountry(value: String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      @scala.inline
      def setOnlyCountries(value: js.Array[String]): Self = StObject.set(x, "onlyCountries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyCountriesUndefined: Self = StObject.set(x, "onlyCountries", js.undefined)
      
      @scala.inline
      def setOnlyCountriesVarargs(value: String*): Self = StObject.set(x, "onlyCountries", js.Array(value :_*))
      
      @scala.inline
      def setPreferredCountries(value: js.Array[String]): Self = StObject.set(x, "preferredCountries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredCountriesUndefined: Self = StObject.set(x, "preferredCountries", js.undefined)
      
      @scala.inline
      def setPreferredCountriesVarargs(value: String*): Self = StObject.set(x, "preferredCountries", js.Array(value :_*))
      
      @scala.inline
      def setResponsiveDropdown(value: Boolean): Self = StObject.set(x, "responsiveDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveDropdownUndefined: Self = StObject.set(x, "responsiveDropdown", js.undefined)
    }
  }
}
