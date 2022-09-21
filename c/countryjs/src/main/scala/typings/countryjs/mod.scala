package typings.countryjs

import typings.countryjs.anon.Alpha2
import typings.countryjs.anon.De
import typings.countryjs.countryjsStrings.ISO2
import typings.countryjs.countryjsStrings.ISO3
import typings.countryjs.countryjsStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("countryjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ISOcodes(name: String): js.UndefOr[Alpha2] = ^.asInstanceOf[js.Dynamic].applyDynamic("ISOcodes")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Alpha2]]
  inline def ISOcodes(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[Alpha2] = (^.asInstanceOf[js.Dynamic].applyDynamic("ISOcodes")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Alpha2]]
  
  inline def all(): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Array[Country]]
  
  inline def altSpellings(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altSpellings")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def altSpellings(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("altSpellings")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def area(name: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def area(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def borders(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("borders")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def borders(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("borders")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def callingCodes(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("callingCodes")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def callingCodes(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("callingCodes")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def capital(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("capital")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def capital(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("capital")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def currencies(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("currencies")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def currencies(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("currencies")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def demonym(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("demonym")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def demonym(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("demonym")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def flag(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("flag")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def flag(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("flag")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def info(name: String): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  inline def info(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[Country] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Country]]
  
  inline def languages(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("languages")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def languages(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("languages")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def latlng(name: String): js.UndefOr[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("latlng")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Tuple2[Double, Double]]]
  inline def latlng(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("latlng")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[Double, Double]]]
  
  inline def name(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def name(name: String, mode: ISO2 | ISO3 | typings.countryjs.countryjsStrings.name): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def nativeName(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeName")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def nativeName(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeName")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def population(name: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("population")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def population(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("population")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def provinces(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("provinces")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def provinces(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("provinces")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def region(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("region")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def region(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("region")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def states(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("states")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def states(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("states")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def subregion(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("subregion")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def subregion(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("subregion")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def timezones(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timezones")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def timezones(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("timezones")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def tld(name: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tld")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def tld(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tld")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def translations(name: String): js.UndefOr[De] = ^.asInstanceOf[js.Dynamic].applyDynamic("translations")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[De]]
  inline def translations(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[De] = (^.asInstanceOf[js.Dynamic].applyDynamic("translations")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[De]]
  
  inline def wiki(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("wiki")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def wiki(name: String, mode: ISO2 | ISO3 | name): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiki")(name.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait Country extends StObject {
    
    var ISO: Alpha2
    
    var altSpellings: js.Array[String]
    
    var area: Double
    
    var borders: js.Array[String]
    
    var callingCodes: js.Array[String]
    
    var capital: String
    
    var currencies: js.Array[String]
    
    var demonym: String
    
    var flag: String
    
    var languages: js.Array[String]
    
    var latlng: js.Array[Double]
    
    var name: String
    
    var nativeName: String
    
    var population: Double
    
    var provinces: js.Array[Any]
    
    var region: String
    
    var subregion: String
    
    var timezones: js.Array[Any]
    
    var tld: js.Array[String]
    
    var translations: De
    
    var wiki: String
  }
  object Country {
    
    inline def apply(
      ISO: Alpha2,
      altSpellings: js.Array[String],
      area: Double,
      borders: js.Array[String],
      callingCodes: js.Array[String],
      capital: String,
      currencies: js.Array[String],
      demonym: String,
      flag: String,
      languages: js.Array[String],
      latlng: js.Array[Double],
      name: String,
      nativeName: String,
      population: Double,
      provinces: js.Array[Any],
      region: String,
      subregion: String,
      timezones: js.Array[Any],
      tld: js.Array[String],
      translations: De,
      wiki: String
    ): Country = {
      val __obj = js.Dynamic.literal(ISO = ISO.asInstanceOf[js.Any], altSpellings = altSpellings.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any], callingCodes = callingCodes.asInstanceOf[js.Any], capital = capital.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], demonym = demonym.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any], population = population.asInstanceOf[js.Any], provinces = provinces.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], subregion = subregion.asInstanceOf[js.Any], timezones = timezones.asInstanceOf[js.Any], tld = tld.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], wiki = wiki.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setAltSpellings(value: js.Array[String]): Self = StObject.set(x, "altSpellings", value.asInstanceOf[js.Any])
      
      inline def setAltSpellingsVarargs(value: String*): Self = StObject.set(x, "altSpellings", js.Array(value*))
      
      inline def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setBorders(value: js.Array[String]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      inline def setBordersVarargs(value: String*): Self = StObject.set(x, "borders", js.Array(value*))
      
      inline def setCallingCodes(value: js.Array[String]): Self = StObject.set(x, "callingCodes", value.asInstanceOf[js.Any])
      
      inline def setCallingCodesVarargs(value: String*): Self = StObject.set(x, "callingCodes", js.Array(value*))
      
      inline def setCapital(value: String): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
      
      inline def setCurrencies(value: js.Array[String]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
      
      inline def setCurrenciesVarargs(value: String*): Self = StObject.set(x, "currencies", js.Array(value*))
      
      inline def setDemonym(value: String): Self = StObject.set(x, "demonym", value.asInstanceOf[js.Any])
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setISO(value: Alpha2): Self = StObject.set(x, "ISO", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setLatlng(value: js.Array[Double]): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
      
      inline def setLatlngVarargs(value: Double*): Self = StObject.set(x, "latlng", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNativeName(value: String): Self = StObject.set(x, "nativeName", value.asInstanceOf[js.Any])
      
      inline def setPopulation(value: Double): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
      
      inline def setProvinces(value: js.Array[Any]): Self = StObject.set(x, "provinces", value.asInstanceOf[js.Any])
      
      inline def setProvincesVarargs(value: Any*): Self = StObject.set(x, "provinces", js.Array(value*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setSubregion(value: String): Self = StObject.set(x, "subregion", value.asInstanceOf[js.Any])
      
      inline def setTimezones(value: js.Array[Any]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      inline def setTimezonesVarargs(value: Any*): Self = StObject.set(x, "timezones", js.Array(value*))
      
      inline def setTld(value: js.Array[String]): Self = StObject.set(x, "tld", value.asInstanceOf[js.Any])
      
      inline def setTldVarargs(value: String*): Self = StObject.set(x, "tld", js.Array(value*))
      
      inline def setTranslations(value: De): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setWiki(value: String): Self = StObject.set(x, "wiki", value.asInstanceOf[js.Any])
    }
  }
}
