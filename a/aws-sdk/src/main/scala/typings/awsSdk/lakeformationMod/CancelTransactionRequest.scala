package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTransactionRequest extends StObject {
  
  /**
    * The transaction to cancel.
    */
  var TransactionId: TransactionIdString
}
object CancelTransactionRequest {
  
  inline def apply(TransactionId: TransactionIdString): CancelTransactionRequest = {
    val __obj = js.Dynamic.literal(TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTransactionRequest]
  }
  
  extension [Self <: CancelTransactionRequest](x: Self) {
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
