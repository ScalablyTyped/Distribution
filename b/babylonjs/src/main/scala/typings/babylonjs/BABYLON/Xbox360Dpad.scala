package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Xbox360Dpad extends js.Object

@JSGlobal("BABYLON.Xbox360Dpad")
@js.native
object Xbox360Dpad extends js.Object {
  /** Down */
  @js.native
  sealed trait Down extends Xbox360Dpad
  
  /** Left */
  @js.native
  sealed trait Left extends Xbox360Dpad
  
  /** Right */
  @js.native
  sealed trait Right extends Xbox360Dpad
  
  /** Up */
  @js.native
  sealed trait Up extends Xbox360Dpad
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Xbox360Dpad with Double] = js.native
  /* 13 */ @js.native
  object Down extends TopLevel[Down with Double]
  
  /* 14 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 15 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 12 */ @js.native
  object Up extends TopLevel[Up with Double]
  
}

