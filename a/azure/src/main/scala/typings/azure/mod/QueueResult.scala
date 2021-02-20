package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "QueueResult")
@js.native
class QueueResult () extends StObject {
  def this(name: String) = this()
  def this(name: String, metadata: StorageMetadata) = this()
  
  var approximatemessagecount: Double = js.native
  
  def getPropertiesFromHeaders(headers: js.Any): Unit = js.native
  
  var metadata: StorageMetadata = js.native
  
  var name: String = js.native
}
/* static members */
object QueueResult {
  
  @JSImport("azure", "QueueResult.parse")
  @js.native
  def parse(messageXml: js.Any): QueueResult = js.native
}
