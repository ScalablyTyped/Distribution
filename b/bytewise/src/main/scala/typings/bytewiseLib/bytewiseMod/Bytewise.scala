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
    decode: js.Function1[nodeLib.Buffer, js.Any],
    encode: js.Function1[js.Any, nodeLib.Buffer],
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Bytewise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Bytewise]
  }
}

