package typings.countriesAndTimezones

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("countries-and-timezones", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllCountries(): StringDictionary[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCountries")().asInstanceOf[StringDictionary[Country]]
  
  inline def getAllTimezones(): StringDictionary[Timezone] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllTimezones")().asInstanceOf[StringDictionary[Timezone]]
  
  inline def getCountry(id: String): Country | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any]).asInstanceOf[Country | Null]
  
  inline def getCountryForTimezone(name: String): Country | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Country | Null]
  
  inline def getTimezone(name: String): Timezone | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Timezone | Null]
  
  inline def getTimezonesForCountry(id: String): js.Array[Timezone] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Timezone]]
  
  trait Country extends StObject {
    
    var id: String
    
    var name: String
    
    var timezones: js.Array[String]
  }
  object Country {
    
    inline def apply(id: String, name: String, timezones: js.Array[String]): Country = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timezones = timezones.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTimezones(value: js.Array[String]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      inline def setTimezonesVarargs(value: String*): Self = StObject.set(x, "timezones", js.Array(value :_*))
    }
  }
  
  trait Timezone extends StObject {
    
    var aliasOf: String | Null
    
    var country: String | Null
    
    var dstOffset: Double
    
    var dstOffsetStr: String
    
    var name: String
    
    var utcOffset: Double
    
    var utcOffsetStr: String
  }
  object Timezone {
    
    inline def apply(dstOffset: Double, dstOffsetStr: String, name: String, utcOffset: Double, utcOffsetStr: String): Timezone = {
      val __obj = js.Dynamic.literal(dstOffset = dstOffset.asInstanceOf[js.Any], dstOffsetStr = dstOffsetStr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], utcOffsetStr = utcOffsetStr.asInstanceOf[js.Any], aliasOf = null, country = null)
      __obj.asInstanceOf[Timezone]
    }
    
    extension [Self <: Timezone](x: Self) {
      
      inline def setAliasOf(value: String): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
      
      inline def setAliasOfNull: Self = StObject.set(x, "aliasOf", null)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryNull: Self = StObject.set(x, "country", null)
      
      inline def setDstOffset(value: Double): Self = StObject.set(x, "dstOffset", value.asInstanceOf[js.Any])
      
      inline def setDstOffsetStr(value: String): Self = StObject.set(x, "dstOffsetStr", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
      
      inline def setUtcOffsetStr(value: String): Self = StObject.set(x, "utcOffsetStr", value.asInstanceOf[js.Any])
    }
  }
}
