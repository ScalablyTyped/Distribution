package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountUpdaterNotification
  extends StObject
     with BaseWebhookNotification
     with WebhookNotification {
  
  var accountUpdaterDailyReport: AccountUpdaterDailyReport
  
  @JSName("kind")
  var kind_AccountUpdaterNotification: AccountUpdaterNotificationKind
}
object AccountUpdaterNotification {
  
  inline def apply(
    accountUpdaterDailyReport: AccountUpdaterDailyReport,
    kind: AccountUpdaterNotificationKind,
    timestamp: js.Date
  ): AccountUpdaterNotification = {
    val __obj = js.Dynamic.literal(accountUpdaterDailyReport = accountUpdaterDailyReport.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUpdaterNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountUpdaterNotification] (val x: Self) extends AnyVal {
    
    inline def setAccountUpdaterDailyReport(value: AccountUpdaterDailyReport): Self = StObject.set(x, "accountUpdaterDailyReport", value.asInstanceOf[js.Any])
    
    inline def setKind(value: AccountUpdaterNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
