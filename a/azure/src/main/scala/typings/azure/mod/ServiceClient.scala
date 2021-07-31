package typings.azure.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "ServiceClient")
@js.native
class ServiceClient protected () extends EventEmitter {
  def this(host: String, authenticationProvider: js.Any) = this()
  
  def isEmulated(): Boolean = js.native
  
  def parseMetadataHeaders(headers: js.Any): js.Any = js.native
  
  def performRequest(webResource: WebResource, outputData: String, options: js.Any, callback: js.Function): Unit = js.native
  
  def performRequestInputStream(
    webResource: WebResource,
    outputData: String,
    inputStream: js.Any,
    options: js.Any,
    callback: js.Function
  ): Unit = js.native
  
  def performRequestOutputStream(webResource: WebResource, outputStream: js.Any, options: js.Any, callback: js.Function): Unit = js.native
  
  def setHost(host: String): Unit = js.native
  
  def setProxy(proxyUrl: String, proxyPort: Double): Unit = js.native
  
  def withFilter(newFilter: Filter): ServiceClient = js.native
}
/* static members */
object ServiceClient {
  
  @JSImport("azure", "ServiceClient")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("azure", "ServiceClient.CLOUD_ACCESS_CONTROL_HOST")
  @js.native
  def CLOUD_ACCESS_CONTROL_HOST: String = js.native
  @scala.inline
  def CLOUD_ACCESS_CONTROL_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOUD_ACCESS_CONTROL_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.CLOUD_BLOB_HOST")
  @js.native
  def CLOUD_BLOB_HOST: String = js.native
  @scala.inline
  def CLOUD_BLOB_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOUD_BLOB_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.CLOUD_DATABASE_HOST")
  @js.native
  def CLOUD_DATABASE_HOST: String = js.native
  @scala.inline
  def CLOUD_DATABASE_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOUD_DATABASE_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.CLOUD_QUEUE_HOST")
  @js.native
  def CLOUD_QUEUE_HOST: String = js.native
  @scala.inline
  def CLOUD_QUEUE_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOUD_QUEUE_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.CLOUD_SERVICEBUS_HOST")
  @js.native
  def CLOUD_SERVICEBUS_HOST: String = js.native
  @scala.inline
  def CLOUD_SERVICEBUS_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOUD_SERVICEBUS_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.CLOUD_SERVICE_MANAGEMENT_HOST")
  @js.native
  def CLOUD_SERVICE_MANAGEMENT_HOST: String = js.native
  @scala.inline
  def CLOUD_SERVICE_MANAGEMENT_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOUD_SERVICE_MANAGEMENT_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.CLOUD_TABLE_HOST")
  @js.native
  def CLOUD_TABLE_HOST: String = js.native
  @scala.inline
  def CLOUD_TABLE_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOUD_TABLE_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.DEFAULT_PROTOCOL")
  @js.native
  def DEFAULT_PROTOCOL: String = js.native
  @scala.inline
  def DEFAULT_PROTOCOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_PROTOCOL")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.DEFAULT_SERVICEBUS_ISSUER")
  @js.native
  def DEFAULT_SERVICEBUS_ISSUER: String = js.native
  @scala.inline
  def DEFAULT_SERVICEBUS_ISSUER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SERVICEBUS_ISSUER")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.DEFAULT_WRAP_NAMESPACE_SUFFIX")
  @js.native
  def DEFAULT_WRAP_NAMESPACE_SUFFIX: String = js.native
  @scala.inline
  def DEFAULT_WRAP_NAMESPACE_SUFFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_WRAP_NAMESPACE_SUFFIX")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.DEVSTORE_BLOB_HOST")
  @js.native
  def DEVSTORE_BLOB_HOST: String = js.native
  @scala.inline
  def DEVSTORE_BLOB_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVSTORE_BLOB_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.DEVSTORE_QUEUE_HOST")
  @js.native
  def DEVSTORE_QUEUE_HOST: String = js.native
  @scala.inline
  def DEVSTORE_QUEUE_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVSTORE_QUEUE_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.DEVSTORE_STORAGE_ACCESS_KEY")
  @js.native
  def DEVSTORE_STORAGE_ACCESS_KEY: String = js.native
  @scala.inline
  def DEVSTORE_STORAGE_ACCESS_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVSTORE_STORAGE_ACCESS_KEY")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.DEVSTORE_STORAGE_ACCOUNT")
  @js.native
  def DEVSTORE_STORAGE_ACCOUNT: String = js.native
  @scala.inline
  def DEVSTORE_STORAGE_ACCOUNT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVSTORE_STORAGE_ACCOUNT")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.DEVSTORE_TABLE_HOST")
  @js.native
  def DEVSTORE_TABLE_HOST: String = js.native
  @scala.inline
  def DEVSTORE_TABLE_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVSTORE_TABLE_HOST")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceClient.EnvironmentVariables")
  @js.native
  def EnvironmentVariables: js.Any = js.native
  @scala.inline
  def EnvironmentVariables_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentVariables")(x.asInstanceOf[js.Any])
}
