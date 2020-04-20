package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableMetadata extends js.Object {
  var columns: ColumnMetadata
}

object TableMetadata {
  @scala.inline
  def apply(columns: ColumnMetadata): TableMetadata = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
}

