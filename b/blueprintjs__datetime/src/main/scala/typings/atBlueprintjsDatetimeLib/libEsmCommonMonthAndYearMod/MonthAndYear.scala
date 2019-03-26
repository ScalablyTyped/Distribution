package typings
package atBlueprintjsDatetimeLib.libEsmCommonMonthAndYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/common/monthAndYear", "MonthAndYear")
@js.native
class MonthAndYear () extends js.Object {
  def this(month: scala.Double) = this()
  def this(month: scala.Double, year: scala.Double) = this()
  var date: js.Any = js.native
  def getFullDate(): stdLib.Date = js.native
  def getMonth(): scala.Double = js.native
  def getNextMonth(): MonthAndYear = js.native
  def getPreviousMonth(): MonthAndYear = js.native
  def getYear(): scala.Double = js.native
  def isAfter(monthAndYear: MonthAndYear): scala.Boolean = js.native
  def isBefore(monthAndYear: MonthAndYear): scala.Boolean = js.native
  def isSame(monthAndYear: MonthAndYear): scala.Boolean = js.native
  def isSameMonth(monthAndYear: MonthAndYear): scala.Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/common/monthAndYear", "MonthAndYear")
@js.native
object MonthAndYear extends js.Object {
  def fromDate(date: stdLib.Date): atBlueprintjsDatetimeLib.libEsmCommonMonthAndYearMod.MonthAndYear = js.native
}

