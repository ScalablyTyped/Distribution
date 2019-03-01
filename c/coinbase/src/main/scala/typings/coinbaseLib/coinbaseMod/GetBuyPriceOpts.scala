package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBuyPriceOpts extends js.Object {
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: java.lang.String
}

object GetBuyPriceOpts {
  @scala.inline
  def apply(currencyPair: java.lang.String): GetBuyPriceOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currencyPair")(currencyPair)
    __obj.asInstanceOf[GetBuyPriceOpts]
  }
}

