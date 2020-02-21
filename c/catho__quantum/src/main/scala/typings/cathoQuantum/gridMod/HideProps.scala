package typings.cathoQuantum.gridMod

import typings.cathoQuantum.AnonBreakpointsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideProps extends js.Object {
  var large: js.UndefOr[Boolean] = js.undefined
  var medium: js.UndefOr[Boolean] = js.undefined
  var small: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[AnonBreakpointsObject] = js.undefined
  var xlarge: js.UndefOr[Boolean] = js.undefined
  var xsmall: js.UndefOr[Boolean] = js.undefined
}

object HideProps {
  @scala.inline
  def apply(
    large: js.UndefOr[Boolean] = js.undefined,
    medium: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    theme: AnonBreakpointsObject = null,
    xlarge: js.UndefOr[Boolean] = js.undefined,
    xsmall: js.UndefOr[Boolean] = js.undefined
  ): HideProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (!js.isUndefined(medium)) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(xlarge)) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (!js.isUndefined(xsmall)) __obj.updateDynamic("xsmall")(xsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideProps]
  }
}

