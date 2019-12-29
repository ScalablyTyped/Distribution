package typings.convertDashUnits.convertDashUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertDashUnits.convertDashUnitsStrings.sSlashm
  - typings.convertDashUnits.convertDashUnitsStrings.minSlashkm
  - typings.convertDashUnits.convertDashUnitsStrings.sSlashft
*/
trait uPace extends js.Object

object uPace {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def minSlashkm: typings.convertDashUnits.convertDashUnitsStrings.minSlashkm = this.cast("min/km")
  @scala.inline
  def sSlashft: typings.convertDashUnits.convertDashUnitsStrings.sSlashft = this.cast("s/ft")
  @scala.inline
  def sSlashm: typings.convertDashUnits.convertDashUnitsStrings.sSlashm = this.cast("s/m")
}

