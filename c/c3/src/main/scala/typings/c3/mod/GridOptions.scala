package typings.c3.mod

import typings.c3.anon.Front
import typings.c3.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridOptions extends StObject {
  
  var focus: js.UndefOr[`1`] = js.undefined
  
  var lines: js.UndefOr[Front] = js.undefined
  
  var x: js.UndefOr[AxisGridOptions] = js.undefined
  
  var y: js.UndefOr[AxisGridOptions] = js.undefined
}
object GridOptions {
  
  inline def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  
  extension [Self <: GridOptions](x: Self) {
    
    inline def setFocus(value: `1`): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setLines(value: Front): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setX(value: AxisGridOptions): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: AxisGridOptions): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
