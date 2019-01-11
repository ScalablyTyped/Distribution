package typings
package azureDashSbLib.azureDashSbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-sb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createNotificationHubService(hubName: java.lang.String): azureDashSbLib.azureDashSbMod.NotificationHubService = js.native
  def createNotificationHubService(hubName: java.lang.String, endpointOrConnectionString: java.lang.String): azureDashSbLib.azureDashSbMod.NotificationHubService = js.native
  def createNotificationHubService(
    hubName: java.lang.String,
    endpointOrConnectionString: java.lang.String,
    sharedAccessKeyName: java.lang.String
  ): azureDashSbLib.azureDashSbMod.NotificationHubService = js.native
  def createNotificationHubService(
    hubName: java.lang.String,
    endpointOrConnectionString: java.lang.String,
    sharedAccessKeyName: java.lang.String,
    sharedAccessKeyValue: java.lang.String
  ): azureDashSbLib.azureDashSbMod.NotificationHubService = js.native
  def createServiceBusService(
    namespaceOrConnectionString: js.UndefOr[java.lang.String],
    accessKey: js.UndefOr[java.lang.String],
    issuer: js.UndefOr[java.lang.String],
    acsNamespace: js.UndefOr[java.lang.String],
    host: js.UndefOr[java.lang.String],
    authenticationProvider: js.UndefOr[js.Object]
  ): azureDashSbLib.azureDashSbMod.ServiceBusService = js.native
  def createWrapService(acsHost: java.lang.String): azureDashSbLib.azureDashSbMod.WrapService = js.native
  def createWrapService(acsHost: java.lang.String, issuer: java.lang.String): azureDashSbLib.azureDashSbMod.WrapService = js.native
  def createWrapService(acsHost: java.lang.String, issuer: java.lang.String, accessKey: java.lang.String): azureDashSbLib.azureDashSbMod.WrapService = js.native
}

