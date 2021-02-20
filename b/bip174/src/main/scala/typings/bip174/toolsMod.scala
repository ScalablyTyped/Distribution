package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsMod {
  
  @JSImport("bip174/src/lib/converter/tools", "keyValToBuffer")
  @js.native
  def keyValToBuffer(keyVal: KeyValue): Buffer = js.native
  
  @JSImport("bip174/src/lib/converter/tools", "keyValsToBuffer")
  @js.native
  def keyValsToBuffer(keyVals: js.Array[KeyValue]): Buffer = js.native
  
  @JSImport("bip174/src/lib/converter/tools", "range")
  @js.native
  def range(n: Double): js.Array[Double] = js.native
  
  @JSImport("bip174/src/lib/converter/tools", "readUInt64LE")
  @js.native
  def readUInt64LE(buffer: Buffer, offset: Double): Double = js.native
  
  @JSImport("bip174/src/lib/converter/tools", "reverseBuffer")
  @js.native
  def reverseBuffer(buffer: Buffer): Buffer = js.native
  
  @JSImport("bip174/src/lib/converter/tools", "writeUInt64LE")
  @js.native
  def writeUInt64LE(buffer: Buffer, value: Double, offset: Double): Double = js.native
}
