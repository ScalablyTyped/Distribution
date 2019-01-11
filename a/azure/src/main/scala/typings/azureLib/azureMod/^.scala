package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var RoleEnvironment: azureLib.azureMod.RoleEnvironmentInterface = js.native
  def createBlobService(): azureLib.azureMod.BlobService = js.native
  def createBlobService(connectionString: java.lang.String): azureLib.azureMod.BlobService = js.native
  def createBlobService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): azureLib.azureMod.BlobService = js.native
  def createBlobService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): azureLib.azureMod.BlobService = js.native
  def createBlobService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): azureLib.azureMod.BlobService = js.native
  def createQueueService(): azureLib.azureMod.QueueService = js.native
  def createQueueService(connectionString: java.lang.String): azureLib.azureMod.QueueService = js.native
  def createQueueService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): azureLib.azureMod.QueueService = js.native
  def createQueueService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): azureLib.azureMod.QueueService = js.native
  def createQueueService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): azureLib.azureMod.QueueService = js.native
  def createServiceBusService(): azureLib.azureMod.ServiceBusService = js.native
  def createServiceBusService(connectionString: java.lang.String): azureLib.azureMod.ServiceBusService = js.native
  def createServiceBusService(namespace: java.lang.String, accessKey: java.lang.String): azureLib.azureMod.ServiceBusService = js.native
  def createServiceBusService(namespace: java.lang.String, accessKey: java.lang.String, issuer: java.lang.String): azureLib.azureMod.ServiceBusService = js.native
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String
  ): azureLib.azureMod.ServiceBusService = js.native
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: java.lang.String
  ): azureLib.azureMod.ServiceBusService = js.native
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): azureLib.azureMod.ServiceBusService = js.native
  def createServiceManagementService(subscriptionId: java.lang.String, authentication: java.lang.String, hostOptions: java.lang.String): azureLib.azureMod.ServiceManagementService = js.native
  def createSqlManagementService(subscriptionId: java.lang.String, authentication: java.lang.String, hostOptions: java.lang.String): azureLib.azureMod.SqlManagementService = js.native
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String
  ): azureLib.azureMod.SqlService = js.native
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String
  ): azureLib.azureMod.SqlService = js.native
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String,
    acsHost: java.lang.String
  ): azureLib.azureMod.SqlService = js.native
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String,
    acsHost: java.lang.String,
    authenticationProvider: java.lang.String
  ): azureLib.azureMod.SqlService = js.native
  def createTableService(): azureLib.azureMod.TableService = js.native
  def createTableService(connectionString: java.lang.String): azureLib.azureMod.TableService = js.native
  def createTableService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): azureLib.azureMod.TableService = js.native
  def createTableService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): azureLib.azureMod.TableService = js.native
  def createTableService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): azureLib.azureMod.TableService = js.native
  def isEmulated(): scala.Boolean = js.native
}

