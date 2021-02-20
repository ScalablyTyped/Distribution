package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a free camera inputs manager
  */
@js.native
trait FreeCameraInputsManager extends CameraInputsManager[FreeCamera] {
  
  /**
    * @hidden
    */
  var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = js.native
  
  /**
    * @hidden
    */
  var _mouseInput: Nullable[FreeCameraMouseInput] = js.native
  
  /**
    * @hidden
    */
  var _mouseWheelInput: Nullable[FreeCameraMouseWheelInput] = js.native
  
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addDeviceOrientation(): FreeCameraInputsManager = js.native
  
  /**
    * Adds gamepad input support to the FreeCameraInputsManager.
    * @returns the FreeCameraInputsManager
    */
  def addGamepad(): FreeCameraInputsManager = js.native
  
  /**
    * Add keyboard input support to the input manager.
    * @returns the current input manager
    */
  def addKeyboard(): FreeCameraInputsManager = js.native
  
  /**
    * Add mouse input support to the input manager.
    * @param touchEnabled if the FreeCameraMouseInput should support touch (default: true)
    * @returns the current input manager
    */
  def addMouse(): FreeCameraInputsManager = js.native
  def addMouse(touchEnabled: Boolean): FreeCameraInputsManager = js.native
  
  /**
    * Add mouse wheel input support to the input manager.
    * @returns the current input manager
    */
  def addMouseWheel(): FreeCameraInputsManager = js.native
  
  /**
    * Add touch input support to the input manager.
    * @returns the current input manager
    */
  def addTouch(): FreeCameraInputsManager = js.native
  
  /**
    * Add virtual joystick input support to the input manager.
    * @returns the current input manager
    */
  def addVirtualJoystick(): FreeCameraInputsManager = js.native
  
  /**
    * Removes the mouse input support from the manager
    * @returns the current input manager
    */
  def removeMouse(): FreeCameraInputsManager = js.native
  
  /**
    * Removes the mouse wheel input support from the manager
    * @returns the current input manager
    */
  def removeMouseWheel(): FreeCameraInputsManager = js.native
}
