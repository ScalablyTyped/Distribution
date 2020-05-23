package typings.axiosMockAdapter.mod

import typings.axiosMockAdapter.axiosMockAdapterStrings.passthrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockAdapterOptions extends js.Object {
  var delayResponse: js.UndefOr[Double] = js.undefined
  var onNoMatch: js.UndefOr[passthrough] = js.undefined
}

object MockAdapterOptions {
  @scala.inline
  def apply(delayResponse: js.UndefOr[Double] = js.undefined, onNoMatch: passthrough = null): MockAdapterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayResponse)) __obj.updateDynamic("delayResponse")(delayResponse.get.asInstanceOf[js.Any])
    if (onNoMatch != null) __obj.updateDynamic("onNoMatch")(onNoMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockAdapterOptions]
  }
}

