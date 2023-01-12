package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisputeNotification
  extends StObject
     with BaseWebhookNotification
     with WebhookNotification {
  
  var dispute: Dispute
  
  @JSName("kind")
  var kind_DisputeNotification: DisputeNotificationKind
}
object DisputeNotification {
  
  inline def apply(dispute: Dispute, kind: DisputeNotificationKind, timestamp: js.Date): DisputeNotification = {
    val __obj = js.Dynamic.literal(dispute = dispute.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisputeNotification] (val x: Self) extends AnyVal {
    
    inline def setDispute(value: Dispute): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
    
    inline def setKind(value: DisputeNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
