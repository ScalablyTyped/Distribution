package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackTransactionResponse extends StObject {
  
  /**
    * The status of the rollback operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
}
object RollbackTransactionResponse {
  
  @scala.inline
  def apply(): RollbackTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackTransactionResponse]
  }
  
  @scala.inline
  implicit class RollbackTransactionResponseMutableBuilder[Self <: RollbackTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionStatus(value: TransactionStatus): Self = StObject.set(x, "transactionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionStatusUndefined: Self = StObject.set(x, "transactionStatus", js.undefined)
  }
}
