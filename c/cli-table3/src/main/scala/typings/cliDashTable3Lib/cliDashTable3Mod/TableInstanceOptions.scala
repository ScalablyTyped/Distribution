package typings
package cliDashTable3Lib.cliDashTable3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInstanceOptions extends TableOptions {
  var chars: stdLib.Record[CharName, java.lang.String]
  var style: cliDashTable3Lib.Anon_Border
}

object TableInstanceOptions {
  @scala.inline
  def apply(
    chars: stdLib.Record[CharName, java.lang.String],
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[scala.Double | scala.Null],
    head: js.Array[java.lang.String],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[scala.Double | scala.Null],
    style: cliDashTable3Lib.Anon_Border,
    truncate: java.lang.String,
    wordWrap: scala.Boolean
  ): TableInstanceOptions = {
    val __obj = js.Dynamic.literal(chars = chars, colAligns = colAligns, colWidths = colWidths, head = head, rowAligns = rowAligns, rowHeights = rowHeights, style = style, truncate = truncate, wordWrap = wordWrap)
  
    __obj.asInstanceOf[TableInstanceOptions]
  }
}

