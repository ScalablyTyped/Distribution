package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BezierCurveEase
  extends StObject
     with EasingFunction {
  
  /** Defines the x component of the start tangent in the bezier curve */
  var x1: Double
  
  /** Defines the x component of the end tangent in the bezier curve */
  var x2: Double
  
  /** Defines the y component of the start tangent in the bezier curve */
  var y1: Double
  
  /** Defines the y component of the end tangent in the bezier curve */
  var y2: Double
}
object BezierCurveEase {
  
  inline def apply(
    _easingMode: Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): BezierCurveEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode), x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurveEase]
  }
  
  extension [Self <: BezierCurveEase](x: Self) {
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
