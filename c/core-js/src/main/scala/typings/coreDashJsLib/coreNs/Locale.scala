package typings
package coreDashJsLib.coreNs

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
    val __obj = js.Dynamic.literal(months = months, weekdays = weekdays)
  
    __obj.asInstanceOf[Locale]
  }
}

