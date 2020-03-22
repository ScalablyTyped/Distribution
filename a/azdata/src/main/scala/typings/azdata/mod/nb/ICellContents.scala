package typings.azdata.mod.nb

import typings.azdata.AnonAzdatacellguid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellContents extends js.Object {
  var cell_type: CellType
  var execution_count: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[AnonAzdatacellguid] = js.undefined
  var outputs: js.UndefOr[js.Array[ICellOutput]] = js.undefined
  var source: String | js.Array[String]
}

object ICellContents {
  @scala.inline
  def apply(
    cell_type: CellType,
    source: String | js.Array[String],
    execution_count: Int | Double = null,
    metadata: AnonAzdatacellguid = null,
    outputs: js.Array[ICellOutput] = null
  ): ICellContents = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellContents]
  }
}

