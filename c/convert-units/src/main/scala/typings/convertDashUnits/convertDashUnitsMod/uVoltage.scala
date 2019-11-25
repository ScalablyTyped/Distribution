package typings.convertDashUnits.convertDashUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertDashUnits.convertDashUnitsStrings.V
  - typings.convertDashUnits.convertDashUnitsStrings.mV
  - typings.convertDashUnits.convertDashUnitsStrings.kV
*/
trait uVoltage extends js.Object

object uVoltage {
  @scala.inline
  def V: typings.convertDashUnits.convertDashUnitsStrings.V = this.cast("V")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kV: typings.convertDashUnits.convertDashUnitsStrings.kV = this.cast("kV")
  @scala.inline
  def mV: typings.convertDashUnits.convertDashUnitsStrings.mV = this.cast("mV")
}

