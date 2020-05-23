package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcFollowCamera extends TargetCamera {
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

