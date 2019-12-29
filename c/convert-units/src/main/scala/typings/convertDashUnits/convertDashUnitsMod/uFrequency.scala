package typings.convertDashUnits.convertDashUnitsMod

import typings.convertDashUnits.convertDashUnitsStrings.mHz_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertDashUnits.convertDashUnitsStrings.Hz
  - typings.convertDashUnits.convertDashUnitsStrings.mHz_
  - typings.convertDashUnits.convertDashUnitsStrings.kHz
  - typings.convertDashUnits.convertDashUnitsStrings.MHz
  - typings.convertDashUnits.convertDashUnitsStrings.GHz
  - typings.convertDashUnits.convertDashUnitsStrings.THz
  - typings.convertDashUnits.convertDashUnitsStrings.rpm
  - typings.convertDashUnits.convertDashUnitsStrings.degSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.radSlashs
*/
trait uFrequency extends js.Object

object uFrequency {
  @scala.inline
  def GHz: typings.convertDashUnits.convertDashUnitsStrings.GHz = this.cast("GHz")
  @scala.inline
  def Hz: typings.convertDashUnits.convertDashUnitsStrings.Hz = this.cast("Hz")
  @scala.inline
  def MHz: typings.convertDashUnits.convertDashUnitsStrings.MHz = this.cast("MHz")
  @scala.inline
  def THz: typings.convertDashUnits.convertDashUnitsStrings.THz = this.cast("THz")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def degSlashs: typings.convertDashUnits.convertDashUnitsStrings.degSlashs = this.cast("deg/s")
  @scala.inline
  def kHz: typings.convertDashUnits.convertDashUnitsStrings.kHz = this.cast("kHz")
  @scala.inline
  def mHz: mHz_ = this.cast("mHz")
  @scala.inline
  def radSlashs: typings.convertDashUnits.convertDashUnitsStrings.radSlashs = this.cast("rad/s")
  @scala.inline
  def rpm: typings.convertDashUnits.convertDashUnitsStrings.rpm = this.cast("rpm")
}

