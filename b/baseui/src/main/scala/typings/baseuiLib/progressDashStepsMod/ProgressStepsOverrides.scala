package typings
package baseuiLib.progressDashStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStepsOverrides extends js.Object {
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object ProgressStepsOverrides {
  @scala.inline
  def apply(Root: baseuiLib.Override[_] = null): ProgressStepsOverrides = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressStepsOverrides]
  }
}

