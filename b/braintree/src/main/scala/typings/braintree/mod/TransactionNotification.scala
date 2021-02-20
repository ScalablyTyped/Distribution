package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  
  @JSName("kind")
  var kind_TransactionNotification: TransactionNotificationKind = js.native
  
  var transaction: Transaction = js.native
}
object TransactionNotification {
  
  @scala.inline
  def apply(kind: TransactionNotificationKind, timestamp: Date, transaction: Transaction): TransactionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionNotification]
  }
  
  @scala.inline
  implicit class TransactionNotificationMutableBuilder[Self <: TransactionNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: TransactionNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
