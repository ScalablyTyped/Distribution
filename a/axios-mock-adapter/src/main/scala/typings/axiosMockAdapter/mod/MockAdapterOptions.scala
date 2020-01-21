package typings.axiosMockAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockAdapterOptions extends js.Object {
  var delayResponse: js.UndefOr[Double] = js.undefined
}

object MockAdapterOptions {
  @scala.inline
  def apply(delayResponse: Int | Double = null): MockAdapterOptions = {
    val __obj = js.Dynamic.literal()
    if (delayResponse != null) __obj.updateDynamic("delayResponse")(delayResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockAdapterOptions]
  }
}

