package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValue extends js.Object {
  var defaultValue: Double
  var end: Double
  var start: Double
}

object DefaultValue {
  @scala.inline
  def apply(defaultValue: Double, end: Double, start: Double): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
}

