package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeRate extends js.Object {
  /**
    * Base currency
    */
  var currency: java.lang.String
  /**
    * Rates as floating points in strings; indexed by currency id
    */
  var rates: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object ExchangeRate {
  @scala.inline
  def apply(currency: java.lang.String, rates: org.scalablytyped.runtime.StringDictionary[java.lang.String]): ExchangeRate = {
    val __obj = js.Dynamic.literal(currency = currency, rates = rates)
  
    __obj.asInstanceOf[ExchangeRate]
  }
}

