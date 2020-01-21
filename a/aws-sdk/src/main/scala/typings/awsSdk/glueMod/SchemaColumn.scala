package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaColumn extends js.Object {
  /**
    * The type of data in the column.
    */
  var DataType: js.UndefOr[ColumnTypeString] = js.native
  /**
    * The name of the column.
    */
  var Name: js.UndefOr[ColumnNameString] = js.native
}

object SchemaColumn {
  @scala.inline
  def apply(DataType: ColumnTypeString = null, Name: ColumnNameString = null): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    if (DataType != null) __obj.updateDynamic("DataType")(DataType.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaColumn]
  }
}

