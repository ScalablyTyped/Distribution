package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRMotionControllerComponentChanges extends StObject {
  
  /**
    * will be populated with previous and current values if axes changed
    */
  var axes: js.UndefOr[IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]] = js.undefined
  
  /**
    * will be populated with previous and current values if pressed changed
    */
  var pressed: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.undefined
  
  /**
    * will be populated with previous and current values if touched changed
    */
  var touched: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.undefined
  
  /**
    * will be populated with previous and current values if value changed
    */
  var value: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Double]] = js.undefined
}
object IWebXRMotionControllerComponentChanges {
  
  inline def apply(): IWebXRMotionControllerComponentChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRMotionControllerComponentChanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRMotionControllerComponentChanges] (val x: Self) extends AnyVal {
    
    inline def setAxes(value: IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setPressed(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
    
    inline def setTouched(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
    
    inline def setValue(value: IWebXRMotionControllerComponentChangesValues[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
