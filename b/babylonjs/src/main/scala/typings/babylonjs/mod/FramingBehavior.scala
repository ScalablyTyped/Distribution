package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "FramingBehavior")
@js.native
class FramingBehavior ()
  extends typings.babylonjs.legacyMod.FramingBehavior

/* static members */
@JSImport("babylonjs", "FramingBehavior")
@js.native
object FramingBehavior extends js.Object {
  /**
    * The easing function used by animations
    */
  var EasingFunction: typings.babylonjs.easingMod.ExponentialEase = js.native
  /**
    * The easing mode used by animations
    */
  var EasingMode: Double = js.native
  /**
    * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
    */
  var FitFrustumSidesMode: Double = js.native
  /**
    * The camera can move all the way towards the mesh.
    */
  var IgnoreBoundsSizeMode: Double = js.native
}

