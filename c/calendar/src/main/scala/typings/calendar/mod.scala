package typings.calendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("calendar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val version: String = js.native
  
  @js.native
  /**
    * @param firstWeekDay default is `0` (Sunday)
    */
  class Calendar () extends js.Object {
    def this(firstWeekDay: Double) = this()
    
    def monthDates(year: Double, month: Double): js.Array[Date] = js.native
    def monthDates(year: Double, month: Double, dayFormatter: js.UndefOr[scala.Nothing], weekFormatter: WeekFormatter): js.Array[Date] = js.native
    def monthDates(year: Double, month: Double, dayFormatter: DayFormatter): js.Array[Date] = js.native
    def monthDates(year: Double, month: Double, dayFormatter: DayFormatter, weekFormatter: WeekFormatter): js.Array[Date] = js.native
    
    def monthDays(year: Double, month: Double): js.Array[Date] = js.native
    
    def monthText(): String = js.native
    def monthText(year: Double, month: Double): String = js.native
    
    def weekStartDate(date: Date): Date = js.native
  }
  
  type DayFormatter = js.Function1[/* day */ Date, Date | String]
  
  type WeekFormatter = js.Function1[/* week */ js.Array[Date], js.Array[Date] | String]
}
