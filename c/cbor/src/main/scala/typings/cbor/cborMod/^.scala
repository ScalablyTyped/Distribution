package typings.cbor.cborMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(input: String): js.Any = js.native
  def decode(input: Buffer): js.Any = js.native
  def decodeAll(input: String, callback: js.Function2[/* error */ js.Any, /* objs */ js.Array[_], Unit]): Unit = js.native
  def decodeAll(input: Buffer, callback: js.Function2[/* error */ js.Any, /* objs */ js.Array[_], Unit]): Unit = js.native
  def decodeAllSync(input: String): js.Array[_] = js.native
  def decodeAllSync(input: Buffer): js.Array[_] = js.native
  def decodeFirst(input: String, callback: js.Function2[/* error */ js.Any, /* obj */ js.Any, Unit]): Unit = js.native
  def decodeFirst(input: Buffer, callback: js.Function2[/* error */ js.Any, /* obj */ js.Any, Unit]): Unit = js.native
  def decodeFirstSync(input: String): js.Any = js.native
  def decodeFirstSync(input: Buffer): js.Any = js.native
  def encode(input: js.Any): Buffer = js.native
}

