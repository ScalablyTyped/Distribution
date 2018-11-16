package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepthOfFieldEffectBlurLevel extends js.Object

/**
     * Specifies the level of max blur that should be applied when using the depth of field effect
     */
@JSGlobal("BABYLON.DepthOfFieldEffectBlurLevel")
@js.native
object DepthOfFieldEffectBlurLevel extends js.Object {
  /**
           * Large blur
           */
  @js.native
  sealed trait High
    extends babylonjsLib.BABYLONNs.DepthOfFieldEffectBlurLevel
  
  /**
           * Subtle blur
           */
  @js.native
  sealed trait Low
    extends babylonjsLib.BABYLONNs.DepthOfFieldEffectBlurLevel
  
  /**
           * Medium blur
           */
  @js.native
  sealed trait Medium
    extends babylonjsLib.BABYLONNs.DepthOfFieldEffectBlurLevel
  
  /* 2 */ val High: High with scala.Double = js.native
  /* 0 */ val Low: Low with scala.Double = js.native
  /* 1 */ val Medium: Medium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.DepthOfFieldEffectBlurLevel with scala.Double] = js.native
}

