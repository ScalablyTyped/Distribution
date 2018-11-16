package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The framing behavior (BABYLON.FramingBehavior) is designed to automatically position an ArcRotateCamera when its target is set to a mesh. It is also useful if you want to prevent the camera to go under a virtual horizontal plane.
     * @see http://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
     */
@JSImport("babylonjs", "FramingBehavior")
@js.native
class FramingBehavior ()
  extends babylonjsLib.BABYLONNs.FramingBehavior

/**
     * The framing behavior (BABYLON.FramingBehavior) is designed to automatically position an ArcRotateCamera when its target is set to a mesh. It is also useful if you want to prevent the camera to go under a virtual horizontal plane.
     * @see http://doc.babylonjs.com/how_to/camera_behaviors#framing-behavior
     */
@JSImport("babylonjs", "FramingBehavior")
@js.native
object FramingBehavior extends js.Object {
  /**
           * The easing function used by animations
           */
  var EasingFunction: babylonjsLib.BABYLONNs.ExponentialEase = js.native
  /**
           * The easing mode used by animations
           */
  var EasingMode: scala.Double = js.native
  /**
           * The camera is not allowed to zoom closer to the mesh than the point at which the adjusted bounding sphere touches the frustum sides
           */
  var FitFrustumSidesMode: scala.Double = js.native
  /**
           * The camera can move all the way towards the mesh.
           */
  var IgnoreBoundsSizeMode: scala.Double = js.native
}

