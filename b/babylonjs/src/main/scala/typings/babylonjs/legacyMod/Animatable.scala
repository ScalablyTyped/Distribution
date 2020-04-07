package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "Animatable")
@js.native
class Animatable protected ()
  extends typings.babylonjs.indexMod.Animatable {
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
    * @param onAnimationLoop defines a callback to call when animation loops
    */
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    /** defines the target object */
  target: js.Any,
    /** defines the starting frame number (default is 0) */
  fromFrame: js.UndefOr[Double],
    /** defines the ending frame number (default is 100) */
  toFrame: js.UndefOr[Double],
    /** defines if the animation must loop (default is false)  */
  loopAnimation: js.UndefOr[Boolean],
    speedRatio: js.UndefOr[Double],
    /** defines a callback to call when animation ends if it is not looping */
  onAnimationEnd: js.UndefOr[js.Function0[Unit] | Null],
    animations: js.UndefOr[js.Array[typings.babylonjs.animationMod.Animation]],
    /** defines a callback to call when animation loops */
  onAnimationLoop: js.UndefOr[js.Function0[Unit] | Null]
  ) = this()
}

