package typings.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.mSlashs
  - typings.convertUnits.convertUnitsStrings.kmSlashh
  - typings.convertUnits.convertUnitsStrings.mSlashh
  - typings.convertUnits.convertUnitsStrings.knot
  - typings.convertUnits.convertUnitsStrings.ftSlashs
*/
trait uSpeed extends js.Object

object uSpeed {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ftSlashs: typings.convertUnits.convertUnitsStrings.ftSlashs = this.cast("ft/s")
  @scala.inline
  def kmSlashh: typings.convertUnits.convertUnitsStrings.kmSlashh = this.cast("km/h")
  @scala.inline
  def knot: typings.convertUnits.convertUnitsStrings.knot = this.cast("knot")
  @scala.inline
  def mSlashh: typings.convertUnits.convertUnitsStrings.mSlashh = this.cast("m/h")
  @scala.inline
  def mSlashs: typings.convertUnits.convertUnitsStrings.mSlashs = this.cast("m/s")
}

