package typings.cliDashColor.columnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsOptions extends js.Object {
  /**
    * columns: Per column customizations, as e.g. `[{ align: 'right' }, null, { align: 'left' }]`
    */
  var columns: js.UndefOr[js.Array[ColumnOptions | Null]] = js.undefined
  /**
    *  Custom colums separator (defaults to `|`)
    */
  var sep: js.UndefOr[String] = js.undefined
}

object ColumnsOptions {
  @scala.inline
  def apply(columns: js.Array[ColumnOptions | Null] = null, sep: String = null): ColumnsOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsOptions]
  }
}

