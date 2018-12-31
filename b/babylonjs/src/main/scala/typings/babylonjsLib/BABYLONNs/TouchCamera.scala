package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a FPS type of camera controlled by touch.
  * This is like a universal camera minus the Gamepad controls.
  * @see http://doc.babylonjs.com/features/cameras#universal-camera
  */
@JSGlobal("BABYLON.TouchCamera")
@js.native
class TouchCamera protected () extends FreeCamera {
  /**
    * Instantiates a new touch camera.
    * This represents a FPS type of camera controlled by touch.
    * This is like a universal camera minus the Gamepad controls.
    * @see http://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: java.lang.String, position: Vector3, scene: Scene) = this()
  /**
    * Defines the touch sensibility for rotation.
    * The higher the faster.
    */
  var touchAngularSensibility: scala.Double = js.native
  /**
    * Defines the touch sensibility for move.
    * The higher the faster.
    */
  var touchMoveSensibility: scala.Double = js.native
}

