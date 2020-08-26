package typings.blueprintjsTable.columnHeaderCellMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnNameProps extends js.Object {
  /**
    * The name displayed in the header of the column.
    */
  var name: js.UndefOr[String] = js.native
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

object IColumnNameProps {
  @scala.inline
  def apply(): IColumnNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnNameProps]
  }
  @scala.inline
  implicit class IColumnNamePropsOps[Self <: IColumnNameProps] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = this.set("nameRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNameRenderer: Self = this.set("nameRenderer", js.undefined)
  }
  
}

