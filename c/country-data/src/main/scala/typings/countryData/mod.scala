package typings.countryData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("country-data", "lookup")
    @js.native
    val ^ : js.Any = js.native
    
    inline def countries(query: js.Any): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("countries")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country]]
    
    inline def currencies(query: js.Any): js.Array[Currency] = ^.asInstanceOf[js.Dynamic].applyDynamic("currencies")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Currency]]
    
    inline def languages(query: js.Any): js.Array[Language] = ^.asInstanceOf[js.Dynamic].applyDynamic("languages")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Language]]
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
  
  trait Continent extends StObject {
    
    val countries: js.Array[Country]
    
    val name: String
    
    val regions: js.Array[String]
  }
  object Continent {
    
    inline def apply(countries: js.Array[Country], name: String, regions: js.Array[String]): Continent = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Continent]
    }
    
    extension [Self <: Continent](x: Self) {
      
      inline def setCountries(value: js.Array[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesVarargs(value: Country*): Self = StObject.set(x, "countries", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    }
  }
  
  trait Country extends StObject {
    
    val alpha2: String
    
    val alpha3: String
    
    val countryCallingCodes: js.Array[String]
    
    val currencies: js.Array[String]
    
    val emoji: String
    
    val ioc: String
    
    val languages: js.Array[String]
    
    val name: String
    
    val status: String
  }
  object Country {
    
    inline def apply(
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
    
    extension [Self <: Country](x: Self) {
      
      inline def setAlpha2(value: String): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      inline def setAlpha3(value: String): Self = StObject.set(x, "alpha3", value.asInstanceOf[js.Any])
      
      inline def setCountryCallingCodes(value: js.Array[String]): Self = StObject.set(x, "countryCallingCodes", value.asInstanceOf[js.Any])
      
      inline def setCountryCallingCodesVarargs(value: String*): Self = StObject.set(x, "countryCallingCodes", js.Array(value :_*))
      
      inline def setCurrencies(value: js.Array[String]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
      
      inline def setCurrenciesVarargs(value: String*): Self = StObject.set(x, "currencies", js.Array(value :_*))
      
      inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setIoc(value: String): Self = StObject.set(x, "ioc", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Currency extends StObject {
    
    val code: String
    
    val decimals: Double
    
    val name: String
    
    val number: Double
    
    val symbol: String
  }
  object Currency {
    
    inline def apply(code: String, decimals: Double, name: String, number: Double, symbol: String): Currency = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    extension [Self <: Currency](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    val alpha2: String
    
    val alpha3: String
    
    val bibliographic: String
    
    val name: String
  }
  object Language {
    
    inline def apply(alpha2: String, alpha3: String, bibliographic: String, name: String): Language = {
      val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], bibliographic = bibliographic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    extension [Self <: Language](x: Self) {
      
      inline def setAlpha2(value: String): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      inline def setAlpha3(value: String): Self = StObject.set(x, "alpha3", value.asInstanceOf[js.Any])
      
      inline def setBibliographic(value: String): Self = StObject.set(x, "bibliographic", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Region extends StObject {
    
    val countries: js.Array[String]
    
    val name: String
  }
  object Region {
    
    inline def apply(countries: js.Array[String], name: String): Region = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    extension [Self <: Region](x: Self) {
      
      inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
