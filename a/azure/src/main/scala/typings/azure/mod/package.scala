package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def RoleEnvironment: typings.azure.mod.RoleEnvironmentInterface = typings.azure.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RoleEnvironment").asInstanceOf[typings.azure.mod.RoleEnvironmentInterface]
inline def RoleEnvironment_=(x: typings.azure.mod.RoleEnvironmentInterface): scala.Unit = typings.azure.mod.^.asInstanceOf[js.Dynamic].updateDynamic("RoleEnvironment")(x.asInstanceOf[js.Any])

inline def createBlobService(): typings.azure.mod.BlobService = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")().asInstanceOf[typings.azure.mod.BlobService]
inline def createBlobService(connectionString: java.lang.String): typings.azure.mod.BlobService = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typings.azure.mod.BlobService]
inline def createBlobService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): typings.azure.mod.BlobService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.BlobService]
inline def createBlobService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): typings.azure.mod.BlobService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.BlobService]
inline def createBlobService(
  storageAccount: java.lang.String,
  storageAccessKey: java.lang.String,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.BlobService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.BlobService]
inline def createBlobService(
  storageAccount: java.lang.String,
  storageAccessKey: java.lang.String,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.BlobService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.BlobService]

inline def createQueueService(): typings.azure.mod.QueueService = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")().asInstanceOf[typings.azure.mod.QueueService]
inline def createQueueService(connectionString: java.lang.String): typings.azure.mod.QueueService = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typings.azure.mod.QueueService]
inline def createQueueService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): typings.azure.mod.QueueService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.QueueService]
inline def createQueueService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): typings.azure.mod.QueueService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.QueueService]
inline def createQueueService(
  storageAccount: java.lang.String,
  storageAccessKey: java.lang.String,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.QueueService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.QueueService]
inline def createQueueService(
  storageAccount: java.lang.String,
  storageAccessKey: java.lang.String,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.QueueService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.QueueService]

inline def createServiceBusService(): typings.azure.mod.ServiceBusService = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")().asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(connectionString: java.lang.String): typings.azure.mod.ServiceBusService = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(namespace: java.lang.String, accessKey: java.lang.String): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(namespace: java.lang.String, accessKey: java.lang.String, issuer: java.lang.String): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: java.lang.String,
  acsNamespace: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: java.lang.String,
  acsNamespace: java.lang.String,
  host: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: java.lang.String,
  acsNamespace: java.lang.String,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: java.lang.String,
  acsNamespace: java.lang.String,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: java.lang.String,
  acsNamespace: scala.Unit,
  host: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: java.lang.String,
  acsNamespace: scala.Unit,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: java.lang.String,
  acsNamespace: scala.Unit,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: scala.Unit,
  acsNamespace: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: scala.Unit,
  acsNamespace: java.lang.String,
  host: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: scala.Unit,
  acsNamespace: java.lang.String,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: scala.Unit,
  acsNamespace: java.lang.String,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: scala.Unit,
  acsNamespace: scala.Unit,
  host: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: scala.Unit,
  acsNamespace: scala.Unit,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: java.lang.String,
  issuer: scala.Unit,
  acsNamespace: scala.Unit,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(namespace: java.lang.String, accessKey: scala.Unit, issuer: java.lang.String): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: java.lang.String,
  acsNamespace: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: java.lang.String,
  acsNamespace: java.lang.String,
  host: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: java.lang.String,
  acsNamespace: java.lang.String,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: java.lang.String,
  acsNamespace: java.lang.String,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: java.lang.String,
  acsNamespace: scala.Unit,
  host: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: java.lang.String,
  acsNamespace: scala.Unit,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: java.lang.String,
  acsNamespace: scala.Unit,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: scala.Unit,
  acsNamespace: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: scala.Unit,
  acsNamespace: java.lang.String,
  host: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: scala.Unit,
  acsNamespace: java.lang.String,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: scala.Unit,
  acsNamespace: java.lang.String,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: scala.Unit,
  acsNamespace: scala.Unit,
  host: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: scala.Unit,
  acsNamespace: scala.Unit,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]
inline def createServiceBusService(
  namespace: java.lang.String,
  accessKey: scala.Unit,
  issuer: scala.Unit,
  acsNamespace: scala.Unit,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.ServiceBusService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceBusService]

inline def createServiceManagementService(subscriptionId: java.lang.String, authentication: java.lang.String, hostOptions: java.lang.String): typings.azure.mod.ServiceManagementService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceManagementService")(subscriptionId.asInstanceOf[js.Any], authentication.asInstanceOf[js.Any], hostOptions.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.ServiceManagementService]

inline def createSqlManagementService(subscriptionId: java.lang.String, authentication: java.lang.String, hostOptions: java.lang.String): typings.azure.mod.SqlManagementService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlManagementService")(subscriptionId.asInstanceOf[js.Any], authentication.asInstanceOf[js.Any], hostOptions.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlManagementService]

