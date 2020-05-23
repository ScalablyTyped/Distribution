package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueNumber extends js.Object {
  var value: Double
}

object ValueNumber {
  @scala.inline
  def apply(value: Double): ValueNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNumber]
  }
}

