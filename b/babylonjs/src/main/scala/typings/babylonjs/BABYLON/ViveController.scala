package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViveController
  extends StObject
     with WebVRController {
  
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
