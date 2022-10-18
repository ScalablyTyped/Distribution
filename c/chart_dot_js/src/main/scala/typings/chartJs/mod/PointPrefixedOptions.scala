package typings.chartJs.mod

import typings.chartJs.typesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointPrefixedOptions extends StObject {
  
  /**
    * The fill color for points.
    */
  var pointBackgroundColor: Color
  
  /**
    * The border color for points.
    */
  var pointBorderColor: Color
  
  /**
    * The width of the point border in pixels.
    */
  var pointBorderWidth: Double
  
  /**
    * The pixel size of the non-displayed point that reacts to mouse events.
    */
  var pointHitRadius: Double
  
  /**
    * The radius of the point shape. If set to 0, the point is not rendered.
    */
  var pointRadius: Double
  
  /**
    * The rotation of the point in degrees.
    */
  var pointRotation: Double
  
  /**
    * Style of the point.
    */
  var pointStyle: PointStyle
}
object PointPrefixedOptions {
  
  inline def apply(
    pointBackgroundColor: Color,
    pointBorderColor: Color,
    pointBorderWidth: Double,
    pointHitRadius: Double,
    pointRadius: Double,
    pointRotation: Double,
    pointStyle: PointStyle
  ): PointPrefixedOptions = {
    val __obj = js.Dynamic.literal(pointBackgroundColor = pointBackgroundColor.asInstanceOf[js.Any], pointBorderColor = pointBorderColor.asInstanceOf[js.Any], pointBorderWidth = pointBorderWidth.asInstanceOf[js.Any], pointHitRadius = pointHitRadius.asInstanceOf[js.Any], pointRadius = pointRadius.asInstanceOf[js.Any], pointRotation = pointRotation.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointPrefixedOptions]
  }
  
  extension [Self <: PointPrefixedOptions](x: Self) {
    
    inline def setPointBackgroundColor(value: Color): Self = StObject.set(x, "pointBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setPointBorderColor(value: Color): Self = StObject.set(x, "pointBorderColor", value.asInstanceOf[js.Any])
    
    inline def setPointBorderWidth(value: Double): Self = StObject.set(x, "pointBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setPointHitRadius(value: Double): Self = StObject.set(x, "pointHitRadius", value.asInstanceOf[js.Any])
    
    inline def setPointRadius(value: Double): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
    
    inline def setPointRotation(value: Double): Self = StObject.set(x, "pointRotation", value.asInstanceOf[js.Any])
    
    inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
  }
}
