package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTransactionResult extends StObject {
  
  /**
    * The transaction ID of the started transaction.
    */
  var TransactionId: js.UndefOr[typings.awsSdk.qldbsessionMod.TransactionId] = js.undefined
}
object StartTransactionResult {
  
  inline def apply(): StartTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTransactionResult]
  }
  
  extension [Self <: StartTransactionResult](x: Self) {
    
    inline def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
