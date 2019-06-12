package typings
package coinbaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Currency extends js.Object {
  /**
    * Base currency
    */
  var currency: java.lang.String
  /**
    * Rates as floating points in strings; indexed by currency id
    */
  var rates: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Anon_Currency {
  @scala.inline
  def apply(currency: java.lang.String, rates: org.scalablytyped.runtime.StringDictionary[java.lang.String]): Anon_Currency = {
    val __obj = js.Dynamic.literal(currency = currency, rates = rates)
  
    __obj.asInstanceOf[Anon_Currency]
  }
}

