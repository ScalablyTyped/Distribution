package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ArcFollowCamera")
@js.native
class ArcFollowCamera protected () extends TargetCamera {
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
  def this(
    name: String,
    /** The longitudinal angle of the camera */
  alpha: Double,
    /** The latitudinal angle of the camera */
  beta: Double,
    /** The radius of the camera from its target */
  radius: Double,
    /** Define the camera target (the messh it should follow) */
  target: Nullable[AbstractMesh],
    scene: Scene
  ) = this()
  var _cartesianCoordinates: js.Any = js.native
  var _follow: js.Any = js.native
  /** The longitudinal angle of the camera */
  var alpha: Double = js.native
  /** The latitudinal angle of the camera */
  var beta: Double = js.native
  /** The radius of the camera from its target */
  var radius: Double = js.native
  /** Define the camera target (the messh it should follow) */
  var target: Nullable[AbstractMesh] = js.native
}

