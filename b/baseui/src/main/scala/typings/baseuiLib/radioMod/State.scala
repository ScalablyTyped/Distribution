package typings
package baseuiLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object State {
  @scala.inline
  def apply(value: java.lang.String = null): State = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[State]
  }
}

