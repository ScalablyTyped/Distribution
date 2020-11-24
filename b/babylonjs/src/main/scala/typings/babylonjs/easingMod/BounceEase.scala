package typings.babylonjs.easingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Animations/easing", "BounceEase")
@js.native
/**
  * Instantiates a bounce easing
  * @see https://easings.net/#easeInBounce
  * @param bounces Defines the number of bounces
  * @param bounciness Defines the amplitude of the bounce
  */
class BounceEase () extends EasingFunction {
  def this(/** Defines the number of bounces */
  bounces: Double) = this()
  def this(
    /** Defines the number of bounces */
  bounces: js.UndefOr[scala.Nothing],
    /** Defines the amplitude of the bounce */
  bounciness: Double
  ) = this()
  def this(
    /** Defines the number of bounces */
  bounces: Double,
    /** Defines the amplitude of the bounce */
  bounciness: Double
  ) = this()
  
  /** Defines the number of bounces */
  var bounces: Double = js.native
  
  /** Defines the amplitude of the bounce */
  var bounciness: Double = js.native
}
