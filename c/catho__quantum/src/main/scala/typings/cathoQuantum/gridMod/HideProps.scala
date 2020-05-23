package typings.cathoQuantum.gridMod

import typings.cathoQuantum.anon.BreakpointsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideProps extends js.Object {
  var large: js.UndefOr[Boolean] = js.undefined
  var medium: js.UndefOr[Boolean] = js.undefined
  var small: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[BreakpointsObject] = js.undefined
  var xlarge: js.UndefOr[Boolean] = js.undefined
  var xsmall: js.UndefOr[Boolean] = js.undefined
}

object HideProps {
  @scala.inline
  def apply(
    large: js.UndefOr[Boolean] = js.undefined,
    medium: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    theme: BreakpointsObject = null,
    xlarge: js.UndefOr[Boolean] = js.undefined,
    xsmall: js.UndefOr[Boolean] = js.undefined
  ): HideProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.get.asInstanceOf[js.Any])
    if (!js.isUndefined(medium)) __obj.updateDynamic("medium")(medium.get.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(xlarge)) __obj.updateDynamic("xlarge")(xlarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xsmall)) __obj.updateDynamic("xsmall")(xsmall.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideProps]
  }
}

