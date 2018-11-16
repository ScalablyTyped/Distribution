package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationKeyInterpolation extends js.Object

/**
     * Enum for the animation key frame interpolation type
     */
@JSGlobal("BABYLON.AnimationKeyInterpolation")
@js.native
object AnimationKeyInterpolation extends js.Object {
  /**
           * Do not interpolate between keys and use the start key value only. Tangents are ignored
           */
  @js.native
  sealed trait STEP
    extends babylonjsLib.BABYLONNs.AnimationKeyInterpolation
  
  /* 1 */ val STEP: STEP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.AnimationKeyInterpolation with scala.Double] = js.native
}

