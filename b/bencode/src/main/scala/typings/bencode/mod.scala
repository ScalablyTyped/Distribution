package typings.bencode

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bencode", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def byteLength(value: js.Any): Double = js.native
  def decode(data: Buffer): js.Any = js.native
  def decode(data: Buffer, start: Double): js.Any = js.native
  def decode(data: Buffer, start: Double, end: Double): js.Any = js.native
  def decode(data: Buffer, start: Double, end: Double, encoding: String): js.Any = js.native
  def encode(data: js.Any): Buffer = js.native
  def encode(data: js.Any, buffer: Buffer): Buffer = js.native
  def encode(data: js.Any, buffer: Buffer, offset: Double): Buffer = js.native
  def encodingLength(value: js.Any): Double = js.native
}

