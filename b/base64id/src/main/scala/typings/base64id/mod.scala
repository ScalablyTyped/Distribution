package typings.base64id

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def bytesBufferIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesBufferIndex")(x.asInstanceOf[js.Any])
  
  inline def bytesBuffer_=(x: Buffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesBuffer")(x.asInstanceOf[js.Any])
  
  inline def generateId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateId")().asInstanceOf[String]
  
  inline def getRandomBytes(bytes: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("base64id", "isGeneratingBytes")
  @js.native
  def isGeneratingBytes: Boolean = js.native
  inline def isGeneratingBytes_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isGeneratingBytes")(x.asInstanceOf[js.Any])
  
  @JSImport("base64id", "sequenceNumber")
  @js.native
  def sequenceNumber: Double = js.native
  inline def sequenceNumber_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumber")(x.asInstanceOf[js.Any])
}
