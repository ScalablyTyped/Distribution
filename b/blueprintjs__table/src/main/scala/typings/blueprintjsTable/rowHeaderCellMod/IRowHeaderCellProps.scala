package typings.blueprintjsTable.rowHeaderCellMod

import typings.blueprintjsTable.headerCellMod.IHeaderCellProps
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the row is reorderable.
    */
  var enableRowReordering: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the full row is part of a selection.
    */
  var isRowSelected: js.UndefOr[Boolean] = js.native
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
  var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.native
}

object IRowHeaderCellProps {
  @scala.inline
  def apply(): IRowHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowHeaderCellProps]
  }
  @scala.inline
  implicit class IRowHeaderCellPropsOps[Self <: IRowHeaderCellProps] (val x: Self) extends AnyVal {
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
    def setEnableRowReordering(value: Boolean): Self = this.set("enableRowReordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowReordering: Self = this.set("enableRowReordering", js.undefined)
    @scala.inline
    def setIsRowSelected(value: Boolean): Self = this.set("isRowSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRowSelected: Self = this.set("isRowSelected", js.undefined)
    @scala.inline
    def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = this.set("nameRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNameRenderer: Self = this.set("nameRenderer", js.undefined)
  }
  
}

