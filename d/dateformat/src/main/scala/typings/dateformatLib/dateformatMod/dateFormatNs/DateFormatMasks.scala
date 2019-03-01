package typings
package dateformatLib.dateformatMod.dateFormatNs

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
trait DateFormatMasks
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var default: java.lang.String
  var expiresHeaderFormat: java.lang.String
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
    expiresHeaderFormat: java.lang.String,
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
    shortTime: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): DateFormatMasks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("expiresHeaderFormat")(expiresHeaderFormat)
    __obj.updateDynamic("fullDate")(fullDate)
    __obj.updateDynamic("isoDate")(isoDate)
    __obj.updateDynamic("isoDateTime")(isoDateTime)
    __obj.updateDynamic("isoTime")(isoTime)
    __obj.updateDynamic("isoUtcDateTime")(isoUtcDateTime)
    __obj.updateDynamic("longDate")(longDate)
    __obj.updateDynamic("longTime")(longTime)
    __obj.updateDynamic("mediumDate")(mediumDate)
    __obj.updateDynamic("mediumTime")(mediumTime)
    __obj.updateDynamic("shortDate")(shortDate)
    __obj.updateDynamic("shortTime")(shortTime)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DateFormatMasks]
  }
}

