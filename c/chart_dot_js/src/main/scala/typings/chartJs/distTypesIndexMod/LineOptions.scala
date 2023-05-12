package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.BorderCapStyle
import typings.chartJs.chartJsStrings.after
import typings.chartJs.chartJsStrings.before
import typings.chartJs.chartJsStrings.default
import typings.chartJs.chartJsStrings.middle
import typings.chartJs.chartJsStrings.monotone
import typings.chartJs.distTypesColorMod.Color
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOptions
  extends StObject
     with CommonElementOptions {
  
  /**
    * Line cap style. See MDN.
    * @default 'butt'
    */
  var borderCapStyle: CanvasLineCap
  
  /**
    * Line dash. See MDN.
    * @default []
    */
  var borderDash: js.Array[Double]
  
  /**
    * Line dash offset. See MDN.
    * @default 0.0
    */
  var borderDashOffset: Double
  
  /**
    * Line join style. See MDN.
    * @default 'miter'
    */
  var borderJoinStyle: CanvasLineJoin
  
  /**
    *   true to keep Bézier control inside the chart, false for no restriction.
    * @default true
    */
  var capBezierPoints: Boolean
  
  /**
    * Interpolation mode to apply.
    * @default 'default'
    */
  var cubicInterpolationMode: default | monotone
  
  /**
    * Both line and radar charts support a fill option on the dataset object which can be used to create area between two datasets or a dataset and a boundary, i.e. the scale origin, start or end
    */
  var fill: FillTarget | ComplexFillTarget
  
  var segment: BorderCapStyle
  
  /**
    * If true, lines will be drawn between points with no or null data. If false, points with NaN data will create a break in the line. Can also be a number specifying the maximum gap length to span. The unit of the value depends on the scale used.
    */
  var spanGaps: Boolean | Double
  
  /**
    * true to show the line as a stepped line (tension will be ignored).
    * @default false
    */
  var stepped: before | after | middle | Boolean
  
  /**
    * Bézier curve tension (0 for no Bézier curves).
    * @default 0
    */
  var tension: Double
}
object LineOptions {
  
  inline def apply(
    backgroundColor: Color,
    borderCapStyle: CanvasLineCap,
    borderColor: Color,
    borderDash: js.Array[Double],
    borderDashOffset: Double,
    borderJoinStyle: CanvasLineJoin,
    borderWidth: Double,
    capBezierPoints: Boolean,
    cubicInterpolationMode: default | monotone,
    fill: FillTarget | ComplexFillTarget,
    segment: BorderCapStyle,
    spanGaps: Boolean | Double,
    stepped: before | after | middle | Boolean,
    tension: Double
  ): LineOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderCapStyle = borderCapStyle.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderDash = borderDash.asInstanceOf[js.Any], borderDashOffset = borderDashOffset.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], capBezierPoints = capBezierPoints.asInstanceOf[js.Any], cubicInterpolationMode = cubicInterpolationMode.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], spanGaps = spanGaps.asInstanceOf[js.Any], stepped = stepped.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOptions] (val x: Self) extends AnyVal {
    
    inline def setBorderCapStyle(value: CanvasLineCap): Self = StObject.set(x, "borderCapStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderDash(value: js.Array[Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setBorderJoinStyle(value: CanvasLineJoin): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setCapBezierPoints(value: Boolean): Self = StObject.set(x, "capBezierPoints", value.asInstanceOf[js.Any])
    
    inline def setCubicInterpolationMode(value: default | monotone): Self = StObject.set(x, "cubicInterpolationMode", value.asInstanceOf[js.Any])
    
    inline def setFill(value: FillTarget | ComplexFillTarget): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setSegment(value: BorderCapStyle): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSpanGaps(value: Boolean | Double): Self = StObject.set(x, "spanGaps", value.asInstanceOf[js.Any])
    
    inline def setStepped(value: before | after | middle | Boolean): Self = StObject.set(x, "stepped", value.asInstanceOf[js.Any])
    
    inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
