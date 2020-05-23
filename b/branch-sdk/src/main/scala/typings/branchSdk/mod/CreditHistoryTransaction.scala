package typings.branchSdk.mod

import typings.branchSdk.anon.Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditHistoryTransaction extends js.Object {
  var referree: String
  var referrer: String
  var transaction: Amount
}

object CreditHistoryTransaction {
  @scala.inline
  def apply(referree: String, referrer: String, transaction: Amount): CreditHistoryTransaction = {
    val __obj = js.Dynamic.literal(referree = referree.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditHistoryTransaction]
  }
}

