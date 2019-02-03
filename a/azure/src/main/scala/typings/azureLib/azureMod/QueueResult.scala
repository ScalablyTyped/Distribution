package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "QueueResult")
@js.native
class QueueResult () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, metadata: StorageMetadata) = this()
  var approximatemessagecount: scala.Double = js.native
  var metadata: StorageMetadata = js.native
  var name: java.lang.String = js.native
  def getPropertiesFromHeaders(headers: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("azure", "QueueResult")
@js.native
object QueueResult extends js.Object {
  def parse(messageXml: js.Any): azureLib.azureMod.QueueResult = js.native
}

