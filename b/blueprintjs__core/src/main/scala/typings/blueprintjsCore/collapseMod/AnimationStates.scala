package typings.blueprintjsCore.collapseMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationStates extends js.Object
@JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "AnimationStates")
@js.native
object AnimationStates extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationStates with Double] = js.native
  
  /**
    * The contents of the collapse is not rendered, the collapse height is 0,
    * and the body Y is at -height (so that the bottom of the body is at Y=0).
    */
  @js.native
  sealed trait CLOSED extends AnimationStates
  /* 5 */ @js.native
  object CLOSED extends TopLevel[CLOSED with Double]
  
  /**
    * Height is set to 0 and the body Y is at -height. Both of these properties
    * are transformed, and then after the animation is complete, the state
    * changes to CLOSED.
    */
  @js.native
  sealed trait CLOSING extends AnimationStates
  /* 4 */ @js.native
  object CLOSING extends TopLevel[CLOSING with Double]
  
  /**
    * Height has been changed from auto to the measured height of the body to
    * prepare for the closing animation in CLOSING.
    */
  @js.native
  sealed trait CLOSING_START extends AnimationStates
  /* 3 */ @js.native
  object CLOSING_START extends TopLevel[CLOSING_START with Double]
  
  /**
    * The collapse height is set to auto, and the body Y is set to 0 (so the
    * element can be seen as normal).
    */
  @js.native
  sealed trait OPEN extends AnimationStates
  /* 2 */ @js.native
  object OPEN extends TopLevel[OPEN with Double]
  
  /**
    * Animation begins, height is set to auto. This is all animated, and on
    * complete, the state changes to OPEN.
    */
  @js.native
  sealed trait OPENING extends AnimationStates
  /* 1 */ @js.native
  object OPENING extends TopLevel[OPENING with Double]
  
  /**
    * The body is re-rendered, height is set to the measured body height and
    * the body Y is set to 0.
    */
  @js.native
  sealed trait OPEN_START extends AnimationStates
  /* 0 */ @js.native
  object OPEN_START extends TopLevel[OPEN_START with Double]
}
