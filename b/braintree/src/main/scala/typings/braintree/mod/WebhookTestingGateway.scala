package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookTestingGateway extends StObject {
  
  def sampleNotification(kind: WebhookNotificationKind, id: String): js.Promise[SampleNotification]
}
object WebhookTestingGateway {
  
  @scala.inline
  def apply(sampleNotification: (WebhookNotificationKind, String) => js.Promise[SampleNotification]): WebhookTestingGateway = {
    val __obj = js.Dynamic.literal(sampleNotification = js.Any.fromFunction2(sampleNotification))
    __obj.asInstanceOf[WebhookTestingGateway]
  }
  
  @scala.inline
  implicit class WebhookTestingGatewayMutableBuilder[Self <: WebhookTestingGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSampleNotification(value: (WebhookNotificationKind, String) => js.Promise[SampleNotification]): Self = StObject.set(x, "sampleNotification", js.Any.fromFunction2(value))
  }
}
