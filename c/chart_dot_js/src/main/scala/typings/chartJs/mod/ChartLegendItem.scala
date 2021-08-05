package typings.chartJs.mod

import typings.chartJs.chartJsStrings.bevel
import typings.chartJs.chartJsStrings.butt
import typings.chartJs.chartJsStrings.miter
import typings.chartJs.chartJsStrings.round
import typings.chartJs.chartJsStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendItem extends StObject {
  
  var fillStyle: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var lineCap: js.UndefOr[butt | round | square] = js.undefined
  
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  
  var lineJoin: js.UndefOr[bevel | round | miter] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var pointStyle: js.UndefOr[PointStyle] = js.undefined
  
  var strokeStyle: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object ChartLegendItem {
  
  inline def apply(): ChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendItem]
  }
  
  extension [Self <: ChartLegendItem](x: Self) {
    
    inline def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLineCap(value: butt | round | square): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
    
    inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
    
    inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
    
    inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
    
    inline def setLineJoin(value: bevel | round | miter): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
