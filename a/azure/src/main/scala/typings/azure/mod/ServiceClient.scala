package typings.azure.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("azure", "ServiceClient")
@js.native
object ServiceClient extends js.Object {
  var CLOUD_ACCESS_CONTROL_HOST: String = js.native
  var CLOUD_BLOB_HOST: String = js.native
  var CLOUD_DATABASE_HOST: String = js.native
  var CLOUD_QUEUE_HOST: String = js.native
  var CLOUD_SERVICEBUS_HOST: String = js.native
  var CLOUD_SERVICE_MANAGEMENT_HOST: String = js.native
  var CLOUD_TABLE_HOST: String = js.native
  var DEFAULT_PROTOCOL: String = js.native
  var DEFAULT_SERVICEBUS_ISSUER: String = js.native
  var DEFAULT_WRAP_NAMESPACE_SUFFIX: String = js.native
  var DEVSTORE_BLOB_HOST: String = js.native
  var DEVSTORE_QUEUE_HOST: String = js.native
  var DEVSTORE_STORAGE_ACCESS_KEY: String = js.native
  var DEVSTORE_STORAGE_ACCOUNT: String = js.native
  var DEVSTORE_TABLE_HOST: String = js.native
  var EnvironmentVariables: js.Any = js.native
}

