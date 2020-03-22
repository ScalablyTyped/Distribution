package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentsAnonProgressBar extends js.Object {
  var components: js.UndefOr[AnonProgressBar] = js.undefined
}

object AnonComponentsAnonProgressBar {
  @scala.inline
  def apply(components: AnonProgressBar = null): AnonComponentsAnonProgressBar = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentsAnonProgressBar]
  }
}

