package typings.ckeditor.CKEDITOR.plugins.pastefromword

import typings.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait lists_ extends js.Object {
  var numbering: numbering = js.native
}

object lists_ {
  @scala.inline
  def apply(numbering: numbering): lists_ = {
    val __obj = js.Dynamic.literal(numbering = numbering.asInstanceOf[js.Any])
    __obj.asInstanceOf[lists_]
  }
  @scala.inline
  implicit class lists_Ops[Self <: lists_] (val x: Self) extends AnyVal {
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
    def setNumbering(value: numbering): Self = this.set("numbering", value.asInstanceOf[js.Any])
  }
  
}

