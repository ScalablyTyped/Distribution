package typings.chartJs.mod

import typings.chartJs.chartJsStrings.bottom
import typings.chartJs.chartJsStrings.default
import typings.chartJs.chartJsStrings.monotone
import typings.chartJs.chartJsStrings.top
import typings.chartJs.chartJsStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLineOptions extends StObject {
  
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderCapStyle: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderDash: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  
  var borderJoinStyle: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var capBezierPoints: js.UndefOr[Boolean] = js.undefined
  
  var cubicInterpolationMode: js.UndefOr[default | monotone] = js.undefined
  
  var fill: js.UndefOr[zero | top | bottom | Boolean] = js.undefined
  
  var stepped: js.UndefOr[Boolean] = js.undefined
  
  var tension: js.UndefOr[Double] = js.undefined
}
object ChartLineOptions {
  
  @scala.inline
  def apply(): ChartLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLineOptions]
  }
  
  @scala.inline
  implicit class ChartLineOptionsMutableBuilder[Self <: ChartLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderCapStyle(value: String): Self = StObject.set(x, "borderCapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderCapStyleUndefined: Self = StObject.set(x, "borderCapStyle", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderDash(value: js.Array[js.Any]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
    
    @scala.inline
    def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
    
    @scala.inline
    def setBorderDashVarargs(value: js.Any*): Self = StObject.set(x, "borderDash", js.Array(value :_*))
    
    @scala.inline
    def setBorderJoinStyle(value: String): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderJoinStyleUndefined: Self = StObject.set(x, "borderJoinStyle", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setCapBezierPoints(value: Boolean): Self = StObject.set(x, "capBezierPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapBezierPointsUndefined: Self = StObject.set(x, "capBezierPoints", js.undefined)
    
    @scala.inline
    def setCubicInterpolationMode(value: default | monotone): Self = StObject.set(x, "cubicInterpolationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubicInterpolationModeUndefined: Self = StObject.set(x, "cubicInterpolationMode", js.undefined)
    
    @scala.inline
    def setFill(value: zero | top | bottom | Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStepped(value: Boolean): Self = StObject.set(x, "stepped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteppedUndefined: Self = StObject.set(x, "stepped", js.undefined)
    
    @scala.inline
    def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
  }
}
