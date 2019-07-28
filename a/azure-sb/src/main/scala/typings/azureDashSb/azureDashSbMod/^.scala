package typings.azureDashSb.azureDashSbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-sb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createNotificationHubService(hubName: String): NotificationHubService = js.native
  def createNotificationHubService(hubName: String, endpointOrConnectionString: String): NotificationHubService = js.native
  def createNotificationHubService(hubName: String, endpointOrConnectionString: String, sharedAccessKeyName: String): NotificationHubService = js.native
  def createNotificationHubService(
    hubName: String,
    endpointOrConnectionString: String,
    sharedAccessKeyName: String,
    sharedAccessKeyValue: String
  ): NotificationHubService = js.native
  def createServiceBusService(
    namespaceOrConnectionString: js.UndefOr[String],
    accessKey: js.UndefOr[String],
    issuer: js.UndefOr[String],
    acsNamespace: js.UndefOr[String],
    host: js.UndefOr[String],
    authenticationProvider: js.UndefOr[js.Object]
  ): ServiceBusService = js.native
  def createWrapService(acsHost: String): WrapService = js.native
  def createWrapService(acsHost: String, issuer: String): WrapService = js.native
  def createWrapService(acsHost: String, issuer: String, accessKey: String): WrapService = js.native
}

