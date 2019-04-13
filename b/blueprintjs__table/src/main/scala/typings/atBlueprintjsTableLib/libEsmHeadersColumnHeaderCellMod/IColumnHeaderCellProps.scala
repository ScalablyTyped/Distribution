package typings
package atBlueprintjsTableLib.libEsmHeadersColumnHeaderCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsTableLib.libEsmHeadersColumnHeaderCellMod.IColumnNameProps because var conflicts: name. Inlined nameRenderer */ trait IColumnHeaderCellProps
  extends atBlueprintjsTableLib.libEsmHeadersHeaderCellMod.IHeaderCellProps {
  /**
    * Specifies if the column is reorderable.
    */
  var enableColumnReordering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies if the full column is part of a selection.
    */
  var isColumnSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The icon name or element for the header's menu button.
    * @default "chevron-down"
    */
  var menuIcon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
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
  var nameRenderer: js.UndefOr[
    js.Function2[
      /* name */ java.lang.String, 
      /* index */ js.UndefOr[scala.Double], 
      reactLib.reactMod.ReactElement[atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps]
    ]
  ] = js.undefined
}

object IColumnHeaderCellProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    enableColumnReordering: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    isColumnSelected: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    menuIcon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | reactLib.reactMod.Global.JSXNs.Element = null,
    menuRenderer: /* index */ js.UndefOr[scala.Double] => reactLib.reactMod.Global.JSXNs.Element = null,
    name: java.lang.String = null,
    nameRenderer: (/* name */ java.lang.String, /* index */ js.UndefOr[scala.Double]) => reactLib.reactMod.ReactElement[atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps] = null,
    reorderHandle: reactLib.reactMod.Global.JSXNs.Element = null,
    resizeHandle: atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.ResizeHandle = null,
    style: reactLib.reactMod.CSSProperties = null
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

