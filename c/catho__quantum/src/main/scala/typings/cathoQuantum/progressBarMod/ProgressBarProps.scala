package typings.cathoQuantum.progressBarMod

import typings.cathoQuantum.anon.ComponentsProgressBar
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var progressPercent: js.UndefOr[Double] = js.undefined
  var progressText: js.UndefOr[Double] = js.undefined
  var skin: js.UndefOr[neutral | primary | secondary] = js.undefined
  var theme: js.UndefOr[ComponentsProgressBar] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    height: String = null,
    label: String = null,
    progressPercent: js.UndefOr[Double] = js.undefined,
    progressText: js.UndefOr[Double] = js.undefined,
    skin: neutral | primary | secondary = null,
    theme: ComponentsProgressBar = null,
    width: String = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(progressPercent)) __obj.updateDynamic("progressPercent")(progressPercent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressText)) __obj.updateDynamic("progressText")(progressText.get.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

