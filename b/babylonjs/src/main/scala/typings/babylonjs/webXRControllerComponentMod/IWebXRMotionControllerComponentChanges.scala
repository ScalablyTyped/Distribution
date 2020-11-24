package typings.babylonjs.webXRControllerComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRMotionControllerComponentChanges extends js.Object {
  
  /**
    * will be populated with previous and current values if axes changed
    */
  var axes: js.UndefOr[IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]] = js.native
  
  /**
    * will be populated with previous and current values if pressed changed
    */
  var pressed: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.native
  
  /**
    * will be populated with previous and current values if touched changed
    */
  var touched: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.native
  
  /**
    * will be populated with previous and current values if value changed
    */
  var value: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Double]] = js.native
}
object IWebXRMotionControllerComponentChanges {
  
  @scala.inline
  def apply(): IWebXRMotionControllerComponentChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRMotionControllerComponentChanges]
  }
  
  @scala.inline
  implicit class IWebXRMotionControllerComponentChangesOps[Self <: IWebXRMotionControllerComponentChanges] (val x: Self) extends AnyVal {
    
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
    def setAxes(value: IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]): Self = this.set("axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    
    @scala.inline
    def setPressed(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = this.set("pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressed: Self = this.set("pressed", js.undefined)
    
    @scala.inline
    def setTouched(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = this.set("touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouched: Self = this.set("touched", js.undefined)
    
    @scala.inline
    def setValue(value: IWebXRMotionControllerComponentChangesValues[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
