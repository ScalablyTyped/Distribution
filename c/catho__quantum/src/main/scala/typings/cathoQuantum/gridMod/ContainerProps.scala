package typings.cathoQuantum.gridMod

import typings.cathoQuantum.anon.BreakpointsComponents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var fluid: js.UndefOr[Boolean] = js.undefined
  var hide: js.UndefOr[BreakpointsType | js.Array[String]] = js.undefined
  var `no-gutters`: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[BreakpointsComponents] = js.undefined
  var withBreakpoints: js.UndefOr[Boolean] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    fluid: js.UndefOr[Boolean] = js.undefined,
    hide: BreakpointsType | js.Array[String] = null,
    `no-gutters`: js.UndefOr[Boolean] = js.undefined,
    theme: BreakpointsComponents = null,
    withBreakpoints: js.UndefOr[Boolean] = js.undefined
  ): ContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.get.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-gutters`)) __obj.updateDynamic("no-gutters")(`no-gutters`.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(withBreakpoints)) __obj.updateDynamic("withBreakpoints")(withBreakpoints.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProps]
  }
}

