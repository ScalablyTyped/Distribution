package typings
package baseuiLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableHeadCellProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var direction: baseuiLib.baseuiLibStrings.ASC | baseuiLib.baseuiLibStrings.DESC | scala.Null
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onSort: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[baseuiLib.Anon_HeadCell] = js.undefined
  var title: java.lang.String
}

object SortableHeadCellProps {
  @scala.inline
  def apply(
    title: java.lang.String,
    children: reactLib.reactMod.ReactNode = null,
    direction: baseuiLib.baseuiLibStrings.ASC | baseuiLib.baseuiLibStrings.DESC = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onSort: () => _ = null,
    overrides: baseuiLib.Anon_HeadCell = null
  ): SortableHeadCellProps = {
    val __obj = js.Dynamic.literal(title = title)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction0(onSort))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[SortableHeadCellProps]
  }
}

