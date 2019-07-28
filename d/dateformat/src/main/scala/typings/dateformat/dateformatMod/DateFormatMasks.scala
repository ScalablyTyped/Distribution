package typings.dateformat.dateformatMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * dateFormat.masks
  *
  * Predefined Formats
  *
  * @see https://github.com/felixge/node-dateformat/blob/master/lib/dateformat.js#L107
  */
trait DateFormatMasks extends /* key */ StringDictionary[String] {
  var default: String
  var expiresHeaderFormat: String
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
    expiresHeaderFormat: String,
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
    shortTime: String,
    StringDictionary: /* key */ StringDictionary[String] = null
  ): DateFormatMasks = {
    val __obj = js.Dynamic.literal(default = default, expiresHeaderFormat = expiresHeaderFormat, fullDate = fullDate, isoDate = isoDate, isoDateTime = isoDateTime, isoTime = isoTime, isoUtcDateTime = isoUtcDateTime, longDate = longDate, longTime = longTime, mediumDate = mediumDate, mediumTime = mediumTime, shortDate = shortDate, shortTime = shortTime)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DateFormatMasks]
  }
}

