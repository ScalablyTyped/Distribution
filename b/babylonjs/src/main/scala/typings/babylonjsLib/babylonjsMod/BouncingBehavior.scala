package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Add a bouncing effect to an ArcRotateCamera when reaching a specified minimum and maximum radius
  * @see http://doc.babylonjs.com/how_to/camera_behaviors#bouncing-behavior
  */
@JSImport("babylonjs", "BouncingBehavior")
@js.native
class BouncingBehavior ()
  extends babylonjsLib.BABYLONNs.BouncingBehavior

/* static members */
@JSImport("babylonjs", "BouncingBehavior")
@js.native
object BouncingBehavior extends js.Object {
  /**
    * The easing function used by animations
    */
  var EasingFunction: babylonjsLib.BABYLONNs.BackEase = js.native
  /**
    * The easing mode used by animations
    */
  var EasingMode: scala.Double = js.native
}

