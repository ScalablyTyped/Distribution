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
    large: Int | Double = null,
    `large-offset`: Int | Double = null,
    medium: Int | Double = null,
    `medium-offset`: Int | Double = null,
    `no-gutters`: js.UndefOr[Boolean] = js.undefined,
    small: Int | Double = null,
    `small-offset`: Int | Double = null,
    xlarge: Int | Double = null,
    `xlarge-offset`: Int | Double = null,
    xsmall: Int | Double = null,
    `xsmall-offset`: Int | Double = null
  ): ColProps = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (`large-offset` != null) __obj.updateDynamic("large-offset")(`large-offset`.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (`medium-offset` != null) __obj.updateDynamic("medium-offset")(`medium-offset`.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-gutters`)) __obj.updateDynamic("no-gutters")(`no-gutters`.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (`small-offset` != null) __obj.updateDynamic("small-offset")(`small-offset`.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (`xlarge-offset` != null) __obj.updateDynamic("xlarge-offset")(`xlarge-offset`.asInstanceOf[js.Any])
    if (xsmall != null) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    if (`xsmall-offset` != null) __obj.updateDynamic("xsmall-offset")(`xsmall-offset`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

