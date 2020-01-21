package typings.convertUnits.mod

import typings.convertUnits.convertUnitsStrings.km_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.mm
  - typings.convertUnits.convertUnitsStrings.cm
  - typings.convertUnits.convertUnitsStrings.m
  - typings.convertUnits.convertUnitsStrings.km_
  - typings.convertUnits.convertUnitsStrings.in
  - typings.convertUnits.convertUnitsStrings.`ft-us`
  - typings.convertUnits.convertUnitsStrings.ft
  - typings.convertUnits.convertUnitsStrings.mi
*/
trait uDistance extends js.Object

object uDistance {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cm: typings.convertUnits.convertUnitsStrings.cm = this.cast("cm")
  @scala.inline
  def ft: typings.convertUnits.convertUnitsStrings.ft = this.cast("ft")
  @scala.inline
  def `ft-us`: typings.convertUnits.convertUnitsStrings.`ft-us` = this.cast("ft-us")
  @scala.inline
  def in: typings.convertUnits.convertUnitsStrings.in = this.cast("in")
  @scala.inline
  def km: km_ = this.cast("km")
  @scala.inline
  def m: typings.convertUnits.convertUnitsStrings.m = this.cast("m")
  @scala.inline
  def mi: typings.convertUnits.convertUnitsStrings.mi = this.cast("mi")
  @scala.inline
  def mm: typings.convertUnits.convertUnitsStrings.mm = this.cast("mm")
}

