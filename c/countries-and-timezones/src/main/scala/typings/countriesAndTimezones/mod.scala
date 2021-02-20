package typings.countriesAndTimezones

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("countries-and-timezones", "getAllCountries")
  @js.native
  def getAllCountries(): StringDictionary[Country] = js.native
  
  @JSImport("countries-and-timezones", "getAllTimezones")
  @js.native
  def getAllTimezones(): StringDictionary[Timezone] = js.native
  
  @JSImport("countries-and-timezones", "getCountry")
  @js.native
  def getCountry(id: String): Country | Null = js.native
  
  @JSImport("countries-and-timezones", "getCountryForTimezone")
  @js.native
  def getCountryForTimezone(name: String): Country | Null = js.native
  
  @JSImport("countries-and-timezones", "getTimezone")
  @js.native
  def getTimezone(name: String): Timezone | Null = js.native
  
  @JSImport("countries-and-timezones", "getTimezonesForCountry")
  @js.native
  def getTimezonesForCountry(id: String): js.Array[Timezone] = js.native
  
  @js.native
  trait Country extends StObject {
    
    var id: String = js.native
    
    var name: String = js.native
    
    var timezones: js.Array[String] = js.native
  }
  object Country {
    
    @scala.inline
    def apply(id: String, name: String, timezones: js.Array[String]): Country = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timezones = timezones.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezones(value: js.Array[String]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezonesVarargs(value: String*): Self = StObject.set(x, "timezones", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Timezone extends StObject {
    
    var aliasOf: String | Null = js.native
    
    var country: String | Null = js.native
    
    var dstOffset: Double = js.native
    
    var dstOffsetStr: String = js.native
    
    var name: String = js.native
    
    var utcOffset: Double = js.native
    
    var utcOffsetStr: String = js.native
  }
  object Timezone {
    
    @scala.inline
    def apply(dstOffset: Double, dstOffsetStr: String, name: String, utcOffset: Double, utcOffsetStr: String): Timezone = {
      val __obj = js.Dynamic.literal(dstOffset = dstOffset.asInstanceOf[js.Any], dstOffsetStr = dstOffsetStr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], utcOffsetStr = utcOffsetStr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timezone]
    }
    
    @scala.inline
    implicit class TimezoneMutableBuilder[Self <: Timezone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasOf(value: String): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasOfNull: Self = StObject.set(x, "aliasOf", null)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryNull: Self = StObject.set(x, "country", null)
      
      @scala.inline
      def setDstOffset(value: Double): Self = StObject.set(x, "dstOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDstOffsetStr(value: String): Self = StObject.set(x, "dstOffsetStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcOffsetStr(value: String): Self = StObject.set(x, "utcOffsetStr", value.asInstanceOf[js.Any])
    }
  }
}
