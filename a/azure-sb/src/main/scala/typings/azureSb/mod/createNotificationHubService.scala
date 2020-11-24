package typings.azureSb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure-sb", "createNotificationHubService")
@js.native
object createNotificationHubService extends js.Object {
  
  def apply(hubName: String): NotificationHubService = js.native
  def apply(
    hubName: String,
    endpointOrConnectionString: js.UndefOr[scala.Nothing],
    sharedAccessKeyName: js.UndefOr[scala.Nothing],
    sharedAccessKeyValue: String
  ): NotificationHubService = js.native
  def apply(
    hubName: String,
    endpointOrConnectionString: js.UndefOr[scala.Nothing],
    sharedAccessKeyName: String
  ): NotificationHubService = js.native
  def apply(
    hubName: String,
    endpointOrConnectionString: js.UndefOr[scala.Nothing],
    sharedAccessKeyName: String,
    sharedAccessKeyValue: String
  ): NotificationHubService = js.native
  def apply(hubName: String, endpointOrConnectionString: String): NotificationHubService = js.native
  def apply(
    hubName: String,
    endpointOrConnectionString: String,
    sharedAccessKeyName: js.UndefOr[scala.Nothing],
    sharedAccessKeyValue: String
  ): NotificationHubService = js.native
  def apply(hubName: String, endpointOrConnectionString: String, sharedAccessKeyName: String): NotificationHubService = js.native
  def apply(
    hubName: String,
    endpointOrConnectionString: String,
    sharedAccessKeyName: String,
    sharedAccessKeyValue: String
  ): NotificationHubService = js.native
}
