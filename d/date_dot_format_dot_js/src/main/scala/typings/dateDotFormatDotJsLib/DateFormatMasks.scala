package typings
package dateDotFormatDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Some common format strings
trait DateFormatMasks extends js.Object {
  var default: java.lang.String
  var fullDate: java.lang.String
  var isoDate: java.lang.String
  var isoDateTime: java.lang.String
  var isoTime: java.lang.String
  var isoUtcDateTime: java.lang.String
  var longDate: java.lang.String
  var longTime: java.lang.String
  var mediumDate: java.lang.String
  var mediumTime: java.lang.String
  var shortDate: java.lang.String
  var shortTime: java.lang.String
}

object DateFormatMasks {
  @scala.inline
  def apply(
    default: java.lang.String,
    fullDate: java.lang.String,
    isoDate: java.lang.String,
    isoDateTime: java.lang.String,
    isoTime: java.lang.String,
    isoUtcDateTime: java.lang.String,
    longDate: java.lang.String,
    longTime: java.lang.String,
    mediumDate: java.lang.String,
    mediumTime: java.lang.String,
    shortDate: java.lang.String,
    shortTime: java.lang.String
  ): DateFormatMasks = {
    val __obj = js.Dynamic.literal(default = default, fullDate = fullDate, isoDate = isoDate, isoDateTime = isoDateTime, isoTime = isoTime, isoUtcDateTime = isoUtcDateTime, longDate = longDate, longTime = longTime, mediumDate = mediumDate, mediumTime = mediumTime, shortDate = shortDate, shortTime = shortTime)
  
    __obj.asInstanceOf[DateFormatMasks]
  }
}

