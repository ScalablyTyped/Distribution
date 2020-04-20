package typings.coinbase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrency extends js.Object {
  /**
    * Base currency
    */
  var currency: String
  /**
    * Rates as floating points in strings; indexed by currency id
    */
  var rates: StringDictionary[String]
}

object AnonCurrency {
  @scala.inline
  def apply(currency: String, rates: StringDictionary[String]): AnonCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrency]
  }
}

