package typings
package dateDashFnsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WeekStartsOn extends js.Object {
  var weekStartsOn: js.UndefOr[scala.Double] = js.undefined
}

object Anon_WeekStartsOn {
  @scala.inline
  def apply(weekStartsOn: scala.Int | scala.Double = null): Anon_WeekStartsOn = {
    val __obj = js.Dynamic.literal()
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WeekStartsOn]
  }
}

