package typings.azureSb.mod

import typings.azureSb.notificationhubserviceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-sb", "NotificationHubService")
@js.native
class NotificationHubService protected () extends ^ {
  def this(
    hubName: String,
    endpointOrConnectionString: String,
    sharedAccessKeyName: String,
    sharedAccessKeyValue: String
  ) = this()
}

