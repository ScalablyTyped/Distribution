package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoder extends js.Object {
  def parse(encodedMessage: String): js.Any = js.native
  def stringify(words: js.Any): String = js.native
}

object Encoder {
  @scala.inline
  def apply(parse: String => js.Any, stringify: js.Any => String): Encoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Encoder]
  }
  @scala.inline
  implicit class EncoderOps[Self <: Encoder] (val x: Self) extends AnyVal {
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
    def setParse(value: String => js.Any): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def setStringify(value: js.Any => String): Self = this.set("stringify", js.Any.fromFunction1(value))
  }
  
}

