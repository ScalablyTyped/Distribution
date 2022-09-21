package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTransactionResponse extends StObject {
  
  /**
    * An opaque identifier for the transaction.
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
}
object StartTransactionResponse {
  
  inline def apply(): StartTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTransactionResponse]
  }
  
  extension [Self <: StartTransactionResponse](x: Self) {
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
