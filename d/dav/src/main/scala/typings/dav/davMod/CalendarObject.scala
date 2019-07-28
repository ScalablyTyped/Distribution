package typings.dav.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "CalendarObject")
@js.native
class CalendarObject () extends DAVObject {
  def this(options: CalendarObjectOptions) = this()
  var calendar: Calendar = js.native
  var calendarData: String = js.native
}

