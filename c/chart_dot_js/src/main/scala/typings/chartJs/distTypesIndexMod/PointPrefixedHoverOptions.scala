package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointPrefixedHoverOptions extends StObject {
  
  /**
    * Point background color when hovered.
    */
  var pointHoverBackgroundColor: Color
  
  /**
    * Point border color when hovered.
    */
  var pointHoverBorderColor: Color
  
  /**
    * Border width of point when hovered.
    */
  var pointHoverBorderWidth: Double
  
  /**
    * The radius of the point when hovered.
    */
  var pointHoverRadius: Double
}
object PointPrefixedHoverOptions {
  
  inline def apply(
    pointHoverBackgroundColor: Color,
    pointHoverBorderColor: Color,
    pointHoverBorderWidth: Double,
    pointHoverRadius: Double
  ): PointPrefixedHoverOptions = {
    val __obj = js.Dynamic.literal(pointHoverBackgroundColor = pointHoverBackgroundColor.asInstanceOf[js.Any], pointHoverBorderColor = pointHoverBorderColor.asInstanceOf[js.Any], pointHoverBorderWidth = pointHoverBorderWidth.asInstanceOf[js.Any], pointHoverRadius = pointHoverRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointPrefixedHoverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointPrefixedHoverOptions] (val x: Self) extends AnyVal {
    
    inline def setPointHoverBackgroundColor(value: Color): Self = StObject.set(x, "pointHoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setPointHoverBorderColor(value: Color): Self = StObject.set(x, "pointHoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setPointHoverBorderWidth(value: Double): Self = StObject.set(x, "pointHoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setPointHoverRadius(value: Double): Self = StObject.set(x, "pointHoverRadius", value.asInstanceOf[js.Any])
  }
}
