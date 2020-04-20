package typings.bootstrapSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeValue extends js.Object {
  var newValue: Double
  var oldValue: Double
}

object ChangeValue {
  @scala.inline
  def apply(newValue: Double, oldValue: Double): ChangeValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeValue]
  }
}

