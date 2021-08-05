package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionStatusHistory extends StObject {
  
  var amount: String
  
  var status: TransactionStatus
  
  var timestamp: Date
  
  var transactionsource: TransactionSource
  
  var user: String
}
object TransactionStatusHistory {
  
  inline def apply(
    amount: String,
    status: TransactionStatus,
    timestamp: Date,
    transactionsource: TransactionSource,
    user: String
  ): TransactionStatusHistory = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactionsource = transactionsource.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionStatusHistory]
  }
  
  extension [Self <: TransactionStatusHistory](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TransactionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTransactionsource(value: TransactionSource): Self = StObject.set(x, "transactionsource", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
