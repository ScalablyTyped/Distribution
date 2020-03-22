package typings.cliTable3.mod

import typings.cliTable3.AnonBorder
import typings.cliTable3.RecordCharNamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInstanceOptions extends TableOptions {
  var chars: RecordCharNamestring
  var style: AnonBorder
}

object TableInstanceOptions {
  @scala.inline
  def apply(
    chars: RecordCharNamestring,
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[Double | Null],
    head: js.Array[String],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[Double | Null],
    style: AnonBorder,
    truncate: String,
    wordWrap: Boolean
  ): TableInstanceOptions = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableInstanceOptions]
  }
}

