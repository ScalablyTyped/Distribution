package typings.chartJs.mod

import typings.chartJs.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarHoverOptions
  extends StObject
     with CommonHoverOptions {
  
  var hoverBorderRadius: Double | BorderRadius
}
object BarHoverOptions {
  
  inline def apply(
    hoverBackgroundColor: Color,
    hoverBorderColor: Color,
    hoverBorderRadius: Double | BorderRadius,
    hoverBorderWidth: Double
  ): BarHoverOptions = {
    val __obj = js.Dynamic.literal(hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderRadius = hoverBorderRadius.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarHoverOptions]
  }
  
  extension [Self <: BarHoverOptions](x: Self) {
    
    inline def setHoverBorderRadius(value: Double | BorderRadius): Self = StObject.set(x, "hoverBorderRadius", value.asInstanceOf[js.Any])
  }
}
