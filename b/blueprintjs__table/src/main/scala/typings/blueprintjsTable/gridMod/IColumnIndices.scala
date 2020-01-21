package typings.blueprintjsTable.gridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnIndices extends js.Object {
  var columnIndexEnd: Double
  var columnIndexStart: Double
}

object IColumnIndices {
  @scala.inline
  def apply(columnIndexEnd: Double, columnIndexStart: Double): IColumnIndices = {
    val __obj = js.Dynamic.literal(columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColumnIndices]
  }
}

