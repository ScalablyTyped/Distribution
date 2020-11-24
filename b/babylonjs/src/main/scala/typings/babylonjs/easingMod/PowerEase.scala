package typings.babylonjs.easingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Animations/easing", "PowerEase")
@js.native
/**
  * Instantiates an power base easing function
  * @see https://easings.net/#easeInQuad
  * @param power Defines the power of the function
  */
class PowerEase () extends EasingFunction {
  def this(/** Defines the power of the function */
  power: Double) = this()
  
  /** Defines the power of the function */
  var power: Double = js.native
}
