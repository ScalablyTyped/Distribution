package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcHoverOptions
  extends StObject
     with CommonHoverOptions {
  
  var hoverBorderDash: js.Array[Double]
  
  var hoverBorderDashOffset: Double
  
  var hoverOffset: Double
}
object ArcHoverOptions {
  
  inline def apply(
    hoverBackgroundColor: Color,
    hoverBorderColor: Color,
    hoverBorderDash: js.Array[Double],
    hoverBorderDashOffset: Double,
    hoverBorderWidth: Double,
    hoverOffset: Double
  ): ArcHoverOptions = {
    val __obj = js.Dynamic.literal(hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderDash = hoverBorderDash.asInstanceOf[js.Any], hoverBorderDashOffset = hoverBorderDashOffset.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverOffset = hoverOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcHoverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcHoverOptions] (val x: Self) extends AnyVal {
    
    inline def setHoverBorderDash(value: js.Array[Double]): Self = StObject.set(x, "hoverBorderDash", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDashOffset(value: Double): Self = StObject.set(x, "hoverBorderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDashVarargs(value: Double*): Self = StObject.set(x, "hoverBorderDash", js.Array(value*))
    
    inline def setHoverOffset(value: Double): Self = StObject.set(x, "hoverOffset", value.asInstanceOf[js.Any])
  }
}
