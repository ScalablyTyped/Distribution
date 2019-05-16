package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionStatusHistory extends js.Object {
  var amount: java.lang.String
  var status: TransactionStatus
  var timestamp: stdLib.Date
  var transactionsource: TransactionSource
  var user: java.lang.String
}

object TransactionStatusHistory {
  @scala.inline
  def apply(
    amount: java.lang.String,
    status: TransactionStatus,
    timestamp: stdLib.Date,
    transactionsource: TransactionSource,
    user: java.lang.String
  ): TransactionStatusHistory = {
    val __obj = js.Dynamic.literal(amount = amount, status = status, timestamp = timestamp, transactionsource = transactionsource, user = user)
  
    __obj.asInstanceOf[TransactionStatusHistory]
  }
}

