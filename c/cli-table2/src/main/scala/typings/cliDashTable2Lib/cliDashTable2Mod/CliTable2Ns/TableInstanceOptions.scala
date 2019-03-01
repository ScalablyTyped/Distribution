package typings
package cliDashTable2Lib.cliDashTable2Mod.CliTable2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInstanceOptions extends TableOptions {
  var chars: stdLib.Record[CharName, java.lang.String]
  var style: cliDashTable2Lib.Anon_Border
}

object TableInstanceOptions {
  @scala.inline
  def apply(
    chars: stdLib.Record[CharName, java.lang.String],
    colAligns: js.Array[HorizontalAlignment],
    colWidths: js.Array[scala.Double | scala.Null],
    head: js.Array[Cell],
    rowAligns: js.Array[VerticalAlignment],
    rowHeights: js.Array[scala.Double | scala.Null],
    style: cliDashTable2Lib.Anon_Border,
    truncate: java.lang.String,
    wordWrap: scala.Boolean
  ): TableInstanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chars")(chars)
    __obj.updateDynamic("colAligns")(colAligns)
    __obj.updateDynamic("colWidths")(colWidths)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("rowAligns")(rowAligns)
    __obj.updateDynamic("rowHeights")(rowHeights)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("truncate")(truncate)
    __obj.updateDynamic("wordWrap")(wordWrap)
    __obj.asInstanceOf[TableInstanceOptions]
  }
}

