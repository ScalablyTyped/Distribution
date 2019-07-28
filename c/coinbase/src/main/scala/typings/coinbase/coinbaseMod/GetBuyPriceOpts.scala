package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBuyPriceOpts extends js.Object {
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: String
}

object GetBuyPriceOpts {
  @scala.inline
  def apply(currencyPair: String): GetBuyPriceOpts = {
    val __obj = js.Dynamic.literal(currencyPair = currencyPair)
  
    __obj.asInstanceOf[GetBuyPriceOpts]
  }
}

