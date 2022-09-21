package typings.chartJs.mod

import typings.chartJs.colorMod.Color
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendItem extends StObject {
  
  /**
    * Border radius of the legend box
    * @since 3.1.0
    */
  var borderRadius: js.UndefOr[Double | BorderRadius] = js.undefined
  
  /**
    * Index of the associated dataset
    */
  var datasetIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Fill style of the legend box
    */
  var fillStyle: js.UndefOr[Color] = js.undefined
  
  /**
    * Font color for the text
    * Defaults to LegendOptions.labels.color
    */
  var fontColor: js.UndefOr[Color] = js.undefined
  
  /**
    * If true, this item represents a hidden dataset. Label will be rendered with a strike-through effect
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Index the associated label in the labels array
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * For box border.
    * @see https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D/lineCap
    */
  var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
  
  /**
    * For box border.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash
    */
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * For box border.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset
    */
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * For box border.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin
    */
  var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
  
  /**
    * Width of box border
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Point style of the legend box (only used if usePointStyle is true)
    */
  var pointStyle: js.UndefOr[PointStyle] = js.undefined
  
  /**
    * Rotation of the point in degrees (only used if usePointStyle is true)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * Stroke style of the legend box
    */
  var strokeStyle: js.UndefOr[Color] = js.undefined
  
  /**
    * Label that will be displayed
    */
  var text: String
  
  /**
    * Text alignment
    */
  var textAlign: js.UndefOr[TextAlign] = js.undefined
}
object LegendItem {
  
  inline def apply(text: String): LegendItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItem]
  }
  
  extension [Self <: LegendItem](x: Self) {
    
    inline def setBorderRadius(value: Double | BorderRadius): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setDatasetIndexUndefined: Self = StObject.set(x, "datasetIndex", js.undefined)
    
    inline def setFillStyle(value: Color): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
    
    inline def setFontColor(value: Color): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
    
    inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
    
    inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
    
    inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
    
    inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setStrokeStyle(value: Color): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
  }
}
