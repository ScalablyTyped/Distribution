package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeRate extends js.Object {
  var data: coinbaseLib.Anon_Currency
}

object ExchangeRate {
  @scala.inline
  def apply(data: coinbaseLib.Anon_Currency): ExchangeRate = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[ExchangeRate]
  }
}

