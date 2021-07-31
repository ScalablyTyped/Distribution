package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasHeight extends StObject {
  
  var canvasHeight: js.UndefOr[Double] = js.undefined
  
  var canvasWidth: js.UndefOr[Double] = js.undefined
  
  var pieInnerRadius: js.UndefOr[String | Double] = js.undefined
  
  var pieOuterRadius: js.UndefOr[String | Double] = js.undefined
}
object CanvasHeight {
  
  @scala.inline
  def apply(): CanvasHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasHeight]
  }
  
  @scala.inline
  implicit class CanvasHeightMutableBuilder[Self <: CanvasHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasHeight(value: Double): Self = StObject.set(x, "canvasHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasHeightUndefined: Self = StObject.set(x, "canvasHeight", js.undefined)
    
    @scala.inline
    def setCanvasWidth(value: Double): Self = StObject.set(x, "canvasWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasWidthUndefined: Self = StObject.set(x, "canvasWidth", js.undefined)
    
    @scala.inline
    def setPieInnerRadius(value: String | Double): Self = StObject.set(x, "pieInnerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieInnerRadiusUndefined: Self = StObject.set(x, "pieInnerRadius", js.undefined)
    
    @scala.inline
    def setPieOuterRadius(value: String | Double): Self = StObject.set(x, "pieOuterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieOuterRadiusUndefined: Self = StObject.set(x, "pieOuterRadius", js.undefined)
  }
}
