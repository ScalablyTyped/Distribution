package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handled extends js.Object {
  var _handled: scala.Double
  var _unhandled: scala.Double
}

object Anon_Handled {
  @scala.inline
  def apply(_handled: scala.Double, _unhandled: scala.Double): Anon_Handled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_handled")(_handled)
    __obj.updateDynamic("_unhandled")(_unhandled)
    __obj.asInstanceOf[Anon_Handled]
  }
}

