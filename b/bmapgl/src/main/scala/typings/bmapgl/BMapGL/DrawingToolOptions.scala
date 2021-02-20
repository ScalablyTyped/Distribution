package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingToolOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var customContainer: js.UndefOr[String | HTMLElement] = js.native
  
  var drawingModes: js.UndefOr[js.Array[DrawingType]] = js.native
  
  var enableTips: js.UndefOr[Boolean] = js.native
  
  var hasCustomStyle: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var scale: js.UndefOr[Double] = js.native
}
object DrawingToolOptions {
  
  @scala.inline
  def apply(): DrawingToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingToolOptions]
  }
  
  @scala.inline
  implicit class DrawingToolOptionsMutableBuilder[Self <: DrawingToolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setCustomContainer(value: String | HTMLElement): Self = StObject.set(x, "customContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomContainerUndefined: Self = StObject.set(x, "customContainer", js.undefined)
    
    @scala.inline
    def setDrawingModes(value: js.Array[DrawingType]): Self = StObject.set(x, "drawingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawingModesUndefined: Self = StObject.set(x, "drawingModes", js.undefined)
    
    @scala.inline
    def setDrawingModesVarargs(value: DrawingType*): Self = StObject.set(x, "drawingModes", js.Array(value :_*))
    
    @scala.inline
    def setEnableTips(value: Boolean): Self = StObject.set(x, "enableTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTipsUndefined: Self = StObject.set(x, "enableTips", js.undefined)
    
    @scala.inline
    def setHasCustomStyle(value: Boolean): Self = StObject.set(x, "hasCustomStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCustomStyleUndefined: Self = StObject.set(x, "hasCustomStyle", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
