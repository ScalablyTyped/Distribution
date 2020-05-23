package typings.blueprintjsTable.headerCellMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.resizeHandleMod.ResizeHandle
import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderCellProps extends IProps {
  /**
    * The index of the cell in the header. If provided, this will be passed as an argument to any
    * callbacks when they are invoked.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, will apply the active class to the header to indicate it is
    * part of an external operation.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the row/column `name` will be replaced with a fixed-height skeleton, and the
    * `resizeHandle` will not be rendered. If passing in additional children to this component, you
    * will also want to conditionally apply `Classes.SKELETON` where appropriate.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback that returns an element, like a `<Menu>`, which is displayed by right-clicking
    * anywhere in the header. The callback will receive the cell index if it was provided via
    * props.
    */
  var menuRenderer: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Element]] = js.undefined
  /**
    * The name displayed in the header of the row/column.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A `ReorderHandle` React component that allows users to drag-reorder the column header.
    */
  var reorderHandle: js.UndefOr[Element] = js.undefined
  /**
    * A `ResizeHandle` React component that allows users to drag-resize the header.
    */
  var resizeHandle: js.UndefOr[ResizeHandle] = js.undefined
  /**
    * CSS styles for the top level element.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object IHeaderCellProps {
  @scala.inline
  def apply(
    className: String = null,
    index: js.UndefOr[Double] = js.undefined,
    isActive: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[Double] => Element = null,
    name: String = null,
    reorderHandle: Element = null,
    resizeHandle: ResizeHandle = null,
    style: CSSProperties = null
  ): IHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.asInstanceOf[js.Any])
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeaderCellProps]
  }
}

