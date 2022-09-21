package typings.azureSb.mod

import typings.azureSb.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createNotificationHubService(hubName: String): NotificationHubService = ^.asInstanceOf[js.Dynamic].applyDynamic("createNotificationHubService")(hubName.asInstanceOf[js.Any]).asInstanceOf[NotificationHubService]
inline def createNotificationHubService(hubName: String, endpointOrConnectionString: String): NotificationHubService = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotificationHubService")(hubName.asInstanceOf[js.Any], endpointOrConnectionString.asInstanceOf[js.Any])).asInstanceOf[NotificationHubService]
inline def createNotificationHubService(hubName: String, endpointOrConnectionString: String, sharedAccessKeyName: String): NotificationHubService = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotificationHubService")(hubName.asInstanceOf[js.Any], endpointOrConnectionString.asInstanceOf[js.Any], sharedAccessKeyName.asInstanceOf[js.Any])).asInstanceOf[NotificationHubService]
inline def createNotificationHubService(
  hubName: String,
  endpointOrConnectionString: String,
  sharedAccessKeyName: String,
  sharedAccessKeyValue: String
): NotificationHubService = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotificationHubService")(hubName.asInstanceOf[js.Any], endpointOrConnectionString.asInstanceOf[js.Any], sharedAccessKeyName.asInstanceOf[js.Any], sharedAccessKeyValue.asInstanceOf[js.Any])).asInstanceOf[NotificationHubService]
inline def createNotificationHubService(
  hubName: String,
  endpointOrConnectionString: String,
  sharedAccessKeyName: Unit,
  sharedAccessKeyValue: String
): NotificationHubService = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotificationHubService")(hubName.asInstanceOf[js.Any], endpointOrConnectionString.asInstanceOf[js.Any], sharedAccessKeyName.asInstanceOf[js.Any], sharedAccessKeyValue.asInstanceOf[js.Any])).asInstanceOf[NotificationHubService]
inline def createNotificationHubService(hubName: String, endpointOrConnectionString: Unit, sharedAccessKeyName: String): NotificationHubService = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotificationHubService")(hubName.asInstanceOf[js.Any], endpointOrConnectionString.asInstanceOf[js.Any], sharedAccessKeyName.asInstanceOf[js.Any])).asInstanceOf[NotificationHubService]
inline def createNotificationHubService(
  hubName: String,
  endpointOrConnectionString: Unit,
  sharedAccessKeyName: String,
  sharedAccessKeyValue: String
): NotificationHubService = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotificationHubService")(hubName.asInstanceOf[js.Any], endpointOrConnectionString.asInstanceOf[js.Any], sharedAccessKeyName.asInstanceOf[js.Any], sharedAccessKeyValue.asInstanceOf[js.Any])).asInstanceOf[NotificationHubService]
inline def createNotificationHubService(
  hubName: String,
  endpointOrConnectionString: Unit,
  sharedAccessKeyName: Unit,
  sharedAccessKeyValue: String
): NotificationHubService = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotificationHubService")(hubName.asInstanceOf[js.Any], endpointOrConnectionString.asInstanceOf[js.Any], sharedAccessKeyName.asInstanceOf[js.Any], sharedAccessKeyValue.asInstanceOf[js.Any])).asInstanceOf[NotificationHubService]

inline def createServiceBusService(
  namespaceOrConnectionString: js.UndefOr[String],
  accessKey: js.UndefOr[String],
  issuer: js.UndefOr[String],
  acsNamespace: js.UndefOr[String],
  host: js.UndefOr[String],
  authenticationProvider: js.UndefOr[js.Object]
): ServiceBusService = (^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespaceOrConnectionString.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[ServiceBusService]

inline def createWrapService(acsHost: String): WrapService = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrapService")(acsHost.asInstanceOf[js.Any]).asInstanceOf[WrapService]
inline def createWrapService(acsHost: String, issuer: String): WrapService = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrapService")(acsHost.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[WrapService]
inline def createWrapService(acsHost: String, issuer: String, accessKey: String): WrapService = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrapService")(acsHost.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any])).asInstanceOf[WrapService]
inline def createWrapService(acsHost: String, issuer: Unit, accessKey: String): WrapService = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrapService")(acsHost.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any])).asInstanceOf[WrapService]
