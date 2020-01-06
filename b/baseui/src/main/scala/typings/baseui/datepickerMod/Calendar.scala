package typings.baseui.datepickerMod

import typings.baseui.Anon_Date
import typings.baseui.Anon_DateEvent_21306017
import typings.baseui.Anon_Date_912435367
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.std.Date
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "Calendar")
@js.native
class Calendar ()
  extends Component[CalendarProps, CalendarState, js.Any] {
  def blurCalendar(): Unit = js.native
  def changeMonth(hasDate: Anon_Date_912435367): Unit = js.native
  def changeYear(hasDate: Anon_Date_912435367): Unit = js.native
  def focusCalendar(): Unit = js.native
  def getDateInView(): Date = js.native
  def getSingleDate(value: js.Array[Date]): Date | Null = js.native
  def getSingleDate(value: Date): Date | Null = js.native
  def handleArrowKey(key: String): Unit = js.native
  def handleDateChange(data: Anon_Date): Unit = js.native
  def handleMonthChange(date: Date): Unit = js.native
  def handleTabbing(event: KeyboardEvent): Unit = js.native
  def handleTimeChange(time: Date, index: Double): Unit = js.native
  def handleYearChange(date: Date): Unit = js.native
  def onDayMouseLeave(data: Anon_DateEvent_21306017): Unit = js.native
  def onDayMouseOver(data: Anon_DateEvent_21306017): Unit = js.native
  def onKeyDown(event: KeyboardEvent): Unit = js.native
  def renderCalendarHeader(date: Date, order: Double): ReactNode = js.native
  def renderMonths(): js.Array[ReactNode] = js.native
  def renderQuickSelect(): ReactNode = js.native
  def renderTimeSelect(value: Date, onChange: js.Function1[/* args */ js.Any, _]): ReactNode = js.native
  def setHighlightedDate(date: Date): Unit = js.native
}

