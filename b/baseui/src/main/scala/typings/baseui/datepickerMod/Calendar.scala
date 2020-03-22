package typings.baseui.datepickerMod

import typings.baseui.AnonDate
import typings.baseui.AnonDateDate
import typings.baseui.AnonEventEvent
import typings.react.mod.Component
import typings.react.mod.ReactNode
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
  def changeMonth(hasDate: AnonDateDate): Unit = js.native
  def changeYear(hasDate: AnonDateDate): Unit = js.native
  def focusCalendar(): Unit = js.native
  def getDateInView(): Date = js.native
  def getSingleDate(value: js.Array[Date]): Date | Null = js.native
  def getSingleDate(value: Date): Date | Null = js.native
  def handleArrowKey(key: String): Unit = js.native
  def handleDateChange(data: AnonDate): Unit = js.native
  def handleMonthChange(date: Date): Unit = js.native
  def handleTabbing(event: KeyboardEvent): Unit = js.native
  def handleTimeChange(time: Date, index: Double): Unit = js.native
  def handleYearChange(date: Date): Unit = js.native
  def onDayMouseLeave(data: AnonEventEvent): Unit = js.native
  def onDayMouseOver(data: AnonEventEvent): Unit = js.native
  def onKeyDown(event: KeyboardEvent): Unit = js.native
  def renderCalendarHeader(date: Date, order: Double): ReactNode = js.native
  def renderMonths(): js.Array[ReactNode] = js.native
  def renderQuickSelect(): ReactNode = js.native
  def renderTimeSelect(value: Date, onChange: js.Function1[/* args */ js.Any, _]): ReactNode = js.native
  def setHighlightedDate(date: Date): Unit = js.native
}

