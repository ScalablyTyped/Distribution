package typings.cathoQuantum.progressBarMod

import typings.cathoQuantum.AnonComponentsAnonProgressBar
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
  var theme: js.UndefOr[AnonComponentsAnonProgressBar] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    height: String = null,
    label: String = null,
    progressPercent: Int | Double = null,
    progressText: Int | Double = null,
    skin: neutral | primary | secondary = null,
    theme: AnonComponentsAnonProgressBar = null,
    width: String = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (progressPercent != null) __obj.updateDynamic("progressPercent")(progressPercent.asInstanceOf[js.Any])
    if (progressText != null) __obj.updateDynamic("progressText")(progressText.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

