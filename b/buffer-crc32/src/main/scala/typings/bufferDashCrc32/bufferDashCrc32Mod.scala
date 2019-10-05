package typings.bufferDashCrc32

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer-crc32", JSImport.Namespace)
@js.native
object bufferDashCrc32Mod extends js.Object {
  def apply(input: String): Buffer = js.native
  def apply(input: String, partialCrc: Buffer): Buffer = js.native
  def apply(input: Buffer): Buffer = js.native
  def apply(input: Buffer, partialCrc: Buffer): Buffer = js.native
  def signed(buffer: Buffer): Double = js.native
  def unsigned(buffer: Buffer): Double = js.native
}

