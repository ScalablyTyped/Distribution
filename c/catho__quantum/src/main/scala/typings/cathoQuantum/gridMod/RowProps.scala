package typings.cathoQuantum.gridMod

import typings.cathoQuantum.anon.`7`
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  var children: js.Array[ReactNode] | ReactNode
  var hide: js.UndefOr[BreakpointsType | js.Array[BreakpointsType]] = js.undefined
  var `no-gutters`: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[`7`] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    hide: BreakpointsType | js.Array[BreakpointsType] = null,
    `no-gutters`: js.UndefOr[Boolean] = js.undefined,
    theme: `7` = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-gutters`)) __obj.updateDynamic("no-gutters")(`no-gutters`.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

