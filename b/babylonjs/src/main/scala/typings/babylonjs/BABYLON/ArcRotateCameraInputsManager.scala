package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing an arc rotate camera inputs manager
  */
@js.native
trait ArcRotateCameraInputsManager extends CameraInputsManager[ArcRotateCamera] {
  
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
