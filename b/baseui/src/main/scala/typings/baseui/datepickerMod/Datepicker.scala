package typings.baseui.datepickerMod

import typings.baseui.Anon_Date
import typings.react.reactMod.Component
import typings.std.Date
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "Datepicker")
@js.native
class Datepicker ()
  extends Component[DatepickerProps, DatepickerState, js.Any] {
  def close(): Unit = js.native
  def focusCalendar(): Unit = js.native
  def formatDate(date: js.Array[Date], formatString: String): String | js.Array[String] = js.native
  def formatDate(date: Date, formatString: String): String | js.Array[String] = js.native
  def formatDisplayValue(date: js.Array[Date]): String = js.native
  def formatDisplayValue(date: Date): String = js.native
  def handleEsc(): Unit = js.native
  def handleInputBlur(): Unit = js.native
  def handleKeyDown(event: KeyboardEvent): Unit = js.native
  def onChange(data: Anon_Date): Unit = js.native
  def open(): Unit = js.native
}

