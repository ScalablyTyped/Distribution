package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViveController
  extends StObject
     with WebVRController {
  
  /**
    * Called once for each button that changed state since the last frame
    * Vive mapping:
    * 0: touchpad
    * 1: trigger
    * 2: left AND right buttons
    * 3: menu button
    * @param buttonIdx Which button index changed
    * @param state New state of the button
    */
  /* protected */ def _handleButtonChange(buttonIdx: Double, state: ExtendedGamepadButton): Unit = js.native
  
  /**
    * Fired when the left button on this controller is modified
    */
  def onLeftButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the menu button on this controller is modified
    */
  def onMenuButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the right button on this controller is modified
    */
  def onRightButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
}
