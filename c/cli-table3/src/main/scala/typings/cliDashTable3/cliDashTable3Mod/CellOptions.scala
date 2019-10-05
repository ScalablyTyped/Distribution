package typings.cliDashTable3.cliDashTable3Mod

import typings.cliDashTable3.Anon_BorderHead
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellOptions extends js.Object {
  var chars: js.UndefOr[Partial[Record[CharName, String]]] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var content: CellValue
  var hAlign: js.UndefOr[HorizontalAlignment] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Anon_BorderHead] = js.undefined
  var truncate: js.UndefOr[String] = js.undefined
  var vAlign: js.UndefOr[VerticalAlignment] = js.undefined
}

object CellOptions {
  @scala.inline
  def apply(
    chars: Partial[Record[CharName, String]] = null,
    colSpan: Int | Double = null,
    content: CellValue = null,
    hAlign: HorizontalAlignment = null,
    rowSpan: Int | Double = null,
    style: Anon_BorderHead = null,
    truncate: String = null,
    vAlign: VerticalAlignment = null
  ): CellOptions = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (truncate != null) __obj.updateDynamic("truncate")(truncate)
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign)
    __obj.asInstanceOf[CellOptions]
  }
}

