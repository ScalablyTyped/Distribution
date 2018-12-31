package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arc Rotate version of the follow camera.
  * It still follows a Defined mesh but in an Arc Rotate Camera fashion.
  * @see http://doc.babylonjs.com/features/cameras#follow-camera
  */
@JSImport("babylonjs", "ArcFollowCamera")
@js.native
class ArcFollowCamera protected ()
  extends babylonjsLib.BABYLONNs.ArcFollowCamera {
  /**
    * Instantiates a new ArcFollowCamera
    * @see http://doc.babylonjs.com/features/cameras#follow-camera
    * @param name Define the name of the camera
    * @param alpha Define the rotation angle of the camera around the logitudinal axis
    * @param beta Define the rotation angle of the camera around the elevation axis
    * @param radius Define the radius of the camera from its target point
    * @param target Define the target of the camera
    * @param scene Define the scene the camera belongs to
    */
  def this(name: java.lang.String, /** The longitudinal angle of the camera */
  alpha: scala.Double, /** The latitudinal angle of the camera */
  beta: scala.Double, /** The radius of the camera from its target */
  radius: scala.Double, /** Define the camera target (the messh it should follow) */
  target: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.AbstractMesh], scene: babylonjsLib.BABYLONNs.Scene) = this()
}

