package typings.cbor.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "Encoder")
@js.native
class Encoder () extends Transform {
  def this(options: EncoderOptions) = this()
  def addSemanticType[T](
    `type`: Instantiable1[/* args (repeated) */ js.Any, T],
    encodeFunction: js.Function2[/* encoder */ this.type, /* t */ T, Boolean]
  ): js.Function2[/* encoder */ this.type, /* t */ T, Boolean | Null] = js.native
  def pushAny(input: js.Any): Boolean = js.native
  def removeLoopDetectors(obj: js.Any): Boolean = js.native
}

/* static members */
@JSImport("cbor", "Encoder")
@js.native
object Encoder extends js.Object {
  def encode(objs: js.Any*): Buffer = js.native
  def encodeAsync(obj: js.Any): js.Promise[Buffer] = js.native
  def encodeAsync(obj: js.Any, options: EncoderOptions): js.Promise[Buffer] = js.native
  def encodeCanonical(objs: js.Any*): Buffer = js.native
  def encodeOne(obj: js.Any): Buffer = js.native
  def encodeOne(obj: js.Any, options: EncoderOptions): Buffer = js.native
}

