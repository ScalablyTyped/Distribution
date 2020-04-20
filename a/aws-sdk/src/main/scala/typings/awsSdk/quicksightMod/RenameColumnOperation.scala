package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameColumnOperation extends js.Object {
  /**
    * The name of the column to be renamed.
    */
  var ColumnName: typings.awsSdk.quicksightMod.ColumnName = js.native
  /**
    * The new name for the column.
    */
  var NewColumnName: ColumnName = js.native
}

object RenameColumnOperation {
  @scala.inline
  def apply(ColumnName: ColumnName, NewColumnName: ColumnName): RenameColumnOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], NewColumnName = NewColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameColumnOperation]
  }
}

