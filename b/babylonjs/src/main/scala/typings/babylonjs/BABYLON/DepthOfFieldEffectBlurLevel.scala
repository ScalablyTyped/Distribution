package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DepthOfFieldEffectBlurLevel with Double] = js.native
  /* 2 */ @js.native
  object High extends TopLevel[High with Double]
  
  /* 0 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  /* 1 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
}