inline def createSqlService(
  serverName: java.lang.String,
  administratorLogin: java.lang.String,
  administratorLoginPassword: java.lang.String
): typings.azure.mod.SqlService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlService]
inline def createSqlService(
  serverName: java.lang.String,
  administratorLogin: java.lang.String,
  administratorLoginPassword: java.lang.String,
  host: java.lang.String
): typings.azure.mod.SqlService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlService]
inline def createSqlService(
  serverName: java.lang.String,
  administratorLogin: java.lang.String,
  administratorLoginPassword: java.lang.String,
  host: java.lang.String,
  acsHost: java.lang.String
): typings.azure.mod.SqlService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlService]
inline def createSqlService(
  serverName: java.lang.String,
  administratorLogin: java.lang.String,
  administratorLoginPassword: java.lang.String,
  host: java.lang.String,
  acsHost: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.SqlService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlService]
inline def createSqlService(
  serverName: java.lang.String,
  administratorLogin: java.lang.String,
  administratorLoginPassword: java.lang.String,
  host: java.lang.String,
  acsHost: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.SqlService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlService]
inline def createSqlService(
  serverName: java.lang.String,
  administratorLogin: java.lang.String,
  administratorLoginPassword: java.lang.String,
  host: scala.Unit,
  acsHost: java.lang.String
): typings.azure.mod.SqlService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlService]
inline def createSqlService(
  serverName: java.lang.String,
  administratorLogin: java.lang.String,
  administratorLoginPassword: java.lang.String,
  host: scala.Unit,
  acsHost: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.SqlService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlService]
inline def createSqlService(
  serverName: java.lang.String,
  administratorLogin: java.lang.String,
  administratorLoginPassword: java.lang.String,
  host: scala.Unit,
  acsHost: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.SqlService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.SqlService]

inline def createTableService(): typings.azure.mod.TableService = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")().asInstanceOf[typings.azure.mod.TableService]
inline def createTableService(connectionString: java.lang.String): typings.azure.mod.TableService = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typings.azure.mod.TableService]
inline def createTableService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): typings.azure.mod.TableService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.TableService]
inline def createTableService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): typings.azure.mod.TableService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.TableService]
inline def createTableService(
  storageAccount: java.lang.String,
  storageAccessKey: java.lang.String,
  host: java.lang.String,
  authenticationProvider: java.lang.String
): typings.azure.mod.TableService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.TableService]
inline def createTableService(
  storageAccount: java.lang.String,
  storageAccessKey: java.lang.String,
  host: scala.Unit,
  authenticationProvider: java.lang.String
): typings.azure.mod.TableService = (typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typings.azure.mod.TableService]

inline def isEmulated(): scala.Boolean = typings.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isEmulated")().asInstanceOf[scala.Boolean]

type CreateTableIfNotExistsCallback = js.Function3[
/* error */ typings.std.Error, 
/* created */ scala.Boolean, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type DeleteEntityCallback = js.Function3[
/* error */ typings.std.Error, 
/* successful */ scala.Boolean, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type DeleteTableCallback = js.Function3[
/* error */ typings.std.Error, 
/* successful */ scala.Boolean, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]

type ErrorCallback = js.Function1[/* error */ typings.std.Error, scala.Unit]

type GetBlobToTextCallback = js.Function4[
/* err */ typings.std.Error, 
/* text */ java.lang.String, 
/* result */ typings.azure.mod.BlobResult, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type ListBlobsCallback = js.Function4[
/* err */ typings.std.Error, 
/* blobs */ js.Array[typings.azure.mod.BlobResult], 
/* continuationToken */ typings.azure.mod.ContinuationToken, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type ListContainersCallback = js.Function4[
/* err */ typings.std.Error, 
/* containers */ js.Array[typings.azure.mod.ContainerResult], 
/* continuationToken */ typings.azure.mod.ContinuationToken, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type ListQueuesCallback = js.Function4[
/* err */ typings.std.Error, 
/* queues */ js.Array[typings.azure.mod.QueueResult], 
/* continuationToken */ typings.azure.mod.ContinuationToken, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type ModifyEntityCallback = js.Function3[
/* error */ typings.std.Error, 
/* entity */ typings.azure.mod.Entity, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type QueryEntitiesCallback = js.Function4[
/* error */ typings.std.Error, 
/* entities */ js.Array[typings.azure.mod.Entity], 
/* resultContinuation */ typings.azure.mod.QueryEntitiesResultContinuation, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type QueryEntityCallback = js.Function3[
/* error */ typings.std.Error, 
/* entity */ typings.azure.mod.Entity, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type QueryTablesCallback = js.Function4[
/* error */ typings.std.Error, 
/* queryTablesResult */ js.Array[typings.azure.mod.TableResult], 
/* resultsContinuation */ typings.azure.mod.QueryResultContinuation, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type SimpleCallback[T] = js.Function2[/* error */ typings.std.Error, /* result */ T, scala.Unit]

type StorageCallback[T] = js.Function3[
/* err */ typings.std.Error, 
/* result */ T, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type StorageCallbackVoid = js.Function2[
/* err */ typings.std.Error, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type StorageMetadata = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type StorageServicePropertiesCallback = typings.azure.mod.StorageCallback[typings.azure.mod.StorageServiceProperties]

type StorageServiceStatsCallback = typings.azure.mod.StorageCallback[typings.azure.mod.StorageServiceStats]

type TableRequestCallback = js.Function3[
/* error */ typings.std.Error, 
/* tableResult */ typings.azure.anon.TableName, 
/* response */ typings.azure.mod.WebResponse, 
scala.Unit]

type ValidatorFunction = js.Function1[/* userSettings */ typings.azure.mod.Dictionary[js.Any], js.Any]
