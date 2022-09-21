package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OculusTouchController
  extends StObject
     with WebVRController {
  
  /**
    * Called once for each button that changed state since the last frame
    * 0) thumb stick (touch, press, value = pressed (0,1)). value is in this.leftStick
    * 1) index trigger (touch (?), press (only when value > 0.1), value 0 to 1)
    * 2) secondary trigger (same)
    * 3) A (right) X (left), touch, pressed = value
    * 4) B / Y
    * 5) thumb rest
    * @param buttonIdx Which button index changed
    * @param state New state of the button
    */
  /* protected */ def _handleButtonChange(buttonIdx: Double, state: ExtendedGamepadButton): Unit = js.native
  
  /**
    * Fired when the A button on this controller is modified
    */
  def onAButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the B button on this controller is modified
    */
  def onBButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the secondary trigger on this controller is modified
    */
  var onSecondaryTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the thumb rest on this controller is modified
    */
  var onThumbRestChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the X button on this controller is modified
    */
  def onXButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the Y button on this controller is modified
    */
  def onYButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
}
