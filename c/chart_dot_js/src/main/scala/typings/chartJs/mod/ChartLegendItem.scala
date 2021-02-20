package typings.chartJs.mod

import typings.chartJs.chartJsStrings.bevel
import typings.chartJs.chartJsStrings.butt
import typings.chartJs.chartJsStrings.miter
import typings.chartJs.chartJsStrings.round
import typings.chartJs.chartJsStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendItem extends StObject {
  
  var fillStyle: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var lineCap: js.UndefOr[butt | round | square] = js.native
  
  var lineDash: js.UndefOr[js.Array[Double]] = js.native
  
  var lineDashOffset: js.UndefOr[Double] = js.native
  
  var lineJoin: js.UndefOr[bevel | round | miter] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var pointStyle: js.UndefOr[PointStyle] = js.native
  
  var strokeStyle: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object ChartLegendItem {
  
  @scala.inline
  def apply(): ChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendItem]
  }
  
  @scala.inline
  implicit class ChartLegendItemMutableBuilder[Self <: ChartLegendItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLineCap(value: butt | round | square): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
    
    @scala.inline
    def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
    
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
    
    @scala.inline
    def setLineJoin(value: bevel | round | miter): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
