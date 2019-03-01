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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colAligns")(colAligns)
    __obj.updateDynamic("colWidths")(colWidths)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("rowAligns")(rowAligns)
    __obj.updateDynamic("rowHeights")(rowHeights)
    __obj.updateDynamic("truncate")(truncate)
    __obj.updateDynamic("wordWrap")(wordWrap)
    __obj.asInstanceOf[TableOptions]
  }
}

