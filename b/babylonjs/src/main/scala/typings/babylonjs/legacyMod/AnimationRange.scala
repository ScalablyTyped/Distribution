package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "AnimationRange")
@js.native
class AnimationRange protected ()
  extends typings.babylonjs.indexMod.AnimationRange {
  /**
    * Initializes the range of an animation
    * @param name The name of the animation range
    * @param from The starting frame of the animation
    * @param to The ending frame of the animation
    */
  def this(
    /**The name of the animation range**/
  name: String,
    /**The starting frame of the animation */
  from: Double,
    /**The ending frame of the animation*/
  to: Double
  ) = this()
}

