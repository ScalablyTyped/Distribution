package typings.cryptojs.CryptoJS.enc

import typings.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDecoder extends js.Object {
  def parse(s: String): WordArray = js.native
}

object IDecoder {
  @scala.inline
  def apply(parse: String => WordArray): IDecoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[IDecoder]
  }
  @scala.inline
  implicit class IDecoderOps[Self <: IDecoder] (val x: Self) extends AnyVal {
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
    def setParse(value: String => WordArray): Self = this.set("parse", js.Any.fromFunction1(value))
  }
  
}

