package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var blue: js.UndefOr[Double] = js.undefined
  var green: js.UndefOr[Double] = js.undefined
  var maximumAlpha: js.UndefOr[Double] = js.undefined
  var maximumBlue: js.UndefOr[Double] = js.undefined
  var maximumGreen: js.UndefOr[Double] = js.undefined
  var maximumRed: js.UndefOr[Double] = js.undefined
  var minimumAlpha: js.UndefOr[Double] = js.undefined
  var minimumBlue: js.UndefOr[Double] = js.undefined
  var minimumGreen: js.UndefOr[Double] = js.undefined
  var minimumRed: js.UndefOr[Double] = js.undefined
  var red: js.UndefOr[Double] = js.undefined
}

object AnonAlpha {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    blue: Int | Double = null,
    green: Int | Double = null,
    maximumAlpha: Int | Double = null,
    maximumBlue: Int | Double = null,
    maximumGreen: Int | Double = null,
    maximumRed: Int | Double = null,
    minimumAlpha: Int | Double = null,
    minimumBlue: Int | Double = null,
    minimumGreen: Int | Double = null,
    minimumRed: Int | Double = null,
    red: Int | Double = null
  ): AnonAlpha = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (maximumAlpha != null) __obj.updateDynamic("maximumAlpha")(maximumAlpha.asInstanceOf[js.Any])
    if (maximumBlue != null) __obj.updateDynamic("maximumBlue")(maximumBlue.asInstanceOf[js.Any])
    if (maximumGreen != null) __obj.updateDynamic("maximumGreen")(maximumGreen.asInstanceOf[js.Any])
    if (maximumRed != null) __obj.updateDynamic("maximumRed")(maximumRed.asInstanceOf[js.Any])
    if (minimumAlpha != null) __obj.updateDynamic("minimumAlpha")(minimumAlpha.asInstanceOf[js.Any])
    if (minimumBlue != null) __obj.updateDynamic("minimumBlue")(minimumBlue.asInstanceOf[js.Any])
    if (minimumGreen != null) __obj.updateDynamic("minimumGreen")(minimumGreen.asInstanceOf[js.Any])
    if (minimumRed != null) __obj.updateDynamic("minimumRed")(minimumRed.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlpha]
  }
}

