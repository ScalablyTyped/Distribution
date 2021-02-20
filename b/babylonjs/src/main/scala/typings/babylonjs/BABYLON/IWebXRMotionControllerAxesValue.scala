package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRMotionControllerAxesValue extends StObject {
  
  /**
    * The value of the x axis
    */
  var x: Double = js.native
  
  /**
    * The value of the y-axis
    */
  var y: Double = js.native
}
object IWebXRMotionControllerAxesValue {
  
  @scala.inline
  def apply(x: Double, y: Double): IWebXRMotionControllerAxesValue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRMotionControllerAxesValue]
  }
  
  @scala.inline
  implicit class IWebXRMotionControllerAxesValueMutableBuilder[Self <: IWebXRMotionControllerAxesValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
