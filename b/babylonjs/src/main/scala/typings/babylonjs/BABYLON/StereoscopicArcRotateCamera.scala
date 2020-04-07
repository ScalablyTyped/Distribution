package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.StereoscopicArcRotateCamera")
@js.native
class StereoscopicArcRotateCamera protected () extends ArcRotateCamera {
  /**
    * Creates a new StereoscopicArcRotateCamera
    * @param name defines camera name
    * @param alpha defines alpha angle (in radians)
    * @param beta defines beta angle (in radians)
    * @param radius defines radius
    * @param target defines camera target
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
    scene: Scene
  ) = this()
}

