package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionLineItemGateway extends js.Object {
  def findAll(transactionId: String): js.Promise[js.Array[TransactionLineItem]] = js.native
}

object TransactionLineItemGateway {
  @scala.inline
  def apply(findAll: String => js.Promise[js.Array[TransactionLineItem]]): TransactionLineItemGateway = {
    val __obj = js.Dynamic.literal(findAll = js.Any.fromFunction1(findAll))
    __obj.asInstanceOf[TransactionLineItemGateway]
  }
  @scala.inline
  implicit class TransactionLineItemGatewayOps[Self <: TransactionLineItemGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindAll(value: String => js.Promise[js.Array[TransactionLineItem]]): Self = this.set("findAll", js.Any.fromFunction1(value))
  }
  
}

