package typings.dateFormatJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Some common format strings
@js.native
trait DateFormatMasks extends js.Object {
  var default: String = js.native
  var fullDate: String = js.native
  var isoDate: String = js.native
  var isoDateTime: String = js.native
  var isoTime: String = js.native
  var isoUtcDateTime: String = js.native
  var longDate: String = js.native
  var longTime: String = js.native
  var mediumDate: String = js.native
  var mediumTime: String = js.native
  var shortDate: String = js.native
  var shortTime: String = js.native
}

object DateFormatMasks {
  @scala.inline
  def apply(
    default: String,
    fullDate: String,
    isoDate: String,
    isoDateTime: String,
    isoTime: String,
    isoUtcDateTime: String,
    longDate: String,
    longTime: String,
    mediumDate: String,
    mediumTime: String,
    shortDate: String,
    shortTime: String
  ): DateFormatMasks = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], isoDate = isoDate.asInstanceOf[js.Any], isoDateTime = isoDateTime.asInstanceOf[js.Any], isoTime = isoTime.asInstanceOf[js.Any], isoUtcDateTime = isoUtcDateTime.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatMasks]
  }
  @scala.inline
  implicit class DateFormatMasksOps[Self <: DateFormatMasks] (val x: Self) extends AnyVal {
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDate(value: String): Self = this.set("fullDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsoDate(value: String): Self = this.set("isoDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsoDateTime(value: String): Self = this.set("isoDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsoTime(value: String): Self = this.set("isoTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsoUtcDateTime(value: String): Self = this.set("isoUtcDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongDate(value: String): Self = this.set("longDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongTime(value: String): Self = this.set("longTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediumDate(value: String): Self = this.set("mediumDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediumTime(value: String): Self = this.set("mediumTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDate(value: String): Self = this.set("shortDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortTime(value: String): Self = this.set("shortTime", value.asInstanceOf[js.Any])
  }
  
}

