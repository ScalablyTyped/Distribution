package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyOptions extends StObject {
  
  var keepFocus: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[String] = js.undefined
  
  var reset: js.UndefOr[Boolean] = js.undefined
}
object KeyOptions {
  
  inline def apply(): KeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyOptions]
  }
  
  extension [Self <: KeyOptions](x: Self) {
    
    inline def setKeepFocus(value: Boolean): Self = StObject.set(x, "keepFocus", value.asInstanceOf[js.Any])
    
    inline def setKeepFocusUndefined: Self = StObject.set(x, "keepFocus", js.undefined)
    
    inline def setModifiers(value: String): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
  }
}
