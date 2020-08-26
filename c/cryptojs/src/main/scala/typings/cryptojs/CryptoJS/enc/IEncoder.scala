package typings.cryptojs.CryptoJS.enc

import typings.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEncoder extends js.Object {
  def stringify(wordArray: WordArray): String = js.native
}

object IEncoder {
  @scala.inline
  def apply(stringify: WordArray => String): IEncoder = {
    val __obj = js.Dynamic.literal(stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[IEncoder]
  }
  @scala.inline
  implicit class IEncoderOps[Self <: IEncoder] (val x: Self) extends AnyVal {
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
    def setStringify(value: WordArray => String): Self = this.set("stringify", js.Any.fromFunction1(value))
  }
  
}

