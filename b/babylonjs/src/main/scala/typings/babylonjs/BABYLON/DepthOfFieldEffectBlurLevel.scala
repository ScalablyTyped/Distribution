package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthOfFieldEffectBlurLevel extends js.Object

@JSGlobal("BABYLON.DepthOfFieldEffectBlurLevel")
@js.native
object DepthOfFieldEffectBlurLevel extends js.Object {
  /**
    * Large blur
    */
  @js.native
  sealed trait High extends DepthOfFieldEffectBlurLevel
  
  /**
    * Subtle blur
    */
  @js.native
  sealed trait Low extends DepthOfFieldEffectBlurLevel
  
  /**
    * Medium blur
    */
  @js.native
  sealed trait Medium extends DepthOfFieldEffectBlurLevel
  
}

