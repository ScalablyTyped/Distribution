package typings.codemirrorView.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionConfig extends StObject {
  
  /**
    The length of a full cursor blink cycle, in milliseconds.
    Defaults to 1200. Can be set to 0 to disable blinking.
    */
  var cursorBlinkRate: js.UndefOr[Double] = js.undefined
  
  /**
    Whether to show a cursor for non-empty ranges. Defaults to
    true.
    */
  var drawRangeCursor: js.UndefOr[Boolean] = js.undefined
}
object SelectionConfig {
  
  inline def apply(): SelectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionConfig]
  }
  
  extension [Self <: SelectionConfig](x: Self) {
    
    inline def setCursorBlinkRate(value: Double): Self = StObject.set(x, "cursorBlinkRate", value.asInstanceOf[js.Any])
    
    inline def setCursorBlinkRateUndefined: Self = StObject.set(x, "cursorBlinkRate", js.undefined)
    
    inline def setDrawRangeCursor(value: Boolean): Self = StObject.set(x, "drawRangeCursor", value.asInstanceOf[js.Any])
    
    inline def setDrawRangeCursorUndefined: Self = StObject.set(x, "drawRangeCursor", js.undefined)
  }
}
