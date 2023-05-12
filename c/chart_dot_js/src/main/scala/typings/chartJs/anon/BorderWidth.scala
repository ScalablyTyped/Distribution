package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderWidth extends StObject {
  
  var borderWidth: Double
  
  var hitRadius: Double
  
  var hoverBorderWidth: Double
  
  var hoverRadius: Double
  
  var pointStyle: String
  
  var radius: Double
  
  var rotation: Double
}
object BorderWidth {
  
  inline def apply(
    borderWidth: Double,
    hitRadius: Double,
    hoverBorderWidth: Double,
    hoverRadius: Double,
    pointStyle: String,
    radius: Double,
    rotation: Double
  ): BorderWidth = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverRadius = hoverRadius.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderWidth] (val x: Self) extends AnyVal {
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setHitRadius(value: Double): Self = StObject.set(x, "hitRadius", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderWidth(value: Double): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverRadius(value: Double): Self = StObject.set(x, "hoverRadius", value.asInstanceOf[js.Any])
    
    inline def setPointStyle(value: String): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
