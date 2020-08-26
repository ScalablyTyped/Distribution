package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogDateResult extends js.Object {
  var buttonType: typings.chayns.chayns.dialog.buttonType = js.native
  var timestamp: Double = js.native
}

object DialogDateResult {
  @scala.inline
  def apply(buttonType: buttonType, timestamp: Double): DialogDateResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogDateResult]
  }
  @scala.inline
  implicit class DialogDateResultOps[Self <: DialogDateResult] (val x: Self) extends AnyVal {
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
    def setButtonType(value: buttonType): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

