package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents a FPS type of camera. This is only here for back compat purpose.
     * Please use the UniversalCamera instead as both are identical.
     * @see http://doc.babylonjs.com/features/cameras#universal-camera
     */
@JSImport("babylonjs", "GamepadCamera")
@js.native
class GamepadCamera protected ()
  extends babylonjsLib.BABYLONNs.GamepadCamera {
  /**
           * Instantiates a new Gamepad Camera
           * This represents a FPS type of camera. This is only here for back compat purpose.
           * Please use the UniversalCamera instead as both are identical.
           * @see http://doc.babylonjs.com/features/cameras#universal-camera
           * @param name Define the name of the camera in the scene
           * @param position Define the start position of the camera in the scene
           * @param scene Define the scene the camera belongs to
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

