package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A box which allows multiline text input.
  */
@js.native
trait TextareaOptions extends BoxOptions {
  /**
    * Call readInput() when the element is focused. Automatically unfocus.
    */
  var inputOnFocus: js.UndefOr[Boolean] = js.native
}

object TextareaOptions {
  @scala.inline
  def apply(): TextareaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaOptions]
  }
  @scala.inline
  implicit class TextareaOptionsOps[Self <: TextareaOptions] (val x: Self) extends AnyVal {
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
    def setInputOnFocus(value: Boolean): Self = this.set("inputOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputOnFocus: Self = this.set("inputOnFocus", js.undefined)
  }
  
}

