package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to store an actual running animation
     */
@JSImport("babylonjs", "Animatable")
@js.native
class Animatable protected ()
  extends babylonjsLib.BABYLONNs.Animatable {
  /**
           * Creates a new Animatable
           * @param scene defines the hosting scene
           * @param target defines the target object
           * @param fromFrame defines the starting frame number (default is 0)
           * @param toFrame defines the ending frame number (default is 100)
           * @param loopAnimation defines if the animation must loop (default is false)
           * @param speedRatio defines the factor to apply to animation speed (default is 1)
           * @param onAnimationEnd defines a callback to call when animation ends if it is not looping
           * @param animations defines a group of animation to add to the new Animatable
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, /** defines the target object */
  target: js.Any, /** defines the starting frame number (default is 0) */
  fromFrame: js.UndefOr[scala.Double], /** defines the ending frame number (default is 100) */
  toFrame: js.UndefOr[scala.Double], /** defines if the animation must loop (default is false)  */
  loopAnimation: js.UndefOr[scala.Boolean], speedRatio: js.UndefOr[scala.Double], /** defines a callback to call when animation ends if it is not looping */
  onAnimationEnd: js.UndefOr[js.Function0[scala.Unit] | scala.Null | js.UndefOr[scala.Nothing]], animations: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Animation]]) = this()
}

