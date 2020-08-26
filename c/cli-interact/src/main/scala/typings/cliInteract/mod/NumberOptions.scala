package typings.cliInteract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberOptions extends js.Object {
  var allowNoAnswer: js.UndefOr[Boolean] = js.native
  var requireInteger: js.UndefOr[Boolean] = js.native
}

object NumberOptions {
  @scala.inline
  def apply(): NumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOptions]
  }
  @scala.inline
  implicit class NumberOptionsOps[Self <: NumberOptions] (val x: Self) extends AnyVal {
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
    def setAllowNoAnswer(value: Boolean): Self = this.set("allowNoAnswer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNoAnswer: Self = this.set("allowNoAnswer", js.undefined)
    @scala.inline
    def setRequireInteger(value: Boolean): Self = this.set("requireInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireInteger: Self = this.set("requireInteger", js.undefined)
  }
  
}

