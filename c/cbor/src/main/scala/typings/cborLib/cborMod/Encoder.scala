package typings
package cborLib.cborMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "Encoder")
@js.native
class Encoder ()
  extends nodeLib.streamMod.Transform {
  def addSemanticType[T](
    `type`: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T],
    encodeFunction: js.Function2[/* encoder */ this.type, /* t */ T, scala.Unit]
  ): scala.Unit = js.native
  def pushAny(input: js.Any): scala.Unit = js.native
}

