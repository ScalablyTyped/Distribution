package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTabbedView extends js.Object {
  var tabbedView: js.UndefOr[js.Object] = js.undefined
}

object AnonTabbedView {
  @scala.inline
  def apply(tabbedView: js.Object = null): AnonTabbedView = {
    val __obj = js.Dynamic.literal()
    if (tabbedView != null) __obj.updateDynamic("tabbedView")(tabbedView.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabbedView]
  }
}

