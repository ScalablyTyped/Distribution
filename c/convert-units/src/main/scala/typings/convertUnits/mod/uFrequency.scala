package typings.convertUnits.mod

import typings.convertUnits.convertUnitsStrings.mHz_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.Hz
  - typings.convertUnits.convertUnitsStrings.mHz_
  - typings.convertUnits.convertUnitsStrings.kHz
  - typings.convertUnits.convertUnitsStrings.MHz
  - typings.convertUnits.convertUnitsStrings.GHz
  - typings.convertUnits.convertUnitsStrings.THz
  - typings.convertUnits.convertUnitsStrings.rpm
  - typings.convertUnits.convertUnitsStrings.degSlashs
  - typings.convertUnits.convertUnitsStrings.radSlashs
*/
trait uFrequency extends js.Object

object uFrequency {
  @scala.inline
  def GHz: typings.convertUnits.convertUnitsStrings.GHz = this.cast("GHz")
  @scala.inline
  def Hz: typings.convertUnits.convertUnitsStrings.Hz = this.cast("Hz")
  @scala.inline
  def MHz: typings.convertUnits.convertUnitsStrings.MHz = this.cast("MHz")
  @scala.inline
  def THz: typings.convertUnits.convertUnitsStrings.THz = this.cast("THz")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def degSlashs: typings.convertUnits.convertUnitsStrings.degSlashs = this.cast("deg/s")
  @scala.inline
  def kHz: typings.convertUnits.convertUnitsStrings.kHz = this.cast("kHz")
  @scala.inline
  def mHz: mHz_ = this.cast("mHz")
  @scala.inline
  def radSlashs: typings.convertUnits.convertUnitsStrings.radSlashs = this.cast("rad/s")
  @scala.inline
  def rpm: typings.convertUnits.convertUnitsStrings.rpm = this.cast("rpm")
}

