package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/tools", JSImport.Namespace)
@js.native
object srcLibConverterToolsMod extends js.Object {
  def keyValToBuffer(keyVal: KeyValue): Buffer = js.native
  def keyValsToBuffer(keyVals: js.Array[KeyValue]): Buffer = js.native
  def range(n: Double): js.Array[Double] = js.native
  def readUInt64LE(buffer: Buffer, offset: Double): Double = js.native
  def reverseBuffer(buffer: Buffer): Buffer = js.native
  def writeUInt64LE(buffer: Buffer, value: Double, offset: Double): Double = js.native
}

