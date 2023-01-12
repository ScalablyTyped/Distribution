package typings.d3OrgChart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CenterY extends StObject {
  
  var centerY: Double
  
  var scale: Double
}
object CenterY {
  
  inline def apply(centerY: Double, scale: Double): CenterY = {
    val __obj = js.Dynamic.literal(centerY = centerY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CenterY] (val x: Self) extends AnyVal {
    
    inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
