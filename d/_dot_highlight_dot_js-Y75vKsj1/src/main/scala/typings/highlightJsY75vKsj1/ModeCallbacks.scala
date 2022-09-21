package typings.highlightJsY75vKsj1

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* modes */
trait ModeCallbacks extends StObject {
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.undefined
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.undefined
}
object ModeCallbacks {
  
  inline def apply(): ModeCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeCallbacks]
  }
  
  extension [Self <: ModeCallbacks](x: Self) {
    
    inline def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
    
    inline def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
    
    inline def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
    
    inline def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
  }
}
