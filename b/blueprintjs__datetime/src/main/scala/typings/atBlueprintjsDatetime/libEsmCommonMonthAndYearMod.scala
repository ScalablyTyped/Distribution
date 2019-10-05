package typings.atBlueprintjsDatetime

import typings.atBlueprintjsDatetime.libEsmCommonMonthAndYearMod.MonthAndYear
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/common/monthAndYear", JSImport.Namespace)
@js.native
object libEsmCommonMonthAndYearMod extends js.Object {
  @js.native
  class MonthAndYear () extends js.Object {
    def this(month: Double) = this()
    def this(month: Double, year: Double) = this()
    var date: js.Any = js.native
    def getFullDate(): Date = js.native
    def getMonth(): Double = js.native
    def getNextMonth(): MonthAndYear = js.native
    def getPreviousMonth(): MonthAndYear = js.native
    def getYear(): Double = js.native
    def isAfter(monthAndYear: MonthAndYear): Boolean = js.native
    def isBefore(monthAndYear: MonthAndYear): Boolean = js.native
    def isSame(monthAndYear: MonthAndYear): Boolean = js.native
    def isSameMonth(monthAndYear: MonthAndYear): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MonthAndYear extends js.Object {
    def fromDate(date: Date): MonthAndYear = js.native
  }
  
}

