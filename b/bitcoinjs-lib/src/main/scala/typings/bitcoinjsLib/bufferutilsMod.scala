package typings.bitcoinjsLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/bufferutils", JSImport.Namespace)
@js.native
object bufferutilsMod extends js.Object {
  def readUInt64LE(buffer: Buffer, offset: Double): Double = js.native
  def reverseBuffer(buffer: Buffer): Buffer = js.native
  def writeUInt64LE(buffer: Buffer, value: Double, offset: Double): Double = js.native
}

