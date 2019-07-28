package typings.bytewise.bytewiseMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bytewise
  extends /* k */ StringDictionary[js.Any] {
  def decode(value: Buffer): js.Any
  def encode(value: js.Any): Buffer
}

object Bytewise {
  @scala.inline
  def apply(
    decode: Buffer => js.Any,
    encode: js.Any => Buffer,
    StringDictionary: /* k */ StringDictionary[js.Any] = null
  ): Bytewise = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Bytewise]
  }
}

