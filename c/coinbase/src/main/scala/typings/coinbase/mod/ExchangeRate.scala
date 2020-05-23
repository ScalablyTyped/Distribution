package typings.coinbase.mod

import typings.coinbase.anon.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeRate extends js.Object {
  var data: Currency
}

object ExchangeRate {
  @scala.inline
  def apply(data: Currency): ExchangeRate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRate]
  }
}

