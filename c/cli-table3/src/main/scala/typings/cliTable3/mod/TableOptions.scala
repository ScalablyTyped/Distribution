package typings.cliTable3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var colAligns: js.Array[HorizontalAlignment]
  var colWidths: js.Array[Double | Null]
  var head: js.Array[String]
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
    head: js.Array[String],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[Double | Null],
    truncate: String,
    wordWrap: Boolean
  ): TableOptions = {
    val __obj = js.Dynamic.literal(colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableOptions]
  }
}

