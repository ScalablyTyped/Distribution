package typings.contractProxyKit.mod

import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionResult extends js.Object {
  
  var hash: String = js.native
  
  var promiEvent: js.UndefOr[js.Object] = js.native
  
  var transactionResponse: js.UndefOr[TransactionResponse] = js.native
}
object TransactionResult {
  
  @scala.inline
  def apply(hash: String): TransactionResult = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResult]
  }
  
  @scala.inline
  implicit class TransactionResultOps[Self <: TransactionResult] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiEvent(value: js.Object): Self = this.set("promiEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromiEvent: Self = this.set("promiEvent", js.undefined)
    
    @scala.inline
    def setTransactionResponse(value: TransactionResponse): Self = this.set("transactionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionResponse: Self = this.set("transactionResponse", js.undefined)
  }
}
