package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "StorageServiceSettings")
@js.native
class StorageServiceSettings protected () extends StObject {
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
object StorageServiceSettings {
  
  /**
    * Creates StorageServiceSettings object given endpoints uri.
    */
  @JSImport("azure", "StorageServiceSettings._createStorageServiceSettings")
  @js.native
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
  @JSImport("azure", "StorageServiceSettings._getDefaultServiceEndpoint")
  @js.native
  def _getDefaultServiceEndpoint(settings: Dictionary[String], dns: String): String = js.native
  
  /**
    * Returns a StorageServiceSettings with development storage credentials using
    * the specified proxy Uri.
    */
  @JSImport("azure", "StorageServiceSettings._getDevelopmentStorageAccount")
  @js.native
  def _getDevelopmentStorageAccount(): StorageServiceSettings = js.native
  @JSImport("azure", "StorageServiceSettings._getDevelopmentStorageAccount")
  @js.native
  def _getDevelopmentStorageAccount(proxy: String): StorageServiceSettings = js.native
  
  @JSImport("azure", "StorageServiceSettings.createExplicitlyOrFromEnvironment")
  @js.native
  def createExplicitlyOrFromEnvironment(storageAccount: String, storageAccessKey: String, host: String): StorageServiceSettings = js.native
  
  @JSImport("azure", "StorageServiceSettings.createFromConfig")
  @js.native
  def createFromConfig(config: js.Any): StorageServiceSettings = js.native
  
  /**
    * Creates a StorageServiceSettings object from the given connection string.
    */
  @JSImport("azure", "StorageServiceSettings.createFromConnectionString")
  @js.native
  def createFromConnectionString(connectionString: String): StorageServiceSettings = js.native
  
  /**
    * Creates a ServiceBusSettings object from a set of settings.
    */
  @JSImport("azure", "StorageServiceSettings.createFromSettings")
  @js.native
  def createFromSettings(settings: Dictionary[String]): StorageServiceSettings = js.native
  
  @JSImport("azure", "StorageServiceSettings.customizeConfig")
  @js.native
  def customizeConfig(config: js.Any): Unit = js.native
  
  /**
    * Gets a StorageServiceSettings object that references the development storage
    * account.
    */
  @JSImport("azure", "StorageServiceSettings.getDevelopmentStorageAccountSettings")
  @js.native
  def getDevelopmentStorageAccountSettings(): StorageServiceSettings = js.native
  
  @JSImport("azure", "StorageServiceSettings.isDevelopmentStorage")
  @js.native
  def isDevelopmentStorage(storageAccount: String, storageAccessKey: String, parsedHost: String): Boolean = js.native
}
