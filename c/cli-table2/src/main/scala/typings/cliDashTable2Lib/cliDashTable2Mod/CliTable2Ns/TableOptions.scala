package typings
package cliDashTable2Lib.cliDashTable2Mod.CliTable2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var colAligns: js.Array[HorizontalAlignment]
  var colWidths: js.Array[scala.Double | scala.Null]
  var head: js.Array[Cell]
  var rowAligns: js.Array[VerticalAlignment]
  var rowHeights: js.Array[scala.Double | scala.Null]
  var truncate: java.lang.String
  var wordWrap: scala.Boolean
}

object TableOptions {
  @scala.inline
  def apply(
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[scala.Double | scala.Null],
    head: js.Array[Cell],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[scala.Double | scala.Null],
    truncate: java.lang.String,
    wordWrap: scala.Boolean
  ): TableOptions = {
    val __obj = js.Dynamic.literal(colAligns = colAligns, colWidths = colWidths, head = head, rowAligns = rowAligns, rowHeights = rowHeights, truncate = truncate, wordWrap = wordWrap)
  
    __obj.asInstanceOf[TableOptions]
  }
}

