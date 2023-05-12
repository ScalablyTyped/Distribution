package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointHoverOptions
  extends StObject
     with CommonHoverOptions {
  
  /**
    * Point radius when hovered.
    * @default 4
    */
  var hoverRadius: Double
}
object PointHoverOptions {
  
  inline def apply(
    hoverBackgroundColor: Color,
    hoverBorderColor: Color,
    hoverBorderWidth: Double,
    hoverRadius: Double
  ): PointHoverOptions = {
    val __obj = js.Dynamic.literal(hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverRadius = hoverRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointHoverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointHoverOptions] (val x: Self) extends AnyVal {
    
    inline def setHoverRadius(value: Double): Self = StObject.set(x, "hoverRadius", value.asInstanceOf[js.Any])
  }
}
