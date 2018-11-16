package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MoneyHash extends js.Object {
  /**
       * Amount as floating-point in a string
       */
  var amount: java.lang.String
  /**
       * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
       */
  var currency: java.lang.String
}

