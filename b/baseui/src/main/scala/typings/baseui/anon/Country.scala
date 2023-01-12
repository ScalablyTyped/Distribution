package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  var country: DialCodeString
  
  var text: String
}
object Country {
  
  inline def apply(country: DialCodeString, text: String): Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: DialCodeString): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
