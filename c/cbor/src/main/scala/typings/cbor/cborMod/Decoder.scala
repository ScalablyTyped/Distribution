package typings.cbor.cborMod

import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "Decoder")
@js.native
class Decoder () extends Transform {
  def this(options: DecoderOptions) = this()
}

/* static members */
@JSImport("cbor", "Decoder")
@js.native
object Decoder extends js.Object {
  def decodeAll(input: String): js.Promise[_] = js.native
  def decodeAll(input: String, cb: decodeAllCallback): Unit = js.native
  def decodeAll(input: String, options: String): js.Promise[_] = js.native
  def decodeAll(input: String, options: String, cb: decodeAllCallback): Unit = js.native
  def decodeAll(input: String, options: DecodeOptions): js.Promise[_] = js.native
  def decodeAll(input: String, options: DecodeOptions, cb: decodeAllCallback): Unit = js.native
  def decodeAll(input: Buffer): js.Promise[_] = js.native
  def decodeAll(input: Buffer, cb: decodeAllCallback): Unit = js.native
  def decodeAll(input: Buffer, options: String): js.Promise[_] = js.native
  def decodeAll(input: Buffer, options: String, cb: decodeAllCallback): Unit = js.native
  def decodeAll(input: Buffer, options: DecodeOptions): js.Promise[_] = js.native
  def decodeAll(input: Buffer, options: DecodeOptions, cb: decodeAllCallback): Unit = js.native
  def decodeAllSync(input: String): js.Array[_] = js.native
  def decodeAllSync(input: String, options: String): js.Array[_] = js.native
  def decodeAllSync(input: String, options: DecodeOptions): js.Array[_] = js.native
  def decodeAllSync(input: Buffer): js.Array[_] = js.native
  def decodeAllSync(input: Buffer, options: String): js.Array[_] = js.native
  def decodeAllSync(input: Buffer, options: DecodeOptions): js.Array[_] = js.native
  def decodeFirst(input: String): js.Promise[_] = js.native
  def decodeFirst(input: String, cb: decodeCallback): Unit = js.native
  def decodeFirst(input: String, options: String): js.Promise[_] = js.native
  def decodeFirst(input: String, options: String, cb: decodeCallback): Unit = js.native
  def decodeFirst(input: String, options: DecodeOptions): js.Promise[_] = js.native
  def decodeFirst(input: String, options: DecodeOptions, cb: decodeCallback): Unit = js.native
  def decodeFirst(input: Buffer): js.Promise[_] = js.native
  def decodeFirst(input: Buffer, cb: decodeCallback): Unit = js.native
  def decodeFirst(input: Buffer, options: String): js.Promise[_] = js.native
  def decodeFirst(input: Buffer, options: String, cb: decodeCallback): Unit = js.native
  def decodeFirst(input: Buffer, options: DecodeOptions): js.Promise[_] = js.native
  def decodeFirst(input: Buffer, options: DecodeOptions, cb: decodeCallback): Unit = js.native
  def decodeFirstSync(input: String): js.Any = js.native
  def decodeFirstSync(input: String, options: String): js.Any = js.native
  def decodeFirstSync(input: String, options: DecodeOptions): js.Any = js.native
  def decodeFirstSync(input: Buffer): js.Any = js.native
  def decodeFirstSync(input: Buffer, options: String): js.Any = js.native
  def decodeFirstSync(input: Buffer, options: DecodeOptions): js.Any = js.native
  def nullcheck(`val`: js.Any): js.Any = js.native
}

