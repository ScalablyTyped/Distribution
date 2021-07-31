package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "QueueMessageResult")
@js.native
class QueueMessageResult () extends StObject {
  def this(queue: String) = this()
  def this(queue: String, messageid: String) = this()
  def this(queue: String, messageid: String, popreceipt: String) = this()
  def this(queue: String, messageid: String, popreceipt: String, metadata: StorageMetadata) = this()
  
  var dequeuecount: String = js.native
  
  var expirationtime: String = js.native
  
  def getPropertiesFromHeaders(headers: js.Any): Unit = js.native
  
  var insertiontime: String = js.native
  
  var messageid: String = js.native
  
  var messagetext: String = js.native
  
  var metadata: StorageMetadata = js.native
  
  var popreceipt: String = js.native
  
  var queue: String = js.native
  
  var timenextvisible: String = js.native
}
/* static members */
object QueueMessageResult {
  
  @JSImport("azure", "QueueMessageResult")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(messageXml: js.Any): QueueMessageResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(messageXml.asInstanceOf[js.Any]).asInstanceOf[QueueMessageResult]
  
  @scala.inline
  def serialize(messageJs: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(messageJs.asInstanceOf[js.Any]).asInstanceOf[String]
}
