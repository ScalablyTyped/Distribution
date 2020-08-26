package typings.cryptoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray extends js.Object {
  var WordArray: Create = js.native
}

object WordArray {
  @scala.inline
  def apply(WordArray: Create): WordArray = {
    val __obj = js.Dynamic.literal(WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordArray]
  }
  @scala.inline
  implicit class WordArrayOps[Self <: WordArray] (val x: Self) extends AnyVal {
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
    def setWordArray(value: Create): Self = this.set("WordArray", value.asInstanceOf[js.Any])
  }
  
}

