package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionNotification
  extends StObject
     with BaseWebhookNotification
     with WebhookNotification {
  
  @JSName("kind")
  var kind_TransactionNotification: TransactionNotificationKind
  
  var transaction: Transaction
}
object TransactionNotification {
  
  inline def apply(kind: TransactionNotificationKind, timestamp: Date, transaction: Transaction): TransactionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionNotification]
  }
  
  extension [Self <: TransactionNotification](x: Self) {
    
    inline def setKind(value: TransactionNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
