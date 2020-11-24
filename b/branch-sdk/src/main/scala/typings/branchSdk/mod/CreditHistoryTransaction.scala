package typings.branchSdk.mod

import typings.branchSdk.anon.Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreditHistoryTransaction extends js.Object {
  
  var referree: String = js.native
  
  var referrer: String = js.native
  
  var transaction: Amount = js.native
}
object CreditHistoryTransaction {
  
  @scala.inline
  def apply(referree: String, referrer: String, transaction: Amount): CreditHistoryTransaction = {
    val __obj = js.Dynamic.literal(referree = referree.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditHistoryTransaction]
  }
  
  @scala.inline
  implicit class CreditHistoryTransactionOps[Self <: CreditHistoryTransaction] (val x: Self) extends AnyVal {
    
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
    def setReferree(value: String): Self = this.set("referree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction(value: Amount): Self = this.set("transaction", value.asInstanceOf[js.Any])
  }
}
