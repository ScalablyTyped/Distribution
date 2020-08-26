package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.CalendarObject> */
@js.native
trait CalendarObjectOptions extends js.Object {
  var calendar: js.UndefOr[Calendar] = js.native
  var calendarData: js.UndefOr[String] = js.native
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.native
  var data: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object CalendarObjectOptions {
  @scala.inline
  def apply(): CalendarObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarObjectOptions]
  }
  @scala.inline
  implicit class CalendarObjectOptionsOps[Self <: CalendarObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setCalendarData(value: String): Self = this.set("calendarData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarData: Self = this.set("calendarData", js.undefined)
    @scala.inline
    def setConstructor(value: /* options */ js.UndefOr[CalendarObjectOptions] => js.Any): Self = this.set("constructor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

