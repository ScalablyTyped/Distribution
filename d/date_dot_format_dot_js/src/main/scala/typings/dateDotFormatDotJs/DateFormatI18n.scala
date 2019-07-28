package typings.dateDotFormatDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internationalization strings
trait DateFormatI18n extends js.Object {
  var dayNames: js.Array[String]
  var monthNames: js.Array[String]
}

object DateFormatI18n {
  @scala.inline
  def apply(dayNames: js.Array[String], monthNames: js.Array[String]): DateFormatI18n = {
    val __obj = js.Dynamic.literal(dayNames = dayNames, monthNames = monthNames)
  
    __obj.asInstanceOf[DateFormatI18n]
  }
}

