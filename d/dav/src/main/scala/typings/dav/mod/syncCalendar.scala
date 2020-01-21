package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "syncCalendar")
@js.native
object syncCalendar extends js.Object {
  def apply(calendar: Calendar, options: SyncCalendarOptions): js.Promise[Calendar] = js.native
}

