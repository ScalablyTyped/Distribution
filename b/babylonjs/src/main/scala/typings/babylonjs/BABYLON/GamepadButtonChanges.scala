package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadButtonChanges extends StObject {
  
  /**
    * Called when a gamepad has been changed
    */
  var changed: Boolean
  
  /**
    * Called when a gamepad press event has been triggered
    */
  var pressChanged: Boolean
  
  /**
    * Called when a touch event has been triggered
    */
  var touchChanged: Boolean
  
  /**
    * Called when a value has changed
    */
  var valueChanged: Boolean
}
object GamepadButtonChanges {
  
  inline def apply(changed: Boolean, pressChanged: Boolean, touchChanged: Boolean, valueChanged: Boolean): GamepadButtonChanges = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], pressChanged = pressChanged.asInstanceOf[js.Any], touchChanged = touchChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadButtonChanges]
  }
  
  extension [Self <: GamepadButtonChanges](x: Self) {
    
    inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setPressChanged(value: Boolean): Self = StObject.set(x, "pressChanged", value.asInstanceOf[js.Any])
    
    inline def setTouchChanged(value: Boolean): Self = StObject.set(x, "touchChanged", value.asInstanceOf[js.Any])
    
    inline def setValueChanged(value: Boolean): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
  }
}
