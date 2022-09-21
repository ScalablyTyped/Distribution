package typings.chartJs.mod

import typings.chartJs.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcHoverOptions
  extends StObject
     with CommonHoverOptions {
  
  var hoverOffset: Double
}
object ArcHoverOptions {
  
  inline def apply(
    hoverBackgroundColor: Color,
    hoverBorderColor: Color,
    hoverBorderWidth: Double,
    hoverOffset: Double
  ): ArcHoverOptions = {
    val __obj = js.Dynamic.literal(hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverOffset = hoverOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcHoverOptions]
  }
  
  extension [Self <: ArcHoverOptions](x: Self) {
    
    inline def setHoverOffset(value: Double): Self = StObject.set(x, "hoverOffset", value.asInstanceOf[js.Any])
  }
}
