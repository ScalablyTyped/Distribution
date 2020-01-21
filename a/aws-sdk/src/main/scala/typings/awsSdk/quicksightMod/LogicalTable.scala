package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalTable extends js.Object {
  /**
    * A display name for the logical table.
    */
  var Alias: LogicalTableAlias = js.native
  /**
    * Transform operations that act on this logical table.
    */
  var DataTransforms: js.UndefOr[TransformOperationList] = js.native
  /**
    * Source of this logical table.
    */
  var Source: LogicalTableSource = js.native
}

object LogicalTable {
  @scala.inline
  def apply(
    Alias: LogicalTableAlias,
    Source: LogicalTableSource,
    DataTransforms: TransformOperationList = null
  ): LogicalTable = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    if (DataTransforms != null) __obj.updateDynamic("DataTransforms")(DataTransforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalTable]
  }
}

