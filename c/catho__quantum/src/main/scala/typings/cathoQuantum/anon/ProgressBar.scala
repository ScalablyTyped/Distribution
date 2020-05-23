package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBar extends js.Object {
  var progressBar: js.UndefOr[js.Object] = js.undefined
}

object ProgressBar {
  @scala.inline
  def apply(progressBar: js.Object = null): ProgressBar = {
    val __obj = js.Dynamic.literal()
    if (progressBar != null) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBar]
  }
}

