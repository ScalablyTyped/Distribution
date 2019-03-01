package typings
package axiosDashMockDashAdapterLib.axiosDashMockDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockAdapterOptions extends js.Object {
  var delayResponse: js.UndefOr[scala.Double] = js.undefined
}

object MockAdapterOptions {
  @scala.inline
  def apply(delayResponse: scala.Int | scala.Double = null): MockAdapterOptions = {
    val __obj = js.Dynamic.literal()
    if (delayResponse != null) __obj.updateDynamic("delayResponse")(delayResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockAdapterOptions]
  }
}

