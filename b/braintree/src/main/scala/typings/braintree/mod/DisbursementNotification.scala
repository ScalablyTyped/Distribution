package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisbursementNotification
  extends StObject
     with BaseWebhookNotification
     with WebhookNotification {
  
  var disbursement: Disbursement
  
  @JSName("kind")
  var kind_DisbursementNotification: DisbursementNotificationKind
}
object DisbursementNotification {
  
  inline def apply(disbursement: Disbursement, kind: DisbursementNotificationKind, timestamp: js.Date): DisbursementNotification = {
    val __obj = js.Dynamic.literal(disbursement = disbursement.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisbursementNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisbursementNotification] (val x: Self) extends AnyVal {
    
    inline def setDisbursement(value: Disbursement): Self = StObject.set(x, "disbursement", value.asInstanceOf[js.Any])
    
    inline def setKind(value: DisbursementNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
