package typings.bufferFrom

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer-from", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(arrayBuffer: ArrayBuffer): Buffer = js.native
  def apply(arrayBuffer: ArrayBuffer, byteOffset: Double): Buffer = js.native
  def apply(arrayBuffer: ArrayBuffer, byteOffset: Double, length: Double): Buffer = js.native
  def apply(data: js.Array[_]): Buffer = js.native
  def apply(data: Buffer): Buffer = js.native
  def apply(str: String): Buffer = js.native
  def apply(str: String, encoding: String): Buffer = js.native
}

