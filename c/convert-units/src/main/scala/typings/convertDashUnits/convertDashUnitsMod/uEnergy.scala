package typings.convertDashUnits.convertDashUnitsMod

import typings.convertDashUnits.convertDashUnitsStrings.mWh_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertDashUnits.convertDashUnitsStrings.Wh
  - typings.convertDashUnits.convertDashUnitsStrings.mWh_
  - typings.convertDashUnits.convertDashUnitsStrings.kWh
  - typings.convertDashUnits.convertDashUnitsStrings.MWh
  - typings.convertDashUnits.convertDashUnitsStrings.GWh
  - typings.convertDashUnits.convertDashUnitsStrings.J
  - typings.convertDashUnits.convertDashUnitsStrings.kJ
*/
trait uEnergy extends js.Object

object uEnergy {
  @scala.inline
  def GWh: typings.convertDashUnits.convertDashUnitsStrings.GWh = this.cast("GWh")
  @scala.inline
  def J: typings.convertDashUnits.convertDashUnitsStrings.J = this.cast("J")
  @scala.inline
  def MWh: typings.convertDashUnits.convertDashUnitsStrings.MWh = this.cast("MWh")
  @scala.inline
  def Wh: typings.convertDashUnits.convertDashUnitsStrings.Wh = this.cast("Wh")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kJ: typings.convertDashUnits.convertDashUnitsStrings.kJ = this.cast("kJ")
  @scala.inline
  def kWh: typings.convertDashUnits.convertDashUnitsStrings.kWh = this.cast("kWh")
  @scala.inline
  def mWh: mWh_ = this.cast("mWh")
}

