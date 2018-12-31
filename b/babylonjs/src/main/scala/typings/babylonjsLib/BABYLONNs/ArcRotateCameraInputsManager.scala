package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an arc rotate camera inputs manager
  */
/**
  * Default Inputs manager for the ArcRotateCamera.
  * It groups all the default supported inputs for ease of use.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
@JSGlobal("BABYLON.ArcRotateCameraInputsManager")
@js.native
class ArcRotateCameraInputsManager protected () extends CameraInputsManager[ArcRotateCamera] {
  /**
    * Instantiates a new ArcRotateCameraInputsManager.
    * @param camera Defines the camera the inputs belong to
    */
  def this(camera: ArcRotateCamera) = this()
  /**
    * Adds gamepad input support to the ArcRotateCamera InputManager.
    * @returns the camera inputs manager
    */
  def addGamepad(): ArcRotateCameraInputsManager = js.native
  /**
    * Add keyboard input support to the input manager.
    * @returns the current input manager
    */
  def addKeyboard(): ArcRotateCameraInputsManager = js.native
  /**
    * Add mouse wheel input support to the input manager.
    * @returns the current input manager
    */
  def addMouseWheel(): ArcRotateCameraInputsManager = js.native
  /**
    * Add pointers input support to the input manager.
    * @returns the current input manager
    */
  def addPointers(): ArcRotateCameraInputsManager = js.native
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addVRDeviceOrientation(): ArcRotateCameraInputsManager = js.native
}

