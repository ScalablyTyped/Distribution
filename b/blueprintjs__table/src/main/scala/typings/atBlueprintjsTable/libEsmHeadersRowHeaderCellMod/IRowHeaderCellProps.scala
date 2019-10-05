package typings.atBlueprintjsTable.libEsmHeadersRowHeaderCellMod

import typings.atBlueprintjsTable.libEsmHeadersHeaderCellMod.IHeaderCellProps
import typings.atBlueprintjsTable.libEsmInteractionsResizeHandleMod.ResizeHandle
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the row is reorderable.
    */
  var enableRowReordering: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the full row is part of a selection.
    */
  var isRowSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback to override the default name rendering behavior. The default
    * behavior is to simply use the `RowHeaderCell`s name prop.
    *
    * This render callback can be used, for example, to provide a
    * `EditableName` component for editing row names.
    *
    * The callback will also receive the row index if an `index` was originally
    * provided via props.
    */
  var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.undefined
}

object IRowHeaderCellProps {
  @scala.inline
  def apply(
    className: String = null,
    enableRowReordering: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isRowSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[Double] => Element = null,
    name: String = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement = null,
    reorderHandle: Element = null,
    resizeHandle: ResizeHandle = null,
    style: CSSProperties = null
  ): IRowHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isRowSelected)) __obj.updateDynamic("isRowSelected")(isRowSelected)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2(nameRenderer))
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle)
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IRowHeaderCellProps]
  }
}

