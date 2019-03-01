package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSellPriceOpts extends js.Object {
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: java.lang.String
}

object GetSellPriceOpts {
  @scala.inline
  def apply(currencyPair: java.lang.String): GetSellPriceOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currencyPair")(currencyPair)
    __obj.asInstanceOf[GetSellPriceOpts]
  }
}

