package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProgressBar extends js.Object {
  var progressBar: js.UndefOr[js.Object] = js.undefined
}

object AnonProgressBar {
  @scala.inline
  def apply(progressBar: js.Object = null): AnonProgressBar = {
    val __obj = js.Dynamic.literal()
    if (progressBar != null) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProgressBar]
  }
}

