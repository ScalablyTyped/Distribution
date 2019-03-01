package typings
package chocolatechipjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(timeout: scala.Int | scala.Double = null): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}

