package typings.cathoQuantum.gridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps extends js.Object {
  var hide: js.UndefOr[BreakpointsType | js.Array[BreakpointsType]] = js.undefined
  var large: js.UndefOr[Double] = js.undefined
  var `large-offset`: js.UndefOr[Double] = js.undefined
  var medium: js.UndefOr[Double] = js.undefined
  var `medium-offset`: js.UndefOr[Double] = js.undefined
  var `no-gutters`: js.UndefOr[Boolean] = js.undefined
  var small: js.UndefOr[Double] = js.undefined
  var `small-offset`: js.UndefOr[Double] = js.undefined
  var xlarge: js.UndefOr[Double] = js.undefined
  var `xlarge-offset`: js.UndefOr[Double] = js.undefined
  var xsmall: js.UndefOr[Double] = js.undefined
  var `xsmall-offset`: js.UndefOr[Double] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    hide: BreakpointsType | js.Array[BreakpointsType] = null,
    large: js.UndefOr[Double] = js.undefined,
    `large-offset`: js.UndefOr[Double] = js.undefined,
    medium: js.UndefOr[Double] = js.undefined,
    `medium-offset`: js.UndefOr[Double] = js.undefined,
    `no-gutters`: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Double] = js.undefined,
    `small-offset`: js.UndefOr[Double] = js.undefined,
    xlarge: js.UndefOr[Double] = js.undefined,
    `xlarge-offset`: js.UndefOr[Double] = js.undefined,
    xsmall: js.UndefOr[Double] = js.undefined,
    `xsmall-offset`: js.UndefOr[Double] = js.undefined
  ): ColProps = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`large-offset`)) __obj.updateDynamic("large-offset")(`large-offset`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(medium)) __obj.updateDynamic("medium")(medium.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`medium-offset`)) __obj.updateDynamic("medium-offset")(`medium-offset`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-gutters`)) __obj.updateDynamic("no-gutters")(`no-gutters`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`small-offset`)) __obj.updateDynamic("small-offset")(`small-offset`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xlarge)) __obj.updateDynamic("xlarge")(xlarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`xlarge-offset`)) __obj.updateDynamic("xlarge-offset")(`xlarge-offset`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xsmall)) __obj.updateDynamic("xsmall")(xsmall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`xsmall-offset`)) __obj.updateDynamic("xsmall-offset")(`xsmall-offset`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

