package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlert extends js.Object {
  var alert: js.UndefOr[js.Object] = js.undefined
  var button: js.UndefOr[js.Object] = js.undefined
}

object AnonAlert {
  @scala.inline
  def apply(alert: js.Object = null, button: js.Object = null): AnonAlert = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlert]
  }
}

