package typings
package bytewiseLib.bytewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bytewise
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def decode(value: nodeLib.Buffer): js.Any
  def encode(value: js.Any): nodeLib.Buffer
}

object Bytewise {
  @scala.inline
  def apply(
    decode: nodeLib.Buffer => js.Any,
    encode: js.Any => nodeLib.Buffer,
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Bytewise = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Bytewise]
  }
}

