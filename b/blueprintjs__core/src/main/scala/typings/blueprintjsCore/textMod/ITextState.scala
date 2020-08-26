package typings.blueprintjsCore.textMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextState extends js.Object {
  var isContentOverflowing: Boolean = js.native
  var textContent: String = js.native
}

object ITextState {
  @scala.inline
  def apply(isContentOverflowing: Boolean, textContent: String): ITextState = {
    val __obj = js.Dynamic.literal(isContentOverflowing = isContentOverflowing.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextState]
  }
  @scala.inline
  implicit class ITextStateOps[Self <: ITextState] (val x: Self) extends AnyVal {
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
    def setIsContentOverflowing(value: Boolean): Self = this.set("isContentOverflowing", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
  }
  
}

