package typings.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.deg
  - typings.convertUnits.convertUnitsStrings.rad
  - typings.convertUnits.convertUnitsStrings.grad
  - typings.convertUnits.convertUnitsStrings.arcmin
  - typings.convertUnits.convertUnitsStrings.arcsec
*/
trait uAngle extends js.Object

object uAngle {
  @scala.inline
  def arcmin: typings.convertUnits.convertUnitsStrings.arcmin = this.cast("arcmin")
  @scala.inline
  def arcsec: typings.convertUnits.convertUnitsStrings.arcsec = this.cast("arcsec")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deg: typings.convertUnits.convertUnitsStrings.deg = this.cast("deg")
  @scala.inline
  def grad: typings.convertUnits.convertUnitsStrings.grad = this.cast("grad")
  @scala.inline
  def rad: typings.convertUnits.convertUnitsStrings.rad = this.cast("rad")
}

