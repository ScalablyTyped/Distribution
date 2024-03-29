package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationResult extends StObject {
  
  var accuracy: Double
  
  var point: Point
}
object GeolocationResult {
  
  inline def apply(accuracy: Double, point: Point): GeolocationResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocationResult] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
