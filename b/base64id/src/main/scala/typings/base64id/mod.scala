package typings.base64id

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("base64id", "bytesBuffer")
  @js.native
  def bytesBuffer: Buffer = js.native
  
  @JSImport("base64id", "bytesBufferIndex")
  @js.native
  def bytesBufferIndex: Double = js.native
  @scala.inline
  def bytesBufferIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesBufferIndex")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def bytesBuffer_=(x: Buffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("base64id", "generateId")
  @js.native
  def generateId(): String = js.native
  
  @JSImport("base64id", "getRandomBytes")
  @js.native
  def getRandomBytes(bytes: Double): Buffer = js.native
  
  @JSImport("base64id", "isGeneratingBytes")
  @js.native
  def isGeneratingBytes: Boolean = js.native
  @scala.inline
  def isGeneratingBytes_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isGeneratingBytes")(x.asInstanceOf[js.Any])
  
  @JSImport("base64id", "sequenceNumber")
  @js.native
  def sequenceNumber: Double = js.native
  @scala.inline
  def sequenceNumber_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumber")(x.asInstanceOf[js.Any])
}
