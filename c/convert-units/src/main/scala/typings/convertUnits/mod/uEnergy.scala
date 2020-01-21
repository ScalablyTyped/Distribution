package typings.convertUnits.mod

import typings.convertUnits.convertUnitsStrings.mWh_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.Wh
  - typings.convertUnits.convertUnitsStrings.mWh_
  - typings.convertUnits.convertUnitsStrings.kWh
  - typings.convertUnits.convertUnitsStrings.MWh
  - typings.convertUnits.convertUnitsStrings.GWh
  - typings.convertUnits.convertUnitsStrings.J
  - typings.convertUnits.convertUnitsStrings.kJ
*/
trait uEnergy extends js.Object

object uEnergy {
  @scala.inline
  def GWh: typings.convertUnits.convertUnitsStrings.GWh = this.cast("GWh")
  @scala.inline
  def J: typings.convertUnits.convertUnitsStrings.J = this.cast("J")
  @scala.inline
  def MWh: typings.convertUnits.convertUnitsStrings.MWh = this.cast("MWh")
  @scala.inline
  def Wh: typings.convertUnits.convertUnitsStrings.Wh = this.cast("Wh")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kJ: typings.convertUnits.convertUnitsStrings.kJ = this.cast("kJ")
  @scala.inline
  def kWh: typings.convertUnits.convertUnitsStrings.kWh = this.cast("kWh")
  @scala.inline
  def mWh: mWh_ = this.cast("mWh")
}

