package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPointOptions extends StObject {
  
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  
  var borderColor: js.UndefOr[ChartColor] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var hitRadius: js.UndefOr[Double] = js.native
  
  var hoverBorderWidth: js.UndefOr[Double] = js.native
  
  var hoverRadius: js.UndefOr[Double] = js.native
  
  var pointStyle: js.UndefOr[PointStyle] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
}
object ChartPointOptions {
  
  @scala.inline
  def apply(): ChartPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointOptions]
  }
  
  @scala.inline
  implicit class ChartPointOptionsMutableBuilder[Self <: ChartPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setHitRadius(value: Double): Self = StObject.set(x, "hitRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitRadiusUndefined: Self = StObject.set(x, "hitRadius", js.undefined)
    
    @scala.inline
    def setHoverBorderWidth(value: Double): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBorderWidthUndefined: Self = StObject.set(x, "hoverBorderWidth", js.undefined)
    
    @scala.inline
    def setHoverRadius(value: Double): Self = StObject.set(x, "hoverRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverRadiusUndefined: Self = StObject.set(x, "hoverRadius", js.undefined)
    
    @scala.inline
    def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
