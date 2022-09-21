package typings.braintree.mod

import typings.braintree.anon.CustomerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodNotification
  extends StObject
     with BaseWebhookNotification
     with WebhookNotification {
  
  @JSName("kind")
  var kind_PaymentMethodNotification: PaymentMethodNotificationKind
  
  var revokedPaymentMethodMetadata: CustomerId
}
object PaymentMethodNotification {
  
  inline def apply(kind: PaymentMethodNotificationKind, revokedPaymentMethodMetadata: CustomerId, timestamp: js.Date): PaymentMethodNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodNotification]
  }
  
  extension [Self <: PaymentMethodNotification](x: Self) {
    
    inline def setKind(value: PaymentMethodNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setRevokedPaymentMethodMetadata(value: CustomerId): Self = StObject.set(x, "revokedPaymentMethodMetadata", value.asInstanceOf[js.Any])
  }
}
