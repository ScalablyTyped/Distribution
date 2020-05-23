package typings.blueprintjsTable.headerCellMod

import typings.blueprintjsTable.resizeHandleMod.ResizeHandle
import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInternalHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the cell is selected.
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object IInternalHeaderCellProps {
  @scala.inline
  def apply(
    className: String = null,
    index: js.UndefOr[Double] = js.undefined,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[Double] => Element = null,
    name: String = null,
    reorderHandle: Element = null,
    resizeHandle: ResizeHandle = null,
    style: CSSProperties = null
  ): IInternalHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.asInstanceOf[js.Any])
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInternalHeaderCellProps]
  }
}

