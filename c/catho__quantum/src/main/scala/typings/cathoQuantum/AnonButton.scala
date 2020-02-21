package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  var button: js.UndefOr[js.Object] = js.undefined
}

object AnonButton {
  @scala.inline
  def apply(button: js.Object = null): AnonButton = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButton]
  }
}

