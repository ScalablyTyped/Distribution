package typings
package boxenLib.boxenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - boxenLib.boxenLibStrings.single
  - boxenLib.boxenLibStrings.double
  - boxenLib.boxenLibStrings.round
  - boxenLib.boxenLibStrings.bold
  - boxenLib.boxenLibStrings.singleDouble
  - boxenLib.boxenLibStrings.doubleSingle
  - boxenLib.boxenLibStrings.classic
*/
trait BorderStyle extends js.Object

object BorderStyle {
  @scala.inline
  def Bold: boxenLib.boxenLibStrings.bold = this.cast("bold")
  @scala.inline
  def Classic: boxenLib.boxenLibStrings.classic = this.cast("classic")
  @scala.inline
  def Double: boxenLib.boxenLibStrings.double = this.cast("double")
  @scala.inline
  def DoubleSingle: boxenLib.boxenLibStrings.doubleSingle = this.cast("doubleSingle")
  @scala.inline
  def Round: boxenLib.boxenLibStrings.round = this.cast("round")
  @scala.inline
  def Single: boxenLib.boxenLibStrings.single = this.cast("single")
  @scala.inline
  def SingleDouble: boxenLib.boxenLibStrings.singleDouble = this.cast("singleDouble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

