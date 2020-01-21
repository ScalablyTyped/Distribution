package typings.dav.mod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarQueryOptions extends js.Object {
  /**
    * value for Depth header.
    */
  var depth: js.UndefOr[String] = js.undefined
  /**
    * list of filters to send with request.
    */
  var filters: js.Array[js.Object]
  /**
    * list of props to request.
    */
  var props: js.Array[js.Object]
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: String
}

object CalendarQueryOptions {
  @scala.inline
  def apply(filters: js.Array[js.Object], props: js.Array[js.Object], timezone: String, depth: String = null): CalendarQueryOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarQueryOptions]
  }
}

