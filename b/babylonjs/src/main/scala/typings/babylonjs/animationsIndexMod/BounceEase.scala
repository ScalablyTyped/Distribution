package typings.babylonjs.animationsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Animations/index", "BounceEase")
@js.native
/**
  * Instantiates a bounce easing
  * @see https://easings.net/#easeInBounce
  * @param bounces Defines the number of bounces
  * @param bounciness Defines the amplitude of the bounce
  */
class BounceEase ()
  extends typings.babylonjs.easingMod.BounceEase {
  def this(/** Defines the number of bounces */
  bounces: Double) = this()
  def this(
    /** Defines the number of bounces */
  bounces: Double,
    /** Defines the amplitude of the bounce */
  bounciness: Double
  ) = this()
}

