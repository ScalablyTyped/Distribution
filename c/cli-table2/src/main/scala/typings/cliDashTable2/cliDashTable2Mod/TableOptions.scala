package typings.cliDashTable2.cliDashTable2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var colAligns: js.Array[HorizontalAlignment]
  var colWidths: js.Array[Double | Null]
  var head: js.Array[Cell]
  var rowAligns: js.Array[VerticalAlignment]
  var rowHeights: js.Array[Double | Null]
  var truncate: String
  var wordWrap: Boolean
}

object TableOptions {
  @scala.inline
  def apply(
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[Double | Null],
    head: js.Array[Cell],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[Double | Null],
    truncate: String,
    wordWrap: Boolean
  ): TableOptions = {
    val __obj = js.Dynamic.literal(colAligns = colAligns, colWidths = colWidths, head = head, rowAligns = rowAligns, rowHeights = rowHeights, truncate = truncate, wordWrap = wordWrap)
  
    __obj.asInstanceOf[TableOptions]
  }
}

