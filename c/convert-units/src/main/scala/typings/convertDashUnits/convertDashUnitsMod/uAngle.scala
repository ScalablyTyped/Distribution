package typings.convertDashUnits.convertDashUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertDashUnits.convertDashUnitsStrings.deg
  - typings.convertDashUnits.convertDashUnitsStrings.rad
  - typings.convertDashUnits.convertDashUnitsStrings.grad
  - typings.convertDashUnits.convertDashUnitsStrings.arcmin
  - typings.convertDashUnits.convertDashUnitsStrings.arcsec
*/
trait uAngle extends js.Object

object uAngle {
  @scala.inline
  def arcmin: typings.convertDashUnits.convertDashUnitsStrings.arcmin = this.cast("arcmin")
  @scala.inline
  def arcsec: typings.convertDashUnits.convertDashUnitsStrings.arcsec = this.cast("arcsec")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deg: typings.convertDashUnits.convertDashUnitsStrings.deg = this.cast("deg")
  @scala.inline
  def grad: typings.convertDashUnits.convertDashUnitsStrings.grad = this.cast("grad")
  @scala.inline
  def rad: typings.convertDashUnits.convertDashUnitsStrings.rad = this.cast("rad")
}

