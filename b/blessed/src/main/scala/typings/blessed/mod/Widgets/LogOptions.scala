package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOptions
  extends StObject
     with ScrollableTextOptions {
  
  /**
    * scroll to bottom on input even if the user has scrolled up. default: false.
    */
  var scrollOnInput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * amount of scrollback allowed. default: Infinity.
    */
  var scrollback: js.UndefOr[Double] = js.undefined
}
object LogOptions {
  
  inline def apply(): LogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptions]
  }
  
  extension [Self <: LogOptions](x: Self) {
    
    inline def setScrollOnInput(value: Boolean): Self = StObject.set(x, "scrollOnInput", value.asInstanceOf[js.Any])
    
    inline def setScrollOnInputUndefined: Self = StObject.set(x, "scrollOnInput", js.undefined)
    
    inline def setScrollback(value: Double): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
    
    inline def setScrollbackUndefined: Self = StObject.set(x, "scrollback", js.undefined)
  }
}
