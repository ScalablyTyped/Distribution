package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpotPriceOpts extends js.Object {
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: String
  /**
    * Specify date for historic spot price in format YYYY-MM-DD (UTC)
    */
  var date: js.UndefOr[String] = js.undefined
}

object GetSpotPriceOpts {
  @scala.inline
  def apply(currencyPair: String, date: String = null): GetSpotPriceOpts = {
    val __obj = js.Dynamic.literal(currencyPair = currencyPair)
    if (date != null) __obj.updateDynamic("date")(date)
    __obj.asInstanceOf[GetSpotPriceOpts]
  }
}

