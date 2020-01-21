package typings.boxen.mod

import typings.boxen.boxenStrings.bold
import typings.boxen.boxenStrings.classic
import typings.boxen.boxenStrings.double
import typings.boxen.boxenStrings.doubleSingle
import typings.boxen.boxenStrings.round
import typings.boxen.boxenStrings.single
import typings.boxen.boxenStrings.singleDouble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.boxen.boxenStrings.single
  - typings.boxen.boxenStrings.double
  - typings.boxen.boxenStrings.round
  - typings.boxen.boxenStrings.bold
  - typings.boxen.boxenStrings.singleDouble
  - typings.boxen.boxenStrings.doubleSingle
  - typings.boxen.boxenStrings.classic
*/
trait BorderStyle extends js.Object

object BorderStyle {
  @scala.inline
  def Bold: bold = this.cast("bold")
  @scala.inline
  def Classic: classic = this.cast("classic")
  @scala.inline
  def Double: double = this.cast("double")
  @scala.inline
  def DoubleSingle: doubleSingle = this.cast("doubleSingle")
  @scala.inline
  def Round: round = this.cast("round")
  @scala.inline
  def Single: single = this.cast("single")
  @scala.inline
  def SingleDouble: singleDouble = this.cast("singleDouble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

