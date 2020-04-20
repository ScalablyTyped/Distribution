package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionLineItemGateway extends js.Object {
  def findAll(transactionId: String): js.Promise[js.Array[TransactionLineItem]]
}

object TransactionLineItemGateway {
  @scala.inline
  def apply(findAll: String => js.Promise[js.Array[TransactionLineItem]]): TransactionLineItemGateway = {
    val __obj = js.Dynamic.literal(findAll = js.Any.fromFunction1(findAll))
    __obj.asInstanceOf[TransactionLineItemGateway]
  }
}

