package typings.countryData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object callingCodes {
    
    @JSImport("country-data", "callingCodes.all")
    @js.native
    val all: js.Array[String] = js.native
  }
  
  object callingCountries {
    
    @JSImport("country-data", "callingCountries.all")
    @js.native
    val all: js.Array[Country] = js.native
  }
  
  object continents {
    
    @JSImport("country-data", "continents.africa")
    @js.native
    val africa: Continent = js.native
    
    @JSImport("country-data", "continents.antarctica")
    @js.native
    val antarctica: Continent = js.native
    
    @JSImport("country-data", "continents.asia")
    @js.native
    val asia: Continent = js.native
    
    @JSImport("country-data", "continents.europe")
    @js.native
    val europe: Continent = js.native
    
    @JSImport("country-data", "continents.northAmerica")
    @js.native
    val northAmerica: Continent = js.native
    
    @JSImport("country-data", "continents.oceania")
    @js.native
    val oceania: Continent = js.native
    
    @JSImport("country-data", "continents.southAmerica")
    @js.native
    val southAmerica: Continent = js.native
  }
  
  object countries {
    
    @JSImport("country-data", "countries.all")
    @js.native
    val all: js.Array[Country] = js.native
  }
  
  object currencies {
    
    @JSImport("country-data", "currencies.all")
    @js.native
    val all: js.Array[Currency] = js.native
  }
  
  object languages {
    
    @JSImport("country-data", "languages.all")
    @js.native
    val all: js.Array[Language] = js.native
  }
  
  object lookup {
    
    @JSImport("country-data", "lookup.countries")
    @js.native
    def countries(query: js.Any): js.Array[Country] = js.native
    
    @JSImport("country-data", "lookup.currencies")
    @js.native
    def currencies(query: js.Any): js.Array[Currency] = js.native
    
    @JSImport("country-data", "lookup.languages")
    @js.native
    def languages(query: js.Any): js.Array[Language] = js.native
  }
  
  object regions {
    
    @JSImport("country-data", "regions.antarctica")
    @js.native
    val antarctica: Region = js.native
    
    @JSImport("country-data", "regions.australia")
    @js.native
    val australia: Region = js.native
    
    @JSImport("country-data", "regions.caribbean")
    @js.native
    val caribbean: Region = js.native
    
    @JSImport("country-data", "regions.centralAfrica")
    @js.native
    val centralAfrica: Region = js.native
    
    @JSImport("country-data", "regions.centralAmerica")
    @js.native
    val centralAmerica: Region = js.native
    
    @JSImport("country-data", "regions.centralAsia")
    @js.native
    val centralAsia: Region = js.native
    
    @JSImport("country-data", "regions.eastAfrica")
    @js.native
    val eastAfrica: Region = js.native
    
    @JSImport("country-data", "regions.eastAsia")
    @js.native
    val eastAsia: Region = js.native
    
    @JSImport("country-data", "regions.easternEurope")
    @js.native
    val easternEurope: Region = js.native
    
    @JSImport("country-data", "regions.melanesia")
    @js.native
    val melanesia: Region = js.native
    
    @JSImport("country-data", "regions.micronesia")
    @js.native
    val micronesia: Region = js.native
    
    @JSImport("country-data", "regions.northAfrica")
    @js.native
    val northAfrica: Region = js.native
    
    @JSImport("country-data", "regions.northernAmerica")
    @js.native
    val northernAmerica: Region = js.native
    
    @JSImport("country-data", "regions.northernEurope")
    @js.native
    val northernEurope: Region = js.native
    
    @JSImport("country-data", "regions.polynesia")
    @js.native
    val polynesia: Region = js.native
    
    @JSImport("country-data", "regions.southAmerica")
    @js.native
    val southAmerica: Region = js.native
    
    @JSImport("country-data", "regions.southeastAsia")
    @js.native
    val southeastAsia: Region = js.native
    
    @JSImport("country-data", "regions.southernAfrica")
    @js.native
    val southernAfrica: Region = js.native
    
    @JSImport("country-data", "regions.southernAsia")
    @js.native
    val southernAsia: Region = js.native
    
    @JSImport("country-data", "regions.southernEurope")
    @js.native
    val southernEurope: Region = js.native
    
    @JSImport("country-data", "regions.westAfrica")
    @js.native
    val westAfrica: Region = js.native
    
    @JSImport("country-data", "regions.westernAsia")
    @js.native
    val westernAsia: Region = js.native
    
    @JSImport("country-data", "regions.westernEurope")
    @js.native
    val westernEurope: Region = js.native
  }
  
  @js.native
  trait Continent extends StObject {
    
    val countries: js.Array[Country] = js.native
    
    val name: String = js.native
    
    val regions: js.Array[String] = js.native
  }
  object Continent {
    
    @scala.inline
    def apply(countries: js.Array[Country], name: String, regions: js.Array[String]): Continent = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Continent]
    }
    
    @scala.inline
    implicit class ContinentMutableBuilder[Self <: Continent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountries(value: js.Array[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountriesVarargs(value: Country*): Self = StObject.set(x, "countries", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Country extends StObject {
    
    val alpha2: String = js.native
    
    val alpha3: String = js.native
    
    val countryCallingCodes: js.Array[String] = js.native
    
    val currencies: js.Array[String] = js.native
    
    val emoji: String = js.native
    
    val ioc: String = js.native
    
    val languages: js.Array[String] = js.native
    
    val name: String = js.native
    
    val status: String = js.native
  }
  object Country {
    
    @scala.inline
    def apply(
      alpha2: String,
      alpha3: String,
      countryCallingCodes: js.Array[String],
      currencies: js.Array[String],
      emoji: String,
      ioc: String,
      languages: js.Array[String],
      name: String,
      status: String
    ): Country = {
      val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], countryCallingCodes = countryCallingCodes.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], ioc = ioc.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha2(value: String): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha3(value: String): Self = StObject.set(x, "alpha3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCallingCodes(value: js.Array[String]): Self = StObject.set(x, "countryCallingCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCallingCodesVarargs(value: String*): Self = StObject.set(x, "countryCallingCodes", js.Array(value :_*))
      
      @scala.inline
      def setCurrencies(value: js.Array[String]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrenciesVarargs(value: String*): Self = StObject.set(x, "currencies", js.Array(value :_*))
      
      @scala.inline
      def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIoc(value: String): Self = StObject.set(x, "ioc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Currency extends StObject {
    
    val code: String = js.native
    
    val decimals: Double = js.native
    
    val name: String = js.native
    
    val number: Double = js.native
    
    val symbol: String = js.native
  }
  object Currency {
    
    @scala.inline
    def apply(code: String, decimals: Double, name: String, number: Double, symbol: String): Currency = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Language extends StObject {
    
    val alpha2: String = js.native
    
    val alpha3: String = js.native
    
    val bibliographic: String = js.native
    
    val name: String = js.native
  }
  object Language {
    
    @scala.inline
    def apply(alpha2: String, alpha3: String, bibliographic: String, name: String): Language = {
      val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], bibliographic = bibliographic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha2(value: String): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha3(value: String): Self = StObject.set(x, "alpha3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBibliographic(value: String): Self = StObject.set(x, "bibliographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Region extends StObject {
    
    val countries: js.Array[String] = js.native
    
    val name: String = js.native
  }
  object Region {
    
    @scala.inline
    def apply(countries: js.Array[String], name: String): Region = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    @scala.inline
    implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
