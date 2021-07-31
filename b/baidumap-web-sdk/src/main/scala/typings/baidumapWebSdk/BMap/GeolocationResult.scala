package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationResult extends StObject {
  
  var accuracy: Double
  
  var point: Point
}
object GeolocationResult {
  
  @scala.inline
  def apply(accuracy: Double, point: Point): GeolocationResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationResult]
  }
  
  @scala.inline
  implicit class GeolocationResultMutableBuilder[Self <: GeolocationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
