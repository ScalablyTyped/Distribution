package typings.checCommerceJs

import org.scalablytyped.runtime.StringDictionary
import typings.checCommerceJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresServicesMod {
  
  @JSImport("@chec/commerce.js/features/services", "Services")
  @js.native
  open class Services protected () extends StObject {
    def this(commerce: ^) = this()
    
    def localeListCountries(): js.Promise[LocaleListCountriesResponse] = js.native
    
    def localeListShippingCountries(token: String): js.Promise[LocaleListCountriesResponse] = js.native
    
    def localeListShippingSubdivisions(token: String, countryCode: String): js.Promise[LocaleListSubdivisionsResponse] = js.native
    
    def localeListSubdivisions(countryCode: String): js.Promise[LocaleListSubdivisionsResponse] = js.native
  }
  
  trait LocaleListCountriesResponse extends StObject {
    
    var countries: StringDictionary[String]
    
    var html: String
  }
  object LocaleListCountriesResponse {
    
    inline def apply(countries: StringDictionary[String], html: String): LocaleListCountriesResponse = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleListCountriesResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocaleListCountriesResponse] (val x: Self) extends AnyVal {
      
      inline def setCountries(value: StringDictionary[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocaleListSubdivisionsResponse extends StObject {
    
    var html: String
    
    var subdivisions: StringDictionary[String]
  }
  object LocaleListSubdivisionsResponse {
    
    inline def apply(html: String, subdivisions: StringDictionary[String]): LocaleListSubdivisionsResponse = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], subdivisions = subdivisions.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleListSubdivisionsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocaleListSubdivisionsResponse] (val x: Self) extends AnyVal {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setSubdivisions(value: StringDictionary[String]): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    }
  }
}
