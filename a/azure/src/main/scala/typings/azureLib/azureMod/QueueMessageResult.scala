package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "QueueMessageResult")
@js.native
class QueueMessageResult () extends js.Object {
  def this(queue: java.lang.String) = this()
  def this(queue: java.lang.String, messageid: java.lang.String) = this()
  def this(queue: java.lang.String, messageid: java.lang.String, popreceipt: java.lang.String) = this()
  def this(queue: java.lang.String, messageid: java.lang.String, popreceipt: java.lang.String, metadata: StorageMetadata) = this()
  var dequeuecount: java.lang.String = js.native
  var expirationtime: java.lang.String = js.native
  var insertiontime: java.lang.String = js.native
  var messageid: java.lang.String = js.native
  var messagetext: java.lang.String = js.native
  var metadata: StorageMetadata = js.native
  var popreceipt: java.lang.String = js.native
  var queue: java.lang.String = js.native
  var timenextvisible: java.lang.String = js.native
  def getPropertiesFromHeaders(headers: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("azure", "QueueMessageResult")
@js.native
object QueueMessageResult extends js.Object {
  def parse(messageXml: js.Any): azureLib.azureMod.QueueMessageResult = js.native
  def serialize(messageJs: java.lang.String): java.lang.String = js.native
}

