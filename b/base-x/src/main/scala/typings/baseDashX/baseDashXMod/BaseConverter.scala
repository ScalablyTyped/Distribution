package typings.baseDashX.baseDashXMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConverter extends js.Object {
  def decode(string: String): Buffer
  def decodeUnsafe(string: String): js.UndefOr[Buffer]
  def encode(buffer: Buffer): String
}

object BaseConverter {
  @scala.inline
  def apply(decode: String => Buffer, decodeUnsafe: String => js.UndefOr[Buffer], encode: Buffer => String): BaseConverter = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), decodeUnsafe = js.Any.fromFunction1(decodeUnsafe), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[BaseConverter]
  }
}

