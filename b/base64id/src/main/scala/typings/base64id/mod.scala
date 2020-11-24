package typings.base64id

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("base64id", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var bytesBuffer: Buffer = js.native
  
  var bytesBufferIndex: Double = js.native
  
  def generateId(): String = js.native
  
  def getRandomBytes(bytes: Double): Buffer = js.native
  
  var isGeneratingBytes: Boolean = js.native
  
  var sequenceNumber: Double = js.native
}
