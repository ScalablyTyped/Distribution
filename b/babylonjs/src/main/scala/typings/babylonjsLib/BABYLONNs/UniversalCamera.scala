package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
  * which still works and will still be found in many Playgrounds.
  * @see http://doc.babylonjs.com/features/cameras#universal-camera
  */
@JSGlobal("BABYLON.UniversalCamera")
@js.native
class UniversalCamera protected () extends TouchCamera {
  /**
    * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
    * which still works and will still be found in many Playgrounds.
    * @see http://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: java.lang.String, position: Vector3, scene: Scene) = this()
  /**
    * Defines the gamepad rotation sensiblity.
    * This is the threshold from when rotation starts to be accounted for to prevent jittering.
    */
  var gamepadAngularSensibility: scala.Double = js.native
  /**
    * Defines the gamepad move sensiblity.
    * This is the threshold from when moving starts to be accounted for for to prevent jittering.
    */
  var gamepadMoveSensibility: scala.Double = js.native
}

