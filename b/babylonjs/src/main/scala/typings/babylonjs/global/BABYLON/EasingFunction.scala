package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EasingFunction")
@js.native
class EasingFunction ()
  extends typings.babylonjs.BABYLON.EasingFunction
/* static members */
@JSGlobal("BABYLON.EasingFunction")
@js.native
object EasingFunction extends js.Object {
  
  /**
    * Interpolation follows the mathematical formula associated with the easing function.
    */
  val EASINGMODE_EASEIN: Double = js.native
  
  /**
    * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
    */
  val EASINGMODE_EASEINOUT: Double = js.native
  
  /**
    * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
    */
  val EASINGMODE_EASEOUT: Double = js.native
}
