package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "Datepicker")
@js.native
class Datepicker ()
  extends reactLib.reactMod.Component[DatepickerProps, DatepickerState, js.Any] {
  def close(): scala.Unit = js.native
  def focusCalendar(): scala.Unit = js.native
  def formatDate(date: js.Array[stdLib.Date], formatString: java.lang.String): java.lang.String | js.Array[java.lang.String] = js.native
  def formatDate(date: stdLib.Date, formatString: java.lang.String): java.lang.String | js.Array[java.lang.String] = js.native
  def formatDisplayValue(date: js.Array[stdLib.Date]): java.lang.String = js.native
  def formatDisplayValue(date: stdLib.Date): java.lang.String = js.native
  def handleEsc(): scala.Unit = js.native
  def handleInputBlur(): scala.Unit = js.native
  def handleKeyDown(event: stdLib.KeyboardEvent): scala.Unit = js.native
  def onChange(data: baseuiLib.Anon_Date): scala.Unit = js.native
  def open(): scala.Unit = js.native
}

