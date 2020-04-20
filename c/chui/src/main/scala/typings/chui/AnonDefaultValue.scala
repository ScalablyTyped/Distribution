package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultValue extends js.Object {
  var defaultValue: Double
  var end: Double
  var start: Double
}

object AnonDefaultValue {
  @scala.inline
  def apply(defaultValue: Double, end: Double, start: Double): AnonDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultValue]
  }
}

