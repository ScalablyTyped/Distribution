package typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod

import org.scalablytyped.runtime.TopLevel
import typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSED
import typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSING
import typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSING_START
import typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPEN
import typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPENING
import typings.atBlueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPEN_START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationStates extends js.Object

@JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "AnimationStates")
@js.native
object AnimationStates extends js.Object {
  /**
    * The contents of the collapse is not rendered, the collapse height is 0,
    * and the body Y is at -height (so that the bottom of the body is at Y=0).
    */
  @js.native
  sealed trait CLOSED extends AnimationStates
  
  /**
    * Height is set to 0 and the body Y is at -height. Both of these properties
    * are transformed, and then after the animation is complete, the state
    * changes to CLOSED.
    */
  @js.native
  sealed trait CLOSING extends AnimationStates
  
  /**
    * Height has been changed from auto to the measured height of the body to
    * prepare for the closing animation in CLOSING.
    */
  @js.native
  sealed trait CLOSING_START extends AnimationStates
  
  /**
    * The collapse height is set to auto, and the body Y is set to 0 (so the
    * element can be seen as normal).
    */
  @js.native
  sealed trait OPEN extends AnimationStates
  
  /**
    * Animation begins, height is set to auto. This is all animated, and on
    * complete, the state changes to OPEN.
    */
  @js.native
  sealed trait OPENING extends AnimationStates
  
  /**
    * The body is re-rendered, height is set to the measured body height and
    * the body Y is set to 0.
    */
  @js.native
  sealed trait OPEN_START extends AnimationStates
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationStates with Double] = js.native
  /* 5 */ @js.native
  object CLOSED extends TopLevel[CLOSED with Double]
  
  /* 4 */ @js.native
  object CLOSING extends TopLevel[CLOSING with Double]
  
  /* 3 */ @js.native
  object CLOSING_START extends TopLevel[CLOSING_START with Double]
  
  /* 2 */ @js.native
  object OPEN extends TopLevel[OPEN with Double]
  
  /* 1 */ @js.native
  object OPENING extends TopLevel[OPENING with Double]
  
  /* 0 */ @js.native
  object OPEN_START extends TopLevel[OPEN_START with Double]
  
}

