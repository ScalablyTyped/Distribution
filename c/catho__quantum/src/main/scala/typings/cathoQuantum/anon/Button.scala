package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var button: js.UndefOr[js.Object] = js.undefined
}

object Button {
  @scala.inline
  def apply(button: js.Object = null): Button = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

