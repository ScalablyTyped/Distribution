package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Xbox360Dpad extends js.Object

/** Defines values for XBox360 DPad  */
@JSGlobal("BABYLON.Xbox360Dpad")
@js.native
object Xbox360Dpad extends js.Object {
  /** Down */
  @js.native
  sealed trait Down
    extends babylonjsLib.BABYLONNs.Xbox360Dpad
  
  /** Left */
  @js.native
  sealed trait Left
    extends babylonjsLib.BABYLONNs.Xbox360Dpad
  
  /** Right */
  @js.native
  sealed trait Right
    extends babylonjsLib.BABYLONNs.Xbox360Dpad
  
  /** Up */
  @js.native
  sealed trait Up
    extends babylonjsLib.BABYLONNs.Xbox360Dpad
  
  /* 1 */ val Down: Down with scala.Double = js.native
  /* 2 */ val Left: Left with scala.Double = js.native
  /* 3 */ val Right: Right with scala.Double = js.native
  /* 0 */ val Up: Up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.Xbox360Dpad with scala.Double] = js.native
}

