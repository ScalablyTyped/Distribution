package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alpha extends js.Object {
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

object Alpha {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    blue: js.UndefOr[Double] = js.undefined,
    green: js.UndefOr[Double] = js.undefined,
    maximumAlpha: js.UndefOr[Double] = js.undefined,
    maximumBlue: js.UndefOr[Double] = js.undefined,
    maximumGreen: js.UndefOr[Double] = js.undefined,
    maximumRed: js.UndefOr[Double] = js.undefined,
    minimumAlpha: js.UndefOr[Double] = js.undefined,
    minimumBlue: js.UndefOr[Double] = js.undefined,
    minimumGreen: js.UndefOr[Double] = js.undefined,
    minimumRed: js.UndefOr[Double] = js.undefined,
    red: js.UndefOr[Double] = js.undefined
  ): Alpha = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumAlpha)) __obj.updateDynamic("maximumAlpha")(maximumAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumBlue)) __obj.updateDynamic("maximumBlue")(maximumBlue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumGreen)) __obj.updateDynamic("maximumGreen")(maximumGreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumRed)) __obj.updateDynamic("maximumRed")(maximumRed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumAlpha)) __obj.updateDynamic("minimumAlpha")(minimumAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumBlue)) __obj.updateDynamic("minimumBlue")(minimumBlue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumGreen)) __obj.updateDynamic("minimumGreen")(minimumGreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumRed)) __obj.updateDynamic("minimumRed")(minimumRed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
}

