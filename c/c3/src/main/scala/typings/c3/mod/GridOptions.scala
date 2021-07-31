package typings.c3.mod

import typings.c3.anon.Front
import typings.c3.anon.Show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridOptions extends StObject {
  
  var focus: js.UndefOr[Show] = js.undefined
  
  var lines: js.UndefOr[Front] = js.undefined
  
  var x: js.UndefOr[AxisGridOptions] = js.undefined
  
  var y: js.UndefOr[AxisGridOptions] = js.undefined
}
object GridOptions {
  
  @scala.inline
  def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  
  @scala.inline
  implicit class GridOptionsMutableBuilder[Self <: GridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocus(value: Show): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setLines(value: Front): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setX(value: AxisGridOptions): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: AxisGridOptions): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
