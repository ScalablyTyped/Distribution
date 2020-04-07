package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DualShockDpad extends js.Object

@JSGlobal("BABYLON.DualShockDpad")
@js.native
object DualShockDpad extends js.Object {
  /** Down */
  @js.native
  sealed trait Down extends DualShockDpad
  
  /** Left */
  @js.native
  sealed trait Left extends DualShockDpad
  
  /** Right */
  @js.native
  sealed trait Right extends DualShockDpad
  
  /** Up */
  @js.native
  sealed trait Up extends DualShockDpad
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DualShockDpad with Double] = js.native
  /* 13 */ @js.native
  object Down extends TopLevel[Down with Double]
  
  /* 14 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 15 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 12 */ @js.native
  object Up extends TopLevel[Up with Double]
  
}

