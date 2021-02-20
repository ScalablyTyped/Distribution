package typings.countryListJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("country-list-js", "all")
  @js.native
  val all: CountriesMap = js.native
  
  @JSImport("country-list-js", "cache")
  @js.native
  val cache: Cache_ = js.native
  
  @JSImport("country-list-js", "capitals")
  @js.native
  def capitals(): js.Array[String] = js.native
  
  @JSImport("country-list-js", "continents")
  @js.native
  def continents(): js.Array[String] = js.native
  
  @JSImport("country-list-js", "findByCapital")
  @js.native
  def findByCapital(capital: String): js.UndefOr[Country] = js.native
  
  @JSImport("country-list-js", "findByCurrency")
  @js.native
  def findByCurrency(currency: String): js.UndefOr[Country] = js.native
  
  @JSImport("country-list-js", "findByIso2")
  @js.native
  def findByIso2(iso2: String): js.UndefOr[Country] = js.native
  
  @JSImport("country-list-js", "findByIso3")
  @js.native
  def findByIso3(iso3: String): js.UndefOr[Country] = js.native
  
  @JSImport("country-list-js", "findByName")
  @js.native
  def findByName(name: String): js.UndefOr[Country] = js.native
  
  @JSImport("country-list-js", "findByPhoneNbr")
  @js.native
  def findByPhoneNbr(phone: String): js.UndefOr[Country] = js.native
  
  @JSImport("country-list-js", "findByProvince")
  @js.native
  def findByProvince(province: String): js.UndefOr[Country] = js.native
  
  @JSImport("country-list-js", "ls")
  @js.native
  def ls(member: CountryRecordMember): js.Array[js.UndefOr[String]] = js.native
  
  @JSImport("country-list-js", "names")
  @js.native
  def names(): js.Array[String] = js.native
  
  @js.native
  trait Cache_ extends StObject {
    
    var capital: js.UndefOr[CountriesMap] = js.native
    
    var currency: js.UndefOr[CountriesMap] = js.native
    
    var iso3: js.UndefOr[CountriesMap] = js.native
    
    var name: js.UndefOr[CountriesMap] = js.native
    
    var province: js.UndefOr[CountriesMap] = js.native
  }
  object Cache_ {
    
    @scala.inline
    def apply(): Cache_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache_]
    }
    
    @scala.inline
    implicit class Cache_MutableBuilder[Self <: Cache_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapital(value: CountriesMap): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapitalUndefined: Self = StObject.set(x, "capital", js.undefined)
      
      @scala.inline
      def setCurrency(value: CountriesMap): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setIso3(value: CountriesMap): Self = StObject.set(x, "iso3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIso3Undefined: Self = StObject.set(x, "iso3", js.undefined)
      
      @scala.inline
      def setName(value: CountriesMap): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProvince(value: CountriesMap): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
    }
  }
  
  type CountriesMap = StringDictionary[Country]
  
  @js.native
  trait Country extends StObject {
    
    var capital: String = js.native
    
    var code: CountryCode = js.native
    
    var continent: String = js.native
    
    var currency: Currency = js.native
    
    var dialing_code: String = js.native
    
    var name: String = js.native
    
    var provinces: js.Array[Province] = js.native
    
    var region: String = js.native
  }
  object Country {
    
    @scala.inline
    def apply(
      capital: String,
      code: CountryCode,
      continent: String,
      currency: Currency,
      dialing_code: String,
      name: String,
      provinces: js.Array[Province],
      region: String
    ): Country = {
      val __obj = js.Dynamic.literal(capital = capital.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], continent = continent.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dialing_code = dialing_code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provinces = provinces.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapital(value: String): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: CountryCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialing_code(value: String): Self = StObject.set(x, "dialing_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvinces(value: js.Array[Province]): Self = StObject.set(x, "provinces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvincesVarargs(value: Province*): Self = StObject.set(x, "provinces", js.Array(value :_*))
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CountryCode extends StObject {
    
    var iso2: String = js.native
    
    var iso3: String = js.native
  }
  object CountryCode {
    
    @scala.inline
    def apply(iso2: String, iso3: String): CountryCode = {
      val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any], iso3 = iso3.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryCode]
    }
    
    @scala.inline
    implicit class CountryCodeMutableBuilder[Self <: CountryCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIso3(value: String): Self = StObject.set(x, "iso3", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.countryListJs.countryListJsStrings.name
    - typings.countryListJs.countryListJsStrings.region
    - typings.countryListJs.countryListJsStrings.capital
    - typings.countryListJs.countryListJsStrings.continent
    - typings.countryListJs.countryListJsStrings.dialing_code
    - typings.countryListJs.countryListJsStrings.code
    - typings.countryListJs.countryListJsStrings.currency
    - typings.countryListJs.countryListJsStrings.provinces
  */
  trait CountryRecordMember extends StObject
  object CountryRecordMember {
    
    @scala.inline
    def capital: typings.countryListJs.countryListJsStrings.capital = "capital".asInstanceOf[typings.countryListJs.countryListJsStrings.capital]
    
    @scala.inline
    def code: typings.countryListJs.countryListJsStrings.code = "code".asInstanceOf[typings.countryListJs.countryListJsStrings.code]
    
    @scala.inline
    def continent: typings.countryListJs.countryListJsStrings.continent = "continent".asInstanceOf[typings.countryListJs.countryListJsStrings.continent]
    
    @scala.inline
    def currency: typings.countryListJs.countryListJsStrings.currency = "currency".asInstanceOf[typings.countryListJs.countryListJsStrings.currency]
    
    @scala.inline
    def dialing_code: typings.countryListJs.countryListJsStrings.dialing_code = "dialing_code".asInstanceOf[typings.countryListJs.countryListJsStrings.dialing_code]
    
    @scala.inline
    def name: typings.countryListJs.countryListJsStrings.name = "name".asInstanceOf[typings.countryListJs.countryListJsStrings.name]
    
    @scala.inline
    def provinces: typings.countryListJs.countryListJsStrings.provinces = "provinces".asInstanceOf[typings.countryListJs.countryListJsStrings.provinces]
    
    @scala.inline
    def region: typings.countryListJs.countryListJsStrings.region = "region".asInstanceOf[typings.countryListJs.countryListJsStrings.region]
  }
  
  @js.native
  trait Currency extends StObject {
    
    var code: String = js.native
    
    var decimal: String = js.native
    
    var symbol: String = js.native
  }
  object Currency {
    
    @scala.inline
    def apply(code: String, decimal: String, symbol: String): Currency = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Province extends StObject {
    
    var alias: js.Array[String] | Null = js.native
    
    var name: String = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var short: js.UndefOr[String] = js.native
  }
  object Province {
    
    @scala.inline
    def apply(name: String): Province = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Province]
    }
    
    @scala.inline
    implicit class ProvinceMutableBuilder[Self <: Province] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasNull: Self = StObject.set(x, "alias", null)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    }
  }
}
