package typings.atBlueprintjsTable.libEsmCommonGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowIndices extends js.Object {
  var rowIndexEnd: Double
  var rowIndexStart: Double
}

object IRowIndices {
  @scala.inline
  def apply(rowIndexEnd: Double, rowIndexStart: Double): IRowIndices = {
    val __obj = js.Dynamic.literal(rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRowIndices]
  }
}

