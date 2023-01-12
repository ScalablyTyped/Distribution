package typings.baseui.anon

import typings.baseui.baseuiStrings.countryChange
import typings.baseui.baseuiStrings.textChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryChange extends StObject {
  
  val countryChange: typings.baseui.baseuiStrings.countryChange
  
  val textChange: typings.baseui.baseuiStrings.textChange
}
object CountryChange {
  
  inline def apply(): CountryChange = {
    val __obj = js.Dynamic.literal(countryChange = "countryChange", textChange = "textChange")
    __obj.asInstanceOf[CountryChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountryChange] (val x: Self) extends AnyVal {
    
    inline def setCountryChange(value: countryChange): Self = StObject.set(x, "countryChange", value.asInstanceOf[js.Any])
    
    inline def setTextChange(value: textChange): Self = StObject.set(x, "textChange", value.asInstanceOf[js.Any])
  }
}
