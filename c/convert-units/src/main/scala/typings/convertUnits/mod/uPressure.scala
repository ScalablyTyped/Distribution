package typings.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.Pa
  - typings.convertUnits.convertUnitsStrings.hPa
  - typings.convertUnits.convertUnitsStrings.kPa
  - typings.convertUnits.convertUnitsStrings.MPa
  - typings.convertUnits.convertUnitsStrings.bar
  - typings.convertUnits.convertUnitsStrings.torr
  - typings.convertUnits.convertUnitsStrings.psi
  - typings.convertUnits.convertUnitsStrings.ksi
*/
trait uPressure extends js.Object

object uPressure {
  @scala.inline
  def MPa: typings.convertUnits.convertUnitsStrings.MPa = this.cast("MPa")
  @scala.inline
  def Pa: typings.convertUnits.convertUnitsStrings.Pa = this.cast("Pa")
  @scala.inline
  def bar: typings.convertUnits.convertUnitsStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hPa: typings.convertUnits.convertUnitsStrings.hPa = this.cast("hPa")
  @scala.inline
  def kPa: typings.convertUnits.convertUnitsStrings.kPa = this.cast("kPa")
  @scala.inline
  def ksi: typings.convertUnits.convertUnitsStrings.ksi = this.cast("ksi")
  @scala.inline
  def psi: typings.convertUnits.convertUnitsStrings.psi = this.cast("psi")
  @scala.inline
  def torr: typings.convertUnits.convertUnitsStrings.torr = this.cast("torr")
}

