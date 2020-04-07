package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimatedInputBlockTypes extends js.Object

@JSGlobal("BABYLON.AnimatedInputBlockTypes")
@js.native
object AnimatedInputBlockTypes extends js.Object {
  /** No animation */
  @js.native
  sealed trait None extends AnimatedInputBlockTypes
  
  /** Time based animation. Will only work for floats */
  @js.native
  sealed trait Time extends AnimatedInputBlockTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimatedInputBlockTypes with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Time extends TopLevel[Time with Double]
  
}

