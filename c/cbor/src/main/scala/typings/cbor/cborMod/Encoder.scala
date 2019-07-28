package typings.cbor.cborMod

import org.scalablytyped.runtime.Instantiable1
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "Encoder")
@js.native
class Encoder () extends Transform {
  def addSemanticType[T](
    `type`: Instantiable1[/* args (repeated) */ js.Any, T],
    encodeFunction: js.Function2[/* encoder */ this.type, /* t */ T, Unit]
  ): Unit = js.native
  def pushAny(input: js.Any): Unit = js.native
}

