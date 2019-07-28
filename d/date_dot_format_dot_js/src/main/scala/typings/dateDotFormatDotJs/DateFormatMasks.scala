package typings.dateDotFormatDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Some common format strings
trait DateFormatMasks extends js.Object {
  var default: String
  var fullDate: String
  var isoDate: String
  var isoDateTime: String
  var isoTime: String
  var isoUtcDateTime: String
  var longDate: String
  var longTime: String
  var mediumDate: String
  var mediumTime: String
  var shortDate: String
  var shortTime: String
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
    val __obj = js.Dynamic.literal(default = default, fullDate = fullDate, isoDate = isoDate, isoDateTime = isoDateTime, isoTime = isoTime, isoUtcDateTime = isoUtcDateTime, longDate = longDate, longTime = longTime, mediumDate = mediumDate, mediumTime = mediumTime, shortDate = shortDate, shortTime = shortTime)
  
    __obj.asInstanceOf[DateFormatMasks]
  }
}

