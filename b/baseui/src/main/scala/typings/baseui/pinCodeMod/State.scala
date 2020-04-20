package typings.baseui.pinCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var values: js.Array[String]
}

object State {
  @scala.inline
  def apply(values: js.Array[String]): State = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

