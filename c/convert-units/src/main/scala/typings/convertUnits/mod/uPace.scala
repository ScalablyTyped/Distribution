package typings.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertUnits.convertUnitsStrings.sSlashm
  - typings.convertUnits.convertUnitsStrings.minSlashkm
  - typings.convertUnits.convertUnitsStrings.sSlashft
*/
trait uPace extends js.Object

object uPace {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def minSlashkm: typings.convertUnits.convertUnitsStrings.minSlashkm = this.cast("min/km")
  @scala.inline
  def sSlashft: typings.convertUnits.convertUnitsStrings.sSlashft = this.cast("s/ft")
  @scala.inline
  def sSlashm: typings.convertUnits.convertUnitsStrings.sSlashm = this.cast("s/m")
}

