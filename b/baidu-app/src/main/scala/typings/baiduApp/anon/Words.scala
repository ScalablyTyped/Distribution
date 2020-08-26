package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Words extends js.Object {
  var words: String = js.native
}

object Words {
  @scala.inline
  def apply(words: String): Words = {
    val __obj = js.Dynamic.literal(words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
  @scala.inline
  implicit class WordsOps[Self <: Words] (val x: Self) extends AnyVal {
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
    def setWords(value: String): Self = this.set("words", value.asInstanceOf[js.Any])
  }
  
}

