package typings
package bootstrapDashSliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeValue extends js.Object {
  var newValue: scala.Double
  var oldValue: scala.Double
}

object ChangeValue {
  @scala.inline
  def apply(newValue: scala.Double, oldValue: scala.Double): ChangeValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newValue")(newValue)
    __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[ChangeValue]
  }
}

