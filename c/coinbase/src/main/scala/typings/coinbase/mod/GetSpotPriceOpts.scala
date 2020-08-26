package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSpotPriceOpts extends js.Object {
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: String = js.native
  /**
    * Specify date for historic spot price in format YYYY-MM-DD (UTC)
    */
  var date: js.UndefOr[String] = js.native
}

object GetSpotPriceOpts {
  @scala.inline
  def apply(currencyPair: String): GetSpotPriceOpts = {
    val __obj = js.Dynamic.literal(currencyPair = currencyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpotPriceOpts]
  }
  @scala.inline
  implicit class GetSpotPriceOptsOps[Self <: GetSpotPriceOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrencyPair(value: String): Self = this.set("currencyPair", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
  }
  
}

