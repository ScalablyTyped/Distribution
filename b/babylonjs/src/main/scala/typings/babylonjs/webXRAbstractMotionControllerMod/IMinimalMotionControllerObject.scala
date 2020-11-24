package typings.babylonjs.webXRAbstractMotionControllerMod

import typings.babylonjs.anon.Pressed
import typings.babylonjs.anon.Pulse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMinimalMotionControllerObject extends js.Object {
  
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
  implicit class IMinimalMotionControllerObjectOps[Self <: IMinimalMotionControllerObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxesVarargs(value: Double*): Self = this.set("axes", js.Array(value :_*))
    
    @scala.inline
    def setAxes(value: js.Array[Double]): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: Pressed*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[Pressed]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapticActuatorsVarargs(value: Pulse*): Self = this.set("hapticActuators", js.Array(value :_*))
    
    @scala.inline
    def setHapticActuators(value: js.Array[Pulse]): Self = this.set("hapticActuators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHapticActuators: Self = this.set("hapticActuators", js.undefined)
  }
}
