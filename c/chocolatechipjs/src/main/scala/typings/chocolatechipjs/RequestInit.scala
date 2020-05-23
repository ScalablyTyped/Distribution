package typings.chocolatechipjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}

