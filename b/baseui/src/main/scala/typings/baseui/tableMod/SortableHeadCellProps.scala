package typings.baseui.tableMod

import typings.baseui.anon.HeadCell
import typings.baseui.baseuiStrings.ASC
import typings.baseui.baseuiStrings.DESC
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableHeadCellProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var direction: ASC | DESC | Null
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fillClickTarget: js.UndefOr[Boolean] = js.undefined
  var onSort: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[HeadCell] = js.undefined
  var title: String
}

object SortableHeadCellProps {
  @scala.inline
  def apply(
    title: String,
    children: ReactNode = null,
    direction: ASC | DESC = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fillClickTarget: js.UndefOr[Boolean] = js.undefined,
    onSort: () => _ = null,
    overrides: HeadCell = null
  ): SortableHeadCellProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillClickTarget)) __obj.updateDynamic("fillClickTarget")(fillClickTarget.get.asInstanceOf[js.Any])
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction0(onSort))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableHeadCellProps]
  }
}

