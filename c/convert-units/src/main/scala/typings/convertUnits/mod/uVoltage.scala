package typings.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.V
  - typings.convertUnits.convertUnitsStrings.mV
  - typings.convertUnits.convertUnitsStrings.kV
*/
trait uVoltage extends js.Object

object uVoltage {
  @scala.inline
  def V: typings.convertUnits.convertUnitsStrings.V = this.cast("V")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kV: typings.convertUnits.convertUnitsStrings.kV = this.cast("kV")
  @scala.inline
  def mV: typings.convertUnits.convertUnitsStrings.mV = this.cast("mV")
}

