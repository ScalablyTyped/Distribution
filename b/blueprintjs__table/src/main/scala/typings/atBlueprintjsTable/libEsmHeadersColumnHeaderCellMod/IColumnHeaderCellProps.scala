package typings.atBlueprintjsTable.libEsmHeadersColumnHeaderCellMod

import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.atBlueprintjsTable.libEsmHeadersHeaderCellMod.IHeaderCellProps
import typings.atBlueprintjsTable.libEsmInteractionsResizeHandleMod.ResizeHandle
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsTable.libEsmHeadersColumnHeaderCellMod.IColumnNameProps because var conflicts: name. Inlined nameRenderer */ trait IColumnHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the column is reorderable.
    */
  var enableColumnReordering: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies if the full column is part of a selection.
    */
  var isColumnSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * The icon name or element for the header's menu button.
    * @default "chevron-down"
    */
  var menuIcon: js.UndefOr[IconName | Element] = js.undefined
  /**
    * A callback to override the default name rendering behavior. The default
    * behavior is to simply use the `ColumnHeaderCell`s name prop.
    *
    * This render callback can be used, for example, to provide a
    * `EditableName` component for editing column names.
    *
    * If you define this callback, we recommend you also set
    * `<Table enableColumnInteractionBar={true}>` to avoid issues with menus or selection.
    *
    * The callback will also receive the column index if an `index` was originally
    * provided via props.
    */
  var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.undefined
}

object IColumnHeaderCellProps {
  @scala.inline
  def apply(
    className: String = null,
    enableColumnReordering: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isColumnSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuIcon: IconName | Element = null,
    menuRenderer: /* index */ js.UndefOr[Double] => Element = null,
    name: String = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement = null,
    reorderHandle: Element = null,
    resizeHandle: ResizeHandle = null,
    style: CSSProperties = null
  ): IColumnHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(enableColumnReordering)) __obj.updateDynamic("enableColumnReordering")(enableColumnReordering)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isColumnSelected)) __obj.updateDynamic("isColumnSelected")(isColumnSelected)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (menuIcon != null) __obj.updateDynamic("menuIcon")(menuIcon.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2(nameRenderer))
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle)
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IColumnHeaderCellProps]
  }
}

