package typings.bytewise.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bytewise
  extends /* k */ StringDictionary[js.Any] {
  def decode(value: Buffer): js.Any = js.native
  def encode(value: js.Any): Buffer = js.native
}

object Bytewise {
  @scala.inline
  def apply(decode: Buffer => js.Any, encode: js.Any => Buffer): Bytewise = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Bytewise]
  }
  @scala.inline
  implicit class BytewiseOps[Self <: Bytewise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecode(value: Buffer => js.Any): Self = this.set("decode", js.Any.fromFunction1(value))
    @scala.inline
    def setEncode(value: js.Any => Buffer): Self = this.set("encode", js.Any.fromFunction1(value))
  }
  
}

