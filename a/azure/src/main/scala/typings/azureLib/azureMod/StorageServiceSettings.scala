package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "StorageServiceSettings")
@js.native
class StorageServiceSettings protected () extends js.Object {
  def this(name: java.lang.String, key: java.lang.String, blobEndpointUri: java.lang.String, queueEndpointUri: java.lang.String, tableEndpointUri: java.lang.String, usePathStyleUri: scala.Boolean) = this()
  var _blobEndpointUri: java.lang.String = js.native
  var _key: java.lang.String = js.native
  var _name: java.lang.String = js.native
  var _queueEndpointUri: java.lang.String = js.native
  var _tableEndpointUri: java.lang.String = js.native
  var _usePathStyleUri: scala.Boolean = js.native
}

/* static members */
@JSImport("azure", "StorageServiceSettings")
@js.native
object StorageServiceSettings extends js.Object {
  /**
    * Creates StorageServiceSettings object given endpoints uri.
    */
  def _createStorageServiceSettings(
    settings: azureLib.azureMod.Dictionary[java.lang.String],
    blobEndpointUri: java.lang.String,
    queueEndpointUri: java.lang.String,
    tableEndpointUri: java.lang.String
  ): azureLib.azureMod.StorageServiceSettings = js.native
  /**
    * Gets the default service endpoint using the specified protocol and account
    * name.
    */
  def _getDefaultServiceEndpoint(settings: azureLib.azureMod.Dictionary[java.lang.String], dns: java.lang.String): java.lang.String = js.native
  /**
    * Returns a StorageServiceSettings with development storage credentials using
    * the specified proxy Uri.
    */
  def _getDevelopmentStorageAccount(): azureLib.azureMod.StorageServiceSettings = js.native
  def _getDevelopmentStorageAccount(proxy: java.lang.String): azureLib.azureMod.StorageServiceSettings = js.native
  def createExplicitlyOrFromEnvironment(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): azureLib.azureMod.StorageServiceSettings = js.native
  def createFromConfig(config: js.Any): azureLib.azureMod.StorageServiceSettings = js.native
  /**
    * Creates a StorageServiceSettings object from the given connection string.
    */
  def createFromConnectionString(connectionString: java.lang.String): azureLib.azureMod.StorageServiceSettings = js.native
  /**
    * Creates a ServiceBusSettings object from a set of settings.
    */
  def createFromSettings(settings: azureLib.azureMod.Dictionary[java.lang.String]): azureLib.azureMod.StorageServiceSettings = js.native
  def customizeConfig(config: js.Any): scala.Unit = js.native
  /**
    * Gets a StorageServiceSettings object that references the development storage
    * account.
    */
  def getDevelopmentStorageAccountSettings(): azureLib.azureMod.StorageServiceSettings = js.native
  def isDevelopmentStorage(storageAccount: java.lang.String, storageAccessKey: java.lang.String, parsedHost: java.lang.String): scala.Boolean = js.native
}

