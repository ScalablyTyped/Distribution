package typings
package bencodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bencode", JSImport.Namespace)
@js.native
object bencodeMod extends js.Object {
  def byteLength(value: js.Any): scala.Double = js.native
  def decode(data: nodeLib.Buffer): js.Any = js.native
  def decode(data: nodeLib.Buffer, start: scala.Double): js.Any = js.native
  def decode(data: nodeLib.Buffer, start: scala.Double, end: scala.Double): js.Any = js.native
  def decode(data: nodeLib.Buffer, start: scala.Double, end: scala.Double, encoding: java.lang.String): js.Any = js.native
  def encode(data: js.Any): nodeLib.Buffer = js.native
  def encode(data: js.Any, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def encode(data: js.Any, buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  def encodingLength(value: js.Any): scala.Double = js.native
}

