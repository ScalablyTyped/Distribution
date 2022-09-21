package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTransactionRequest extends StObject {
  
  /**
    * Indicates whether this transaction should be read only or read and write. Writes made using a read-only transaction ID will be rejected. Read-only transactions do not need to be committed. 
    */
  var TransactionType: js.UndefOr[typings.awsSdk.lakeformationMod.TransactionType] = js.undefined
}
object StartTransactionRequest {
  
  inline def apply(): StartTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTransactionRequest]
  }
  
  extension [Self <: StartTransactionRequest](x: Self) {
    
    inline def setTransactionType(value: TransactionType): Self = StObject.set(x, "TransactionType", value.asInstanceOf[js.Any])
    
    inline def setTransactionTypeUndefined: Self = StObject.set(x, "TransactionType", js.undefined)
  }
}
