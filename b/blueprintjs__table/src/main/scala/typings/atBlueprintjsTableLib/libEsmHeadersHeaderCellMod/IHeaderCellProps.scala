package typings
package atBlueprintjsTableLib.libEsmHeadersHeaderCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderCellProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * The index of the cell in the header. If provided, this will be passed as an argument to any
    * callbacks when they are invoked.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, will apply the active class to the header to indicate it is
    * part of an external operation.
    */
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, the row/column `name` will be replaced with a fixed-height skeleton, and the
    * `resizeHandle` will not be rendered. If passing in additional children to this component, you
    * will also want to conditionally apply `Classes.SKELETON` where appropriate.
    * @default false
    */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A callback that returns an element, like a `<Menu>`, which is displayed by right-clicking
    * anywhere in the header. The callback will receive the cell index if it was provided via
    * props.
    */
  var menuRenderer: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[scala.Double], reactLib.reactMod.Global.JSXNs.Element]
  ] = js.undefined
  /**
    * The name displayed in the header of the row/column.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A `ReorderHandle` React component that allows users to drag-reorder the column header.
    */
  var reorderHandle: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * A `ResizeHandle` React component that allows users to drag-resize the header.
    */
  var resizeHandle: js.UndefOr[atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.ResizeHandle] = js.undefined
  /**
    * CSS styles for the top level element.
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object IHeaderCellProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[scala.Double] => reactLib.reactMod.Global.JSXNs.Element = null,
    name: java.lang.String = null,
    reorderHandle: reactLib.reactMod.Global.JSXNs.Element = null,
    resizeHandle: atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.ResizeHandle = null,
    style: reactLib.reactMod.CSSProperties = null
  ): IHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (name != null) __obj.updateDynamic("name")(name)
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle)
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IHeaderCellProps]
  }
}

