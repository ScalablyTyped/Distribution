package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRMotionControllerAxesValue extends StObject {
  
  /**
    * The value of the x axis
    */
  var x: Double
  
  /**
    * The value of the y-axis
    */
  var y: Double
}
object IWebXRMotionControllerAxesValue {
  
  inline def apply(x: Double, y: Double): IWebXRMotionControllerAxesValue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRMotionControllerAxesValue]
  }
  
  extension [Self <: IWebXRMotionControllerAxesValue](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
