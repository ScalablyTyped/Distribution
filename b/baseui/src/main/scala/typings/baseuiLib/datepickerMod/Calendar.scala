package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "Calendar")
@js.native
class Calendar ()
  extends reactLib.reactMod.Component[CalendarProps, CalendarState, js.Any] {
  def blurCalendar(): scala.Unit = js.native
  def changeMonth(hasDate: baseuiLib.Anon_Date_1680226493): scala.Unit = js.native
  def changeYear(hasDate: baseuiLib.Anon_Date_1680226493): scala.Unit = js.native
  def focusCalendar(): scala.Unit = js.native
  def getDateInView(): stdLib.Date = js.native
  def getSingleDate(value: js.Array[stdLib.Date]): stdLib.Date | scala.Null = js.native
  def getSingleDate(value: stdLib.Date): stdLib.Date | scala.Null = js.native
  def handleArrowKey(key: java.lang.String): scala.Unit = js.native
  def handleDateChange(data: baseuiLib.Anon_Date): scala.Unit = js.native
  def handleMonthChange(date: stdLib.Date): scala.Unit = js.native
  def handleTabbing(event: stdLib.KeyboardEvent): scala.Unit = js.native
  def handleTimeChange(time: stdLib.Date, index: scala.Double): scala.Unit = js.native
  def handleYearChange(date: stdLib.Date): scala.Unit = js.native
  def onDayMouseLeave(data: baseuiLib.Anon_DateEvent_1830991553): scala.Unit = js.native
  def onDayMouseOver(data: baseuiLib.Anon_DateEvent_1830991553): scala.Unit = js.native
  def onKeyDown(event: stdLib.KeyboardEvent): scala.Unit = js.native
  def renderCalendarHeader(date: stdLib.Date, order: scala.Double): reactLib.reactMod.ReactNode = js.native
  def renderMonths(): js.Array[reactLib.reactMod.ReactNode] = js.native
  def renderQuickSelect(): reactLib.reactMod.ReactNode = js.native
  def renderTimeSelect(value: stdLib.Date, onChange: js.Function1[/* args */ js.Any, _]): reactLib.reactMod.ReactNode = js.native
  def setHighlightedDate(date: stdLib.Date): scala.Unit = js.native
}

