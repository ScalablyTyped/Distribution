package typings.bytebuffer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var length: Double
  var value: Double
}

object Value {
  @scala.inline
  def apply(length: Double, value: Double): Value = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

