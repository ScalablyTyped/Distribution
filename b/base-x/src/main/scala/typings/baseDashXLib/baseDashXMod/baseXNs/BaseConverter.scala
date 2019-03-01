package typings
package baseDashXLib.baseDashXMod.baseXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConverter extends js.Object {
  def decode(string: java.lang.String): bufferLib.bufferMod.Buffer
  def decodeUnsafe(string: java.lang.String): js.UndefOr[bufferLib.bufferMod.Buffer]
  def encode(buffer: bufferLib.bufferMod.Buffer): java.lang.String
}

object BaseConverter {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, bufferLib.bufferMod.Buffer],
    decodeUnsafe: js.Function1[java.lang.String, js.UndefOr[bufferLib.bufferMod.Buffer]],
    encode: js.Function1[bufferLib.bufferMod.Buffer, java.lang.String]
  ): BaseConverter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("decodeUnsafe")(decodeUnsafe)
    __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[BaseConverter]
  }
}

