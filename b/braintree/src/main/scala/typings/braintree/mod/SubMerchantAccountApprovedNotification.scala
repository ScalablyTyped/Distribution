package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMerchantAccountApprovedNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  
  @JSName("kind")
  var kind_SubMerchantAccountApprovedNotification: SubMerchantAccountApprovedNotificationKind = js.native
  
  var merchantAccount: MerchantAccount = js.native
}
object SubMerchantAccountApprovedNotification {
  
  @scala.inline
  def apply(
    kind: SubMerchantAccountApprovedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: Date
  ): SubMerchantAccountApprovedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMerchantAccountApprovedNotification]
  }
  
  @scala.inline
  implicit class SubMerchantAccountApprovedNotificationMutableBuilder[Self <: SubMerchantAccountApprovedNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: SubMerchantAccountApprovedNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantAccount(value: MerchantAccount): Self = StObject.set(x, "merchantAccount", value.asInstanceOf[js.Any])
  }
}
