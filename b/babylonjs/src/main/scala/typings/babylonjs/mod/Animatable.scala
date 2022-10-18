package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Animatable")
@js.native
open class Animatable protected ()
  extends typings.babylonjs.legacyLegacyMod.Animatable {
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
    * @param isAdditive defines whether the animation should be evaluated additively
    */
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    /** defines the target object */
  target: Any,
    /** defines the starting frame number (default is 0) */
  fromFrame: js.UndefOr[Double],
    /** defines the ending frame number (default is 100) */
  toFrame: js.UndefOr[Double],
    /** defines if the animation must loop (default is false)  */
  loopAnimation: js.UndefOr[Boolean],
    speedRatio: js.UndefOr[Double],
    /** defines a callback to call when animation ends if it is not looping */
  onAnimationEnd: js.UndefOr[Nullable[js.Function0[Unit]]],
    animations: js.UndefOr[js.Array[typings.babylonjs.animationsAnimationMod.Animation]],
    /** defines a callback to call when animation loops */
  onAnimationLoop: js.UndefOr[Nullable[js.Function0[Unit]]],
    /** defines whether the animation should be evaluated additively */
  isAdditive: js.UndefOr[Boolean]
  ) = this()
}
