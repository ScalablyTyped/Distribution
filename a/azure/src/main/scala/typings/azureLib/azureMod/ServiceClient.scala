package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "ServiceClient")
@js.native
class ServiceClient protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(host: java.lang.String, authenticationProvider: js.Any) = this()
  def isEmulated(): scala.Boolean = js.native
  def parseMetadataHeaders(headers: js.Any): js.Any = js.native
  def performRequest(webResource: WebResource, outputData: java.lang.String, options: js.Any, callback: js.Function): scala.Unit = js.native
  def performRequestInputStream(
    webResource: WebResource,
    outputData: java.lang.String,
    inputStream: js.Any,
    options: js.Any,
    callback: js.Function
  ): scala.Unit = js.native
  def performRequestOutputStream(webResource: WebResource, outputStream: js.Any, options: js.Any, callback: js.Function): scala.Unit = js.native
  def setHost(host: java.lang.String): scala.Unit = js.native
  def setProxy(proxyUrl: java.lang.String, proxyPort: scala.Double): scala.Unit = js.native
  def withFilter(newFilter: Filter): ServiceClient = js.native
}

/* static members */
@JSImport("azure", "ServiceClient")
@js.native
object ServiceClient extends js.Object {
  var CLOUD_ACCESS_CONTROL_HOST: java.lang.String = js.native
  var CLOUD_BLOB_HOST: java.lang.String = js.native
  var CLOUD_DATABASE_HOST: java.lang.String = js.native
  var CLOUD_QUEUE_HOST: java.lang.String = js.native
  var CLOUD_SERVICEBUS_HOST: java.lang.String = js.native
  var CLOUD_SERVICE_MANAGEMENT_HOST: java.lang.String = js.native
  var CLOUD_TABLE_HOST: java.lang.String = js.native
  var DEFAULT_PROTOCOL: java.lang.String = js.native
  var DEFAULT_SERVICEBUS_ISSUER: java.lang.String = js.native
  var DEFAULT_WRAP_NAMESPACE_SUFFIX: java.lang.String = js.native
  var DEVSTORE_BLOB_HOST: java.lang.String = js.native
  var DEVSTORE_QUEUE_HOST: java.lang.String = js.native
  var DEVSTORE_STORAGE_ACCESS_KEY: java.lang.String = js.native
  var DEVSTORE_STORAGE_ACCOUNT: java.lang.String = js.native
  var DEVSTORE_TABLE_HOST: java.lang.String = js.native
  var EnvironmentVariables: js.Any = js.native
}

