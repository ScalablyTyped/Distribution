package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisputeNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  
  var dispute: Dispute = js.native
  
  @JSName("kind")
  var kind_DisputeNotification: DisputeNotificationKind = js.native
}
object DisputeNotification {
  
  @scala.inline
  def apply(dispute: Dispute, kind: DisputeNotificationKind, timestamp: Date): DisputeNotification = {
    val __obj = js.Dynamic.literal(dispute = dispute.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeNotification]
  }
  
  @scala.inline
  implicit class DisputeNotificationMutableBuilder[Self <: DisputeNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispute(value: Dispute): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: DisputeNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
