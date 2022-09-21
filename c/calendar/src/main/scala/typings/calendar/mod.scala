package typings.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("calendar", "Calendar")
  @js.native
  /**
    * @param firstWeekDay default is `0` (Sunday)
    */
  open class Calendar () extends StObject {
    def this(firstWeekDay: Double) = this()
    
    def monthDates[T](year: Double, month: Double): js.Array[js.Array[T]] = js.native
    def monthDates[T](year: Double, month: Double, dayFormatter: DayFormatter[T]): js.Array[js.Array[T]] = js.native
    def monthDates[T, U](year: Double, month: Double, dayFormatter: DayFormatter[T], weekFormatter: WeekFormatter[T, U]): js.Array[U] = js.native
    
    def monthDays(year: Double, month: Double): js.Array[js.Array[Double]] = js.native
    
    def monthText(): String = js.native
    def monthText(year: Double, month: Double): String = js.native
    
    def weekStartDate(date: js.Date): js.Date = js.native
  }
  
  @JSImport("calendar", "version")
  @js.native
  val version: String = js.native
  
  type DayFormatter[T] = js.Function1[/* day */ js.Date, T]
  
  type WeekFormatter[T, U] = js.Function1[/* week */ js.Array[T], U]
}
