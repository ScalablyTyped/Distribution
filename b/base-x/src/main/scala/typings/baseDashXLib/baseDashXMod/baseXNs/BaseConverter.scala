package typings
package baseDashXLib.baseDashXMod.baseXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConverter extends js.Object {
  def decode(string: java.lang.String): nodeLib.bufferMod.Buffer
  def decodeUnsafe(string: java.lang.String): js.UndefOr[nodeLib.bufferMod.Buffer]
  def encode(buffer: nodeLib.bufferMod.Buffer): java.lang.String
}

object BaseConverter {
  @scala.inline
  def apply(
    decode: java.lang.String => nodeLib.bufferMod.Buffer,
    decodeUnsafe: java.lang.String => js.UndefOr[nodeLib.bufferMod.Buffer],
    encode: nodeLib.bufferMod.Buffer => java.lang.String
  ): BaseConverter = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), decodeUnsafe = js.Any.fromFunction1(decodeUnsafe), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[BaseConverter]
  }
}

