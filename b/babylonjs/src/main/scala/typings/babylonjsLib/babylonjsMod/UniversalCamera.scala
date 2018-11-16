package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
     * which still works and will still be found in many Playgrounds.
     * @see http://doc.babylonjs.com/features/cameras#universal-camera
     */
@JSImport("babylonjs", "UniversalCamera")
@js.native
class UniversalCamera protected ()
  extends babylonjsLib.BABYLONNs.UniversalCamera {
  /**
           * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
           * which still works and will still be found in many Playgrounds.
           * @see http://doc.babylonjs.com/features/cameras#universal-camera
           * @param name Define the name of the camera in the scene
           * @param position Define the start position of the camera in the scene
           * @param scene Define the scene the camera belongs to
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

