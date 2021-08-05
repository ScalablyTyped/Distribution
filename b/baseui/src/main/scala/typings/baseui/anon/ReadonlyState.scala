package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/phone-input.State> */
trait ReadonlyState extends StObject {
  
  val country: ReadonlyCountry
  
  val text: js.UndefOr[String] = js.undefined
}
object ReadonlyState {
  
  inline def apply(country: ReadonlyCountry): ReadonlyState = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
  
  extension [Self <: ReadonlyState](x: Self) {
    
    inline def setCountry(value: ReadonlyCountry): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
