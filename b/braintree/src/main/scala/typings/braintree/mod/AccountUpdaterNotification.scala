package typings.braintree.mod

import typings.std.Date
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
  
  @scala.inline
  def apply(
    accountUpdaterDailyReport: AccountUpdaterDailyReport,
    kind: AccountUpdaterNotificationKind,
    timestamp: Date
  ): AccountUpdaterNotification = {
    val __obj = js.Dynamic.literal(accountUpdaterDailyReport = accountUpdaterDailyReport.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUpdaterNotification]
  }
  
  @scala.inline
  implicit class AccountUpdaterNotificationMutableBuilder[Self <: AccountUpdaterNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountUpdaterDailyReport(value: AccountUpdaterDailyReport): Self = StObject.set(x, "accountUpdaterDailyReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: AccountUpdaterNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
