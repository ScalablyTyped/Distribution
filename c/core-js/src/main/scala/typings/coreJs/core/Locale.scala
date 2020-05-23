package typings.coreJs.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var months: String
  var weekdays: String
}

object Locale {
  @scala.inline
  def apply(months: String, weekdays: String): Locale = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

