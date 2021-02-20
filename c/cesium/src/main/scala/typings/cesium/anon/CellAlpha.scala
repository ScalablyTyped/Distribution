package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellAlpha extends StObject {
  
  var cellAlpha: js.UndefOr[Property] = js.native
  
  var color: js.UndefOr[Property] = js.native
  
  var lineCount: js.UndefOr[Property] = js.native
  
  var lineOffset: js.UndefOr[Property] = js.native
  
  var lineThickness: js.UndefOr[Property] = js.native
}
object CellAlpha {
  
  @scala.inline
  def apply(): CellAlpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellAlpha]
  }
  
  @scala.inline
  implicit class CellAlphaMutableBuilder[Self <: CellAlpha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellAlpha(value: Property): Self = StObject.set(x, "cellAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellAlphaUndefined: Self = StObject.set(x, "cellAlpha", js.undefined)
    
    @scala.inline
    def setColor(value: Property): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLineCount(value: Property): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCountUndefined: Self = StObject.set(x, "lineCount", js.undefined)
    
    @scala.inline
    def setLineOffset(value: Property): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
    
    @scala.inline
    def setLineThickness(value: Property): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
  }
}
