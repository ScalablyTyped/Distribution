package typings.cliDashTable2.cliDashTable2Mod

import typings.cliDashTable2.Anon_Border
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInstanceOptions extends TableOptions {
  var chars: Record[CharName, String]
  var style: Anon_Border
}

object TableInstanceOptions {
  @scala.inline
  def apply(
    chars: Record[CharName, String],
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[Double | Null],
    head: js.Array[Cell],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[Double | Null],
    style: Anon_Border,
    truncate: String,
    wordWrap: Boolean
  ): TableInstanceOptions = {
    val __obj = js.Dynamic.literal(chars = chars, colAligns = colAligns, colWidths = colWidths, head = head, rowAligns = rowAligns, rowHeights = rowHeights, style = style, truncate = truncate, wordWrap = wordWrap)
  
    __obj.asInstanceOf[TableInstanceOptions]
  }
}

