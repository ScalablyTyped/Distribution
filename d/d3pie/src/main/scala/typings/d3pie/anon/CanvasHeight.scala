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
  
  inline def apply(): CanvasHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasHeight]
  }
  
  extension [Self <: CanvasHeight](x: Self) {
    
    inline def setCanvasHeight(value: Double): Self = StObject.set(x, "canvasHeight", value.asInstanceOf[js.Any])
    
    inline def setCanvasHeightUndefined: Self = StObject.set(x, "canvasHeight", js.undefined)
    
    inline def setCanvasWidth(value: Double): Self = StObject.set(x, "canvasWidth", value.asInstanceOf[js.Any])
    
    inline def setCanvasWidthUndefined: Self = StObject.set(x, "canvasWidth", js.undefined)
    
    inline def setPieInnerRadius(value: String | Double): Self = StObject.set(x, "pieInnerRadius", value.asInstanceOf[js.Any])
    
    inline def setPieInnerRadiusUndefined: Self = StObject.set(x, "pieInnerRadius", js.undefined)
    
    inline def setPieOuterRadius(value: String | Double): Self = StObject.set(x, "pieOuterRadius", value.asInstanceOf[js.Any])
    
    inline def setPieOuterRadiusUndefined: Self = StObject.set(x, "pieOuterRadius", js.undefined)
  }
}
