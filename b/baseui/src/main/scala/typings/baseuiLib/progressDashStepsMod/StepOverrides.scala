package typings
package baseuiLib.progressDashStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepOverrides extends js.Object {
  var Content: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Description: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Icon: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var InnerIcon: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Tail: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Title: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object StepOverrides {
  @scala.inline
  def apply(
    Content: baseuiLib.Override[_] = null,
    Description: baseuiLib.Override[_] = null,
    Icon: baseuiLib.Override[_] = null,
    InnerIcon: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null,
    Tail: baseuiLib.Override[_] = null,
    Title: baseuiLib.Override[_] = null
  ): StepOverrides = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Icon != null) __obj.updateDynamic("Icon")(Icon.asInstanceOf[js.Any])
    if (InnerIcon != null) __obj.updateDynamic("InnerIcon")(InnerIcon.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (Tail != null) __obj.updateDynamic("Tail")(Tail.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepOverrides]
  }
}

