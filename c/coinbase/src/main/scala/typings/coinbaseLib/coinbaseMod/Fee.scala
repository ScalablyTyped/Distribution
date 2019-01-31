package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fee extends js.Object {
  /**
    * Amount associated to this fee
    */
  var amount: MoneyHash
  /**
    * Fee beneficiary ("bank", "coinbase", ...)
    */
  var `type`: java.lang.String
}

