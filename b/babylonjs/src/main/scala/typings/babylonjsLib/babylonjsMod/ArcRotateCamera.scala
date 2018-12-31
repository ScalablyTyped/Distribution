package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents an orbital type of camera.
  *
  * This camera always points towards a given target position and can be rotated around that target with the target as the centre of rotation. It can be controlled with cursors and mouse, or with touch events.
  * Think of this camera as one orbiting its target position, or more imaginatively as a spy satellite orbiting the earth. Its position relative to the target (earth) can be set by three parameters, alpha (radians) the longitudinal rotation, beta (radians) the latitudinal rotation and radius the distance from the target position.
  * @see http://doc.babylonjs.com/babylon101/cameras#arc-rotate-camera
  */
@JSImport("babylonjs", "ArcRotateCamera")
@js.native
class ArcRotateCamera protected ()
  extends babylonjsLib.BABYLONNs.ArcRotateCamera {
  /**
    * Instantiates a new ArcRotateCamera in a given scene
    * @param name Defines the name of the camera
    * @param alpha Defines the camera rotation along the logitudinal axis
    * @param beta Defines the camera rotation along the latitudinal axis
    * @param radius Defines the camera distance from its target
    * @param target Defines the camera target
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
    */
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene, setActiveOnSceneIfNoneActive: scala.Boolean) = this()
}

