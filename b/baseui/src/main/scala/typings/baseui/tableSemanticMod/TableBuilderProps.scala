package typings.baseui.tableSemanticMod

import typings.baseui.baseuiStrings.ASC
import typings.baseui.baseuiStrings.DESC
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBuilderProps[RowT] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var data: js.Array[RowT]
  var horizontalScrollWidth: js.UndefOr[String] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* columnId */ String, Unit]] = js.undefined
  var overrides: js.UndefOr[BuilderOverrides] = js.undefined
  var sortColumn: js.UndefOr[String | Null] = js.undefined
  var sortOrder: js.UndefOr[ASC | DESC | Null] = js.undefined
}

object TableBuilderProps {
  @scala.inline
  def apply[RowT](
    data: js.Array[RowT],
    children: ReactNode = null,
    horizontalScrollWidth: String = null,
    onSort: /* columnId */ String => Unit = null,
    overrides: BuilderOverrides = null,
    sortColumn: js.UndefOr[Null | String] = js.undefined,
    sortOrder: js.UndefOr[Null | ASC | DESC] = js.undefined
  ): TableBuilderProps[RowT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sortColumn)) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOrder)) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBuilderProps[RowT]]
  }
}

