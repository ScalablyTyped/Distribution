package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  var angle: Any
  
  var borderAlign: String
  
  var borderColor: String
  
  var borderDash: js.Array[Any]
  
  var borderDashOffset: Double
  
  var borderJoinStyle: Any
  
  var borderRadius: Double
  
  var borderWidth: Double
  
  var circular: Boolean
  
  var offset: Double
  
  var spacing: Double
}
object Angle {
  
  inline def apply(
    angle: Any,
    borderAlign: String,
    borderColor: String,
    borderDash: js.Array[Any],
    borderDashOffset: Double,
    borderJoinStyle: Any,
    borderRadius: Double,
    borderWidth: Double,
    circular: Boolean,
    offset: Double,
    spacing: Double
  ): Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], borderAlign = borderAlign.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderDash = borderDash.asInstanceOf[js.Any], borderDashOffset = borderDashOffset.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Any): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setBorderAlign(value: String): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderDash(value: js.Array[Any]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashVarargs(value: Any*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setBorderJoinStyle(value: Any): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
  }
}
