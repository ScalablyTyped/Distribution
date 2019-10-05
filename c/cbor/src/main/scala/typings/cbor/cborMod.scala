package typings.cbor

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", JSImport.Namespace)
@js.native
object cborMod extends js.Object {
  @js.native
  class Decoder () extends Transform {
    def this(params: Anon_Encoding) = this()
  }
  
  @js.native
  class Encoder () extends Transform {
    def addSemanticType[T](
      `type`: Instantiable1[/* args (repeated) */ js.Any, T],
      encodeFunction: js.Function2[/* encoder */ this.type, /* t */ T, Unit]
    ): Unit = js.native
    def pushAny(input: js.Any): Unit = js.native
  }
  
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
  @js.native
  object leveldb extends js.Object {
    val buffer: Boolean = js.native
    val name: String = js.native
    def decode(input: String): js.Array[_] = js.native
    def decode(input: Buffer): js.Array[_] = js.native
    def encode(input: js.Any): Buffer = js.native
  }
  
}

