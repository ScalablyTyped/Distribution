package typings
package cliDashTable3Lib.cliDashTable3Mod.CliTable3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellOptions extends js.Object {
  var chars: js.UndefOr[stdLib.Partial[stdLib.Record[CharName, java.lang.String]]] = js.undefined
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var content: CellValue
  var hAlign: js.UndefOr[HorizontalAlignment] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[cliDashTable3Lib.Anon_BorderHead] = js.undefined
  var truncate: js.UndefOr[java.lang.String] = js.undefined
  var vAlign: js.UndefOr[VerticalAlignment] = js.undefined
}

object CellOptions {
  @scala.inline
  def apply(
    content: CellValue,
    chars: stdLib.Partial[stdLib.Record[CharName, java.lang.String]] = null,
    colSpan: scala.Int | scala.Double = null,
    hAlign: HorizontalAlignment = null,
    rowSpan: scala.Int | scala.Double = null,
    style: cliDashTable3Lib.Anon_BorderHead = null,
    truncate: java.lang.String = null,
    vAlign: VerticalAlignment = null
  ): CellOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (chars != null) __obj.updateDynamic("chars")(chars)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (truncate != null) __obj.updateDynamic("truncate")(truncate)
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign)
    __obj.asInstanceOf[CellOptions]
  }
}

