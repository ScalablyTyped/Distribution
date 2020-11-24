package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GamepadCamera")
@js.native
class GamepadCamera protected ()
  extends typings.babylonjs.BABYLON.GamepadCamera {
  /**
    * Instantiates a new Gamepad Camera
    * This represents a FPS type of camera. This is only here for back compat purpose.
    * Please use the UniversalCamera instead as both are identical.
    * @see https://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
}
