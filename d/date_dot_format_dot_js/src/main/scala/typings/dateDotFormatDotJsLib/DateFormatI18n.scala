package typings
package dateDotFormatDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internationalization strings
trait DateFormatI18n extends js.Object {
  var dayNames: js.Array[java.lang.String]
  var monthNames: js.Array[java.lang.String]
}

object DateFormatI18n {
  @scala.inline
  def apply(dayNames: js.Array[java.lang.String], monthNames: js.Array[java.lang.String]): DateFormatI18n = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dayNames")(dayNames)
    __obj.updateDynamic("monthNames")(monthNames)
    __obj.asInstanceOf[DateFormatI18n]
  }
}

