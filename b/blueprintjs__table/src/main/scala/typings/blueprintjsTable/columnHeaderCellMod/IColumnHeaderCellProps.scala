package typings.blueprintjsTable.columnHeaderCellMod

import typings.blueprintjsIcons.iconNameMod.IconName
import typings.blueprintjsTable.headerCellMod.IHeaderCellProps
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsTable.columnHeaderCellMod.IColumnNameProps because var conflicts: name. Inlined nameRenderer */ @js.native
trait IColumnHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the column is reorderable.
    */
  var enableColumnReordering: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the full column is part of a selection.
    */
  var isColumnSelected: js.UndefOr[Boolean] = js.native
  /**
    * The icon name or element for the header's menu button.
    * @default "chevron-down"
    */
  var menuIcon: js.UndefOr[IconName | Element] = js.native
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
  var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.native
}

object IColumnHeaderCellProps {
  @scala.inline
  def apply(): IColumnHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnHeaderCellProps]
  }
  @scala.inline
  implicit class IColumnHeaderCellPropsOps[Self <: IColumnHeaderCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnableColumnReordering(value: Boolean): Self = this.set("enableColumnReordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColumnReordering: Self = this.set("enableColumnReordering", js.undefined)
    @scala.inline
    def setIsColumnSelected(value: Boolean): Self = this.set("isColumnSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsColumnSelected: Self = this.set("isColumnSelected", js.undefined)
    @scala.inline
    def setMenuIcon(value: IconName | Element): Self = this.set("menuIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIcon: Self = this.set("menuIcon", js.undefined)
    @scala.inline
    def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = this.set("nameRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNameRenderer: Self = this.set("nameRenderer", js.undefined)
  }
  
}

