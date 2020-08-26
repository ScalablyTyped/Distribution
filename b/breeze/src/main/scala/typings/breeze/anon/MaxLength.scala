package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxLength extends js.Object {
  var maxLength: Double = js.native
  var messageTemplate: js.UndefOr[String] = js.native
}

object MaxLength {
  @scala.inline
  def apply(maxLength: Double): MaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxLength]
  }
  @scala.inline
  implicit class MaxLengthOps[Self <: MaxLength] (val x: Self) extends AnyVal {
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
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageTemplate(value: String): Self = this.set("messageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTemplate: Self = this.set("messageTemplate", js.undefined)
  }
  
}

