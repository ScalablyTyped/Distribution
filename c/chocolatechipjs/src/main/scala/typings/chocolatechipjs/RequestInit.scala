package typings.chocolatechipjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(timeout: Int | Double = null): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}

