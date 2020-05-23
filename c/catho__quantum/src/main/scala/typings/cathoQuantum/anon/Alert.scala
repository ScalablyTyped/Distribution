package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert extends js.Object {
  var alert: js.UndefOr[js.Object] = js.undefined
  var button: js.UndefOr[js.Object] = js.undefined
}

object Alert {
  @scala.inline
  def apply(alert: js.Object = null, button: js.Object = null): Alert = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

