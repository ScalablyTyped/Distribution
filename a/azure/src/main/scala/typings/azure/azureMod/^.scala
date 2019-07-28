package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var RoleEnvironment: RoleEnvironmentInterface = js.native
  def createBlobService(): BlobService = js.native
  def createBlobService(connectionString: String): BlobService = js.native
  def createBlobService(storageAccount: String, storageAccessKey: String): BlobService = js.native
  def createBlobService(storageAccount: String, storageAccessKey: String, host: String): BlobService = js.native
  def createBlobService(storageAccount: String, storageAccessKey: String, host: String, authenticationProvider: String): BlobService = js.native
  def createQueueService(): QueueService = js.native
  def createQueueService(connectionString: String): QueueService = js.native
  def createQueueService(storageAccount: String, storageAccessKey: String): QueueService = js.native
  def createQueueService(storageAccount: String, storageAccessKey: String, host: String): QueueService = js.native
  def createQueueService(storageAccount: String, storageAccessKey: String, host: String, authenticationProvider: String): QueueService = js.native
  def createServiceBusService(): ServiceBusService = js.native
  def createServiceBusService(connectionString: String): ServiceBusService = js.native
  def createServiceBusService(namespace: String, accessKey: String): ServiceBusService = js.native
  def createServiceBusService(namespace: String, accessKey: String, issuer: String): ServiceBusService = js.native
  def createServiceBusService(namespace: String, accessKey: String, issuer: String, acsNamespace: String): ServiceBusService = js.native
  def createServiceBusService(namespace: String, accessKey: String, issuer: String, acsNamespace: String, host: String): ServiceBusService = js.native
  def createServiceBusService(
    namespace: String,
    accessKey: String,
    issuer: String,
    acsNamespace: String,
    host: String,
    authenticationProvider: String
  ): ServiceBusService = js.native
  def createServiceManagementService(subscriptionId: String, authentication: String, hostOptions: String): ServiceManagementService = js.native
  def createSqlManagementService(subscriptionId: String, authentication: String, hostOptions: String): SqlManagementService = js.native
  def createSqlService(serverName: String, administratorLogin: String, administratorLoginPassword: String): SqlService = js.native
  def createSqlService(serverName: String, administratorLogin: String, administratorLoginPassword: String, host: String): SqlService = js.native
  def createSqlService(
    serverName: String,
    administratorLogin: String,
    administratorLoginPassword: String,
    host: String,
    acsHost: String
  ): SqlService = js.native
  def createSqlService(
    serverName: String,
    administratorLogin: String,
    administratorLoginPassword: String,
    host: String,
    acsHost: String,
    authenticationProvider: String
  ): SqlService = js.native
  def createTableService(): TableService = js.native
  def createTableService(connectionString: String): TableService = js.native
  def createTableService(storageAccount: String, storageAccessKey: String): TableService = js.native
  def createTableService(storageAccount: String, storageAccessKey: String, host: String): TableService = js.native
  def createTableService(storageAccount: String, storageAccessKey: String, host: String, authenticationProvider: String): TableService = js.native
  def isEmulated(): Boolean = js.native
}

