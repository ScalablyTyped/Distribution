package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("azure", "StorageServiceSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates StorageServiceSettings object given endpoints uri.
    */
  inline def _createStorageServiceSettings(
    settings: Dictionary[String],
    blobEndpointUri: String,
    queueEndpointUri: String,
    tableEndpointUri: String
  ): StorageServiceSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("_createStorageServiceSettings")(settings.asInstanceOf[js.Any], blobEndpointUri.asInstanceOf[js.Any], queueEndpointUri.asInstanceOf[js.Any], tableEndpointUri.asInstanceOf[js.Any])).asInstanceOf[StorageServiceSettings]
  
  /**
    * Gets the default service endpoint using the specified protocol and account
    * name.
    */
  inline def _getDefaultServiceEndpoint(settings: Dictionary[String], dns: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getDefaultServiceEndpoint")(settings.asInstanceOf[js.Any], dns.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Returns a StorageServiceSettings with development storage credentials using
    * the specified proxy Uri.
    */
  inline def _getDevelopmentStorageAccount(): StorageServiceSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("_getDevelopmentStorageAccount")().asInstanceOf[StorageServiceSettings]
  inline def _getDevelopmentStorageAccount(proxy: String): StorageServiceSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("_getDevelopmentStorageAccount")(proxy.asInstanceOf[js.Any]).asInstanceOf[StorageServiceSettings]
  
  inline def createExplicitlyOrFromEnvironment(storageAccount: String, storageAccessKey: String, host: String): StorageServiceSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createExplicitlyOrFromEnvironment")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[StorageServiceSettings]
  
  inline def createFromConfig(config: js.Any): StorageServiceSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromConfig")(config.asInstanceOf[js.Any]).asInstanceOf[StorageServiceSettings]
  
  /**
    * Creates a StorageServiceSettings object from the given connection string.
    */
  inline def createFromConnectionString(connectionString: String): StorageServiceSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromConnectionString")(connectionString.asInstanceOf[js.Any]).asInstanceOf[StorageServiceSettings]
  
  /**
    * Creates a ServiceBusSettings object from a set of settings.
    */
  inline def createFromSettings(settings: Dictionary[String]): StorageServiceSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[StorageServiceSettings]
  
  inline def customizeConfig(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("customizeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Gets a StorageServiceSettings object that references the development storage
    * account.
    */
  inline def getDevelopmentStorageAccountSettings(): StorageServiceSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevelopmentStorageAccountSettings")().asInstanceOf[StorageServiceSettings]
  
  inline def isDevelopmentStorage(storageAccount: String, storageAccessKey: String, parsedHost: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDevelopmentStorage")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], parsedHost.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
