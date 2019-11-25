package typings.coinbase.coinbaseMod

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
  var `type`: String
}

object Fee {
  @scala.inline
  def apply(amount: MoneyHash, `type`: String): Fee = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fee]
  }
}

