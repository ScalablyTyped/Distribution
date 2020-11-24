package typings.babylonjs.timerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimerState extends js.Object
@JSImport("babylonjs/Misc/timer", "TimerState")
@js.native
object TimerState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimerState with Double] = js.native
  
  /**
    * Timer ended (whether aborted or time reached)
    */
  @js.native
  sealed trait ENDED extends TimerState
  /* 2 */ @js.native
  object ENDED extends TopLevel[ENDED with Double]
  
  /**
    * Timer initialized, not yet started
    */
  @js.native
  sealed trait INIT extends TimerState
  /* 0 */ @js.native
  object INIT extends TopLevel[INIT with Double]
  
  /**
    * Timer started and counting
    */
  @js.native
  sealed trait STARTED extends TimerState
  /* 1 */ @js.native
  object STARTED extends TopLevel[STARTED with Double]
}
