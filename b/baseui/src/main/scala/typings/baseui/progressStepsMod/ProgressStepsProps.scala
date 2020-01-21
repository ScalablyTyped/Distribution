package typings.baseui.progressStepsMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStepsProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var current: js.UndefOr[Double] = js.undefined
  var overrides: js.UndefOr[ProgressStepsOverrides] = js.undefined
}

object ProgressStepsProps {
  @scala.inline
  def apply(children: ReactNode = null, current: Int | Double = null, overrides: ProgressStepsOverrides = null): ProgressStepsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressStepsProps]
  }
}

