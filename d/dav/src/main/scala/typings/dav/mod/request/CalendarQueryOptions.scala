package typings.dav.mod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarQueryOptions extends js.Object {
  /**
    * value for Depth header.
    */
  var depth: js.UndefOr[String] = js.native
  /**
    * list of filters to send with request.
    */
  var filters: js.Array[js.Object] = js.native
  /**
    * list of props to request.
    */
  var props: js.Array[js.Object] = js.native
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: String = js.native
}

object CalendarQueryOptions {
  @scala.inline
  def apply(filters: js.Array[js.Object], props: js.Array[js.Object], timezone: String): CalendarQueryOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarQueryOptions]
  }
  @scala.inline
  implicit class CalendarQueryOptionsOps[Self <: CalendarQueryOptions] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: js.Object*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[js.Object]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropsVarargs(value: js.Object*): Self = this.set("props", js.Array(value :_*))
    @scala.inline
    def setProps(value: js.Array[js.Object]): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: String): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
  }
  
}

