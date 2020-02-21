package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUpdaterNotification
  extends BaseWebhookNotification
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
}

