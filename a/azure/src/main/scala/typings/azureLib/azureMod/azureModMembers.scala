package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", JSImport.Namespace)
@js.native
object azureModMembers extends js.Object {
  var RoleEnvironment: RoleEnvironmentInterface = js.native
  def createBlobService(): BlobService = js.native
  def createBlobService(connectionString: java.lang.String): BlobService = js.native
  def createBlobService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): BlobService = js.native
  def createBlobService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): BlobService = js.native
  def createBlobService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): BlobService = js.native
  def createQueueService(): QueueService = js.native
  def createQueueService(connectionString: java.lang.String): QueueService = js.native
  def createQueueService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): QueueService = js.native
  def createQueueService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): QueueService = js.native
  def createQueueService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): QueueService = js.native
  def createServiceBusService(): ServiceBusService = js.native
  def createServiceBusService(connectionString: java.lang.String): ServiceBusService = js.native
  def createServiceBusService(namespace: java.lang.String, accessKey: java.lang.String): ServiceBusService = js.native
  def createServiceBusService(namespace: java.lang.String, accessKey: java.lang.String, issuer: java.lang.String): ServiceBusService = js.native
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String
  ): ServiceBusService = js.native
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: java.lang.String
  ): ServiceBusService = js.native
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): ServiceBusService = js.native
  def createServiceManagementService(subscriptionId: java.lang.String, authentication: java.lang.String, hostOptions: java.lang.String): ServiceManagementService = js.native
  def createSqlManagementService(subscriptionId: java.lang.String, authentication: java.lang.String, hostOptions: java.lang.String): SqlManagementService = js.native
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String
  ): SqlService = js.native
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String
  ): SqlService = js.native
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String,
    acsHost: java.lang.String
  ): SqlService = js.native
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String,
    acsHost: java.lang.String,
    authenticationProvider: java.lang.String
  ): SqlService = js.native
  def createTableService(): TableService = js.native
  def createTableService(connectionString: java.lang.String): TableService = js.native
  def createTableService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): TableService = js.native
  def createTableService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): TableService = js.native
  def createTableService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): TableService = js.native
  def isEmulated(): scala.Boolean = js.native
}

