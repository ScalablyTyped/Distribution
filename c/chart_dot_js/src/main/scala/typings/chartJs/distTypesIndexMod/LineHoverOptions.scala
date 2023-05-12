package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesColorMod.Color
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHoverOptions
  extends StObject
     with CommonHoverOptions {
  
  var hoverBorderCapStyle: CanvasLineCap
  
  var hoverBorderDash: js.Array[Double]
  
  var hoverBorderDashOffset: Double
  
  var hoverBorderJoinStyle: CanvasLineJoin
}
object LineHoverOptions {
  
  inline def apply(
    hoverBackgroundColor: Color,
    hoverBorderCapStyle: CanvasLineCap,
    hoverBorderColor: Color,
    hoverBorderDash: js.Array[Double],
    hoverBorderDashOffset: Double,
    hoverBorderJoinStyle: CanvasLineJoin,
    hoverBorderWidth: Double
  ): LineHoverOptions = {
    val __obj = js.Dynamic.literal(hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderCapStyle = hoverBorderCapStyle.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderDash = hoverBorderDash.asInstanceOf[js.Any], hoverBorderDashOffset = hoverBorderDashOffset.asInstanceOf[js.Any], hoverBorderJoinStyle = hoverBorderJoinStyle.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHoverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineHoverOptions] (val x: Self) extends AnyVal {
    
    inline def setHoverBorderCapStyle(value: CanvasLineCap): Self = StObject.set(x, "hoverBorderCapStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDash(value: js.Array[Double]): Self = StObject.set(x, "hoverBorderDash", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDashOffset(value: Double): Self = StObject.set(x, "hoverBorderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDashVarargs(value: Double*): Self = StObject.set(x, "hoverBorderDash", js.Array(value*))
    
    inline def setHoverBorderJoinStyle(value: CanvasLineJoin): Self = StObject.set(x, "hoverBorderJoinStyle", value.asInstanceOf[js.Any])
  }
}
