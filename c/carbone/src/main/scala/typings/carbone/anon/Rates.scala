package typings.carbone.anon

import typings.carbone.mod.CurrencyRates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rates extends js.Object {
  var rates: CurrencyRates
  var source: String
  var target: String
}

object Rates {
  @scala.inline
  def apply(rates: CurrencyRates, source: String, target: String): Rates = {
    val __obj = js.Dynamic.literal(rates = rates.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rates]
  }
}

