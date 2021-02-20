package typings.braintree.mod

import typings.braintree.anon.CustomerId
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  
  @JSName("kind")
  var kind_PaymentMethodNotification: PaymentMethodNotificationKind = js.native
  
  var revokedPaymentMethodMetadata: CustomerId = js.native
}
object PaymentMethodNotification {
  
  @scala.inline
  def apply(kind: PaymentMethodNotificationKind, revokedPaymentMethodMetadata: CustomerId, timestamp: Date): PaymentMethodNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodNotification]
  }
  
  @scala.inline
  implicit class PaymentMethodNotificationMutableBuilder[Self <: PaymentMethodNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: PaymentMethodNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokedPaymentMethodMetadata(value: CustomerId): Self = StObject.set(x, "revokedPaymentMethodMetadata", value.asInstanceOf[js.Any])
  }
}
