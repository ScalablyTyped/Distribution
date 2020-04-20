package typings.coreJs.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale_ extends js.Object {
  var months: java.lang.String
  var weekdays: java.lang.String
}

object Locale_ {
  @scala.inline
  def apply(months: java.lang.String, weekdays: java.lang.String): Locale_ = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale_]
  }
}

