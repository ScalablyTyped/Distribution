package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTransactionResponse extends StObject {
  
  /**
    * The status of the commit operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
}
object CommitTransactionResponse {
  
  inline def apply(): CommitTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTransactionResponse]
  }
  
  extension [Self <: CommitTransactionResponse](x: Self) {
    
    inline def setTransactionStatus(value: TransactionStatus): Self = StObject.set(x, "transactionStatus", value.asInstanceOf[js.Any])
    
    inline def setTransactionStatusUndefined: Self = StObject.set(x, "transactionStatus", js.undefined)
  }
}
