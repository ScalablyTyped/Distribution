package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Pressed
import typings.babylonjs.anon.Pulse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMinimalMotionControllerObject extends StObject {
  
  /**
    * Available axes of this controller
    */
  var axes: js.Array[Double] = js.native
  
  /**
    * An array of available buttons
    */
  var buttons: js.Array[Pressed] = js.native
  
  /**
    * EXPERIMENTAL haptic support.
    */
  var hapticActuators: js.UndefOr[js.Array[Pulse]] = js.native
}
object IMinimalMotionControllerObject {
  
  @scala.inline
  def apply(axes: js.Array[Double], buttons: js.Array[Pressed]): IMinimalMotionControllerObject = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMinimalMotionControllerObject]
  }
  
  @scala.inline
  implicit class IMinimalMotionControllerObjectMutableBuilder[Self <: IMinimalMotionControllerObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: js.Array[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesVarargs(value: Double*): Self = StObject.set(x, "axes", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[Pressed]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: Pressed*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setHapticActuators(value: js.Array[Pulse]): Self = StObject.set(x, "hapticActuators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapticActuatorsUndefined: Self = StObject.set(x, "hapticActuators", js.undefined)
    
    @scala.inline
    def setHapticActuatorsVarargs(value: Pulse*): Self = StObject.set(x, "hapticActuators", js.Array(value :_*))
  }
}
