package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentsProgressBar extends js.Object {
  var components: js.UndefOr[ProgressBar] = js.undefined
}

object ComponentsProgressBar {
  @scala.inline
  def apply(components: ProgressBar = null): ComponentsProgressBar = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsProgressBar]
  }
}

