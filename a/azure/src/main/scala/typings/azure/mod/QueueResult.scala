package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "QueueResult")
@js.native
class QueueResult () extends js.Object {
  def this(name: String) = this()
  def this(name: String, metadata: StorageMetadata) = this()
  var approximatemessagecount: Double = js.native
  var metadata: StorageMetadata = js.native
  var name: String = js.native
  def getPropertiesFromHeaders(headers: js.Any): Unit = js.native
}

/* static members */
@JSImport("azure", "QueueResult")
@js.native
object QueueResult extends js.Object {
  def parse(messageXml: js.Any): QueueResult = js.native
}

