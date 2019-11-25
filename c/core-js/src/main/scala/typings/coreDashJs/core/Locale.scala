package typings.coreDashJs.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var months: java.lang.String
  var weekdays: java.lang.String
}

object Locale {
  @scala.inline
  def apply(months: java.lang.String, weekdays: java.lang.String): Locale = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locale]
  }
}

@JSGlobal("core.locale")
@js.native
object locale extends js.Object {
  def apply(): java.lang.String = js.native
  def apply(lang: java.lang.String): java.lang.String = js.native
}

