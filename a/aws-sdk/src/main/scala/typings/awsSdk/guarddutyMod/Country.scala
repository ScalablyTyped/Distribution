package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Country extends StObject {
  
  /**
    * The country code of the remote IP address.
    */
  var CountryCode: js.UndefOr[String] = js.native
  
  /**
    * The country name of the remote IP address.
    */
  var CountryName: js.UndefOr[String] = js.native
}
object Country {
  
  @scala.inline
  def apply(): Country = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    @scala.inline
    def setCountryName(value: String): Self = StObject.set(x, "CountryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNameUndefined: Self = StObject.set(x, "CountryName", js.undefined)
  }
}
