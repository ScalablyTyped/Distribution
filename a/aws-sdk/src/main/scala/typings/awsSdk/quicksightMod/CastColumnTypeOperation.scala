package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CastColumnTypeOperation extends js.Object {
  /**
    * Column name.
    */
  var ColumnName: typings.awsSdk.quicksightMod.ColumnName = js.native
  /**
    * When casting a column from string to datetime type, you can supply a string in a format supported by Amazon QuickSight to denote the source data format.
    */
  var Format: js.UndefOr[TypeCastFormat] = js.native
  /**
    * New column data type.
    */
  var NewColumnType: ColumnDataType = js.native
}

object CastColumnTypeOperation {
  @scala.inline
  def apply(ColumnName: ColumnName, NewColumnType: ColumnDataType, Format: TypeCastFormat = null): CastColumnTypeOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], NewColumnType = NewColumnType.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastColumnTypeOperation]
  }
}

