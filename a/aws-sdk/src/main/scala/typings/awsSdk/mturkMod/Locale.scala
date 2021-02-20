package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends StObject {
  
  /**
    *  The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the United States of America. 
    */
  var Country: CountryParameters = js.native
  
  /**
    * The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA refers to the state of Washington.
    */
  var Subdivision: js.UndefOr[CountryParameters] = js.native
}
object Locale {
  
  @scala.inline
  def apply(Country: CountryParameters): Locale = {
    val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: CountryParameters): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivision(value: CountryParameters): Self = StObject.set(x, "Subdivision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionUndefined: Self = StObject.set(x, "Subdivision", js.undefined)
  }
}
