package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUpdaterNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  
  var accountUpdaterDailyReport: AccountUpdaterDailyReport = js.native
  
  @JSName("kind")
  var kind_AccountUpdaterNotification: AccountUpdaterNotificationKind = js.native
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
  implicit class AccountUpdaterNotificationOps[Self <: AccountUpdaterNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountUpdaterDailyReport(value: AccountUpdaterDailyReport): Self = this.set("accountUpdaterDailyReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: AccountUpdaterNotificationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
}
