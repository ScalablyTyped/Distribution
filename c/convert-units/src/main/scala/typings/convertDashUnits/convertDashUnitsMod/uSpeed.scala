package typings.convertDashUnits.convertDashUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertDashUnits.convertDashUnitsStrings.mSlashs
  - typings.convertDashUnits.convertDashUnitsStrings.kmSlashh
  - typings.convertDashUnits.convertDashUnitsStrings.mSlashh
  - typings.convertDashUnits.convertDashUnitsStrings.knot
  - typings.convertDashUnits.convertDashUnitsStrings.ftSlashs
*/
trait uSpeed extends js.Object

object uSpeed {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ftSlashs: typings.convertDashUnits.convertDashUnitsStrings.ftSlashs = this.cast("ft/s")
  @scala.inline
  def kmSlashh: typings.convertDashUnits.convertDashUnitsStrings.kmSlashh = this.cast("km/h")
  @scala.inline
  def knot: typings.convertDashUnits.convertDashUnitsStrings.knot = this.cast("knot")
  @scala.inline
  def mSlashh: typings.convertDashUnits.convertDashUnitsStrings.mSlashh = this.cast("m/h")
  @scala.inline
  def mSlashs: typings.convertDashUnits.convertDashUnitsStrings.mSlashs = this.cast("m/s")
}

