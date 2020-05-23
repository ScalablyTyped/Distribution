package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbedView extends js.Object {
  var tabbedView: js.UndefOr[js.Object] = js.undefined
}

object TabbedView {
  @scala.inline
  def apply(tabbedView: js.Object = null): TabbedView = {
    val __obj = js.Dynamic.literal()
    if (tabbedView != null) __obj.updateDynamic("tabbedView")(tabbedView.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedView]
  }
}

