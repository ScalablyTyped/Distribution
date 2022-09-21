package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/phone-input/types.State> */
trait PartialState extends StObject {
  
  var country: js.UndefOr[typings.baseui.phoneInputTypesMod.Country] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PartialState {
  
  inline def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  extension [Self <: PartialState](x: Self) {
    
    inline def setCountry(value: typings.baseui.phoneInputTypesMod.Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
