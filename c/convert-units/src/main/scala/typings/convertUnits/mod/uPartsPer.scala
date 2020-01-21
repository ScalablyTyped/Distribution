package typings.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.ppm
  - typings.convertUnits.convertUnitsStrings.ppb
  - typings.convertUnits.convertUnitsStrings.ppt
  - typings.convertUnits.convertUnitsStrings.ppq
*/
trait uPartsPer extends js.Object

object uPartsPer {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ppb: typings.convertUnits.convertUnitsStrings.ppb = this.cast("ppb")
  @scala.inline
  def ppm: typings.convertUnits.convertUnitsStrings.ppm = this.cast("ppm")
  @scala.inline
  def ppq: typings.convertUnits.convertUnitsStrings.ppq = this.cast("ppq")
  @scala.inline
  def ppt: typings.convertUnits.convertUnitsStrings.ppt = this.cast("ppt")
}

