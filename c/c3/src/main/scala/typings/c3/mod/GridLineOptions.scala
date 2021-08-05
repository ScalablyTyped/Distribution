package typings.c3.mod

import typings.c3.c3Strings.end
import typings.c3.c3Strings.middle
import typings.c3.c3Strings.start
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLineOptions extends StObject {
  
  /** Class to give the grid line for styling. */
  var `class`: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[start | end | middle] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  /** Value to place the grid line at. */
  var value: String | Double | Date
}
object GridLineOptions {
  
  inline def apply(value: String | Double | Date): GridLineOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptions]
  }
  
  extension [Self <: GridLineOptions](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setPosition(value: start | end | middle): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String | Double | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
