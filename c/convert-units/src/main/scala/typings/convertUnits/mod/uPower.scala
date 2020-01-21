package typings.convertUnits.mod

import typings.convertUnits.convertUnitsStrings.mW_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.W
  - typings.convertUnits.convertUnitsStrings.mW_
  - typings.convertUnits.convertUnitsStrings.kM
  - typings.convertUnits.convertUnitsStrings.MW
  - typings.convertUnits.convertUnitsStrings.GW
*/
trait uPower extends js.Object

object uPower {
  @scala.inline
  def GW: typings.convertUnits.convertUnitsStrings.GW = this.cast("GW")
  @scala.inline
  def MW: typings.convertUnits.convertUnitsStrings.MW = this.cast("MW")
  @scala.inline
  def W: typings.convertUnits.convertUnitsStrings.W = this.cast("W")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kM: typings.convertUnits.convertUnitsStrings.kM = this.cast("kM")
  @scala.inline
  def mW: mW_ = this.cast("mW")
}

