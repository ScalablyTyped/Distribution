package typings.coinbase.mod

import typings.coinbase.AnonCurrency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeRate extends js.Object {
  var data: AnonCurrency
}

object ExchangeRate {
  @scala.inline
  def apply(data: AnonCurrency): ExchangeRate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRate]
  }
}

