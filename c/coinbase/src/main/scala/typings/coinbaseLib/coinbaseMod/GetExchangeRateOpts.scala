package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExchangeRateOpts extends js.Object {
  /**
    * Base currency, default USD
    */
  var currency: js.UndefOr[java.lang.String] = js.undefined
}

object GetExchangeRateOpts {
  @scala.inline
  def apply(currency: java.lang.String = null): GetExchangeRateOpts = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    __obj.asInstanceOf[GetExchangeRateOpts]
  }
}

