package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.CalendarObject> */
trait CalendarObjectOptions extends js.Object {
  var calendar: js.UndefOr[Calendar] = js.undefined
  var calendarData: js.UndefOr[String] = js.undefined
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object CalendarObjectOptions {
  @scala.inline
  def apply(
    calendar: Calendar = null,
    calendarData: String = null,
    constructor: /* options */ js.UndefOr[CalendarObjectOptions] => js.Any = null,
    data: String = null,
    etag: String = null,
    url: String = null
  ): CalendarObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (calendarData != null) __obj.updateDynamic("calendarData")(calendarData.asInstanceOf[js.Any])
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarObjectOptions]
  }
}

