package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
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
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountry(value: CountryParameters): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivision(value: CountryParameters): Self = this.set("Subdivision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivision: Self = this.set("Subdivision", js.undefined)
  }
}
