package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface representing a free camera inputs manager
     */
/**
     * Default Inputs manager for the FreeCamera.
     * It groups all the default supported inputs for ease of use.
     * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
     */
@JSGlobal("BABYLON.FreeCameraInputsManager")
@js.native
class FreeCameraInputsManager protected () extends CameraInputsManager[FreeCamera] {
  /**
           * Instantiates a new FreeCameraInputsManager.
           * @param camera Defines the camera the inputs belong to
           */
  def this(camera: FreeCamera) = this()
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
  /**
           * Add mouse input support to the input manager.
           * @param touchEnabled if the FreeCameraMouseInput should support touch (default: true)
           * @returns the current input manager
           */
  def addMouse(touchEnabled: scala.Boolean): FreeCameraInputsManager = js.native
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
}

