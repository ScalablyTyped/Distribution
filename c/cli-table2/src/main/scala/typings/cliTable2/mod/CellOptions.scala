package typings.cliTable2.mod

import typings.cliTable2.AnonHead
import typings.cliTable2.PartialRecordCharNamestri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellOptions extends js.Object {
  var chars: js.UndefOr[PartialRecordCharNamestri] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var content: CellValue
  var hAlign: js.UndefOr[HorizontalAlignment] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonHead] = js.undefined
  var truncate: js.UndefOr[String] = js.undefined
  var vAlign: js.UndefOr[VerticalAlignment] = js.undefined
}

object CellOptions {
  @scala.inline
  def apply(
    chars: PartialRecordCharNamestri = null,
    colSpan: Int | Double = null,
    content: CellValue = null,
    hAlign: HorizontalAlignment = null,
    rowSpan: Int | Double = null,
    style: AnonHead = null,
    truncate: String = null,
    vAlign: VerticalAlignment = null
  ): CellOptions = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellOptions]
  }
}

