package typings.babylonjs.animationKeyMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationKeyInterpolation extends js.Object
@JSImport("babylonjs/Animations/animationKey", "AnimationKeyInterpolation")
@js.native
object AnimationKeyInterpolation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationKeyInterpolation with Double] = js.native
  
  /**
    * Do not interpolate between keys and use the start key value only. Tangents are ignored
    */
  @js.native
  sealed trait STEP extends AnimationKeyInterpolation
  /* 1 */ @js.native
  object STEP extends TopLevel[STEP with Double]
}
