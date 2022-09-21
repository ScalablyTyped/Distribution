package typings.codemirrorView.mod

import typings.codemirrorState.mod.EditorState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineNumberConfig extends StObject {
  
  /**
    Supply event handlers for DOM events on this gutter.
    */
  var domEventHandlers: js.UndefOr[Handlers] = js.undefined
  
  /**
    How to display line numbers. Defaults to simply converting them
    to string.
    */
  var formatNumber: js.UndefOr[js.Function2[/* lineNo */ Double, /* state */ EditorState, String]] = js.undefined
}
object LineNumberConfig {
  
  inline def apply(): LineNumberConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineNumberConfig]
  }
  
  extension [Self <: LineNumberConfig](x: Self) {
    
    inline def setDomEventHandlers(value: Handlers): Self = StObject.set(x, "domEventHandlers", value.asInstanceOf[js.Any])
    
    inline def setDomEventHandlersUndefined: Self = StObject.set(x, "domEventHandlers", js.undefined)
    
    inline def setFormatNumber(value: (/* lineNo */ Double, /* state */ EditorState) => String): Self = StObject.set(x, "formatNumber", js.Any.fromFunction2(value))
    
    inline def setFormatNumberUndefined: Self = StObject.set(x, "formatNumber", js.undefined)
  }
}
