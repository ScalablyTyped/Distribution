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

