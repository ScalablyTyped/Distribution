package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "StorageServiceSettings")
@js.native
class StorageServiceSettings protected () extends js.Object {
  def this(
    name: String,
    key: String,
    blobEndpointUri: String,
    queueEndpointUri: String,
    tableEndpointUri: String,
    usePathStyleUri: Boolean
  ) = this()
  var _blobEndpointUri: String = js.native
  var _key: String = js.native
  var _name: String = js.native
  var _queueEndpointUri: String = js.native
  var _tableEndpointUri: String = js.native
  var _usePathStyleUri: Boolean = js.native
}

/* static members */
@JSImport("azure", "StorageServiceSettings")
@js.native
object StorageServiceSettings extends js.Object {
  /**
    * Creates StorageServiceSettings object given endpoints uri.
    */
  def _createStorageServiceSettings(
    settings: Dictionary[String],
    blobEndpointUri: String,
    queueEndpointUri: String,
    tableEndpointUri: String
  ): StorageServiceSettings = js.native
  /**
    * Gets the default service endpoint using the specified protocol and account
    * name.
    */
  def _getDefaultServiceEndpoint(settings: Dictionary[String], dns: String): String = js.native
  /**
    * Returns a StorageServiceSettings with development storage credentials using
    * the specified proxy Uri.
    */
  def _getDevelopmentStorageAccount(): StorageServiceSettings = js.native
  def _getDevelopmentStorageAccount(proxy: String): StorageServiceSettings = js.native
  def createExplicitlyOrFromEnvironment(storageAccount: String, storageAccessKey: String, host: String): StorageServiceSettings = js.native
  def createFromConfig(config: js.Any): StorageServiceSettings = js.native
  /**
    * Creates a StorageServiceSettings object from the given connection string.
    */
  def createFromConnectionString(connectionString: String): StorageServiceSettings = js.native
  /**
    * Creates a ServiceBusSettings object from a set of settings.
    */
  def createFromSettings(settings: Dictionary[String]): StorageServiceSettings = js.native
  def customizeConfig(config: js.Any): Unit = js.native
  /**
    * Gets a StorageServiceSettings object that references the development storage
    * account.
    */
  def getDevelopmentStorageAccountSettings(): StorageServiceSettings = js.native
  def isDevelopmentStorage(storageAccount: String, storageAccessKey: String, parsedHost: String): Boolean = js.native
}

