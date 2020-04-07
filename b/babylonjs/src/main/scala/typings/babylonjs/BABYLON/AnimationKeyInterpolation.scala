package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationKeyInterpolation extends js.Object

@JSGlobal("BABYLON.AnimationKeyInterpolation")
@js.native
object AnimationKeyInterpolation extends js.Object {
  /**
    * Do not interpolate between keys and use the start key value only. Tangents are ignored
    */
  @js.native
  sealed trait STEP extends AnimationKeyInterpolation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationKeyInterpolation with Double] = js.native
  /* 1 */ @js.native
  object STEP extends TopLevel[STEP with Double]
  
}

