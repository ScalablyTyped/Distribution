package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRMotionControllerComponentChanges extends StObject {
  
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
  implicit class IWebXRMotionControllerComponentChangesMutableBuilder[Self <: IWebXRMotionControllerComponentChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setPressed(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
    
    @scala.inline
    def setTouched(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
    
    @scala.inline
    def setValue(value: IWebXRMotionControllerComponentChangesValues[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
