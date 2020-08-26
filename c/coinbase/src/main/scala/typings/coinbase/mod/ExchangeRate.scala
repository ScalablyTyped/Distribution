package typings.coinbase.mod

import typings.coinbase.anon.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExchangeRate extends js.Object {
  var data: Currency = js.native
}

object ExchangeRate {
  @scala.inline
  def apply(data: Currency): ExchangeRate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRate]
  }
  @scala.inline
  implicit class ExchangeRateOps[Self <: ExchangeRate] (val x: Self) extends AnyVal {
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
    def setData(value: Currency): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

