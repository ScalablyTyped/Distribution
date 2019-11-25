package typings.coinbase.coinbaseMod

import typings.coinbase.Anon_Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeRate extends js.Object {
  var data: Anon_Currency
}

object ExchangeRate {
  @scala.inline
  def apply(data: Anon_Currency): ExchangeRate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExchangeRate]
  }
}

