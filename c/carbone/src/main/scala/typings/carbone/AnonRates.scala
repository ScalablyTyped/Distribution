package typings.carbone

import typings.carbone.mod.CurrencyRates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRates extends js.Object {
  var rates: CurrencyRates
  var source: String
  var target: String
}

object AnonRates {
  @scala.inline
  def apply(rates: CurrencyRates, source: String, target: String): AnonRates = {
    val __obj = js.Dynamic.literal(rates = rates.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRates]
  }
}

