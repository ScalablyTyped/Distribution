package typings.cliTable3.mod

import typings.cliTable3.AnonBorder
import typings.cliTable3.PartialRecordCharNamestri
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<cli-table3.cli-table3.TableOptions> */
trait TableConstructorOptions extends js.Object {
  var chars: js.UndefOr[PartialRecordCharNamestri] = js.undefined
  var colAligns: js.UndefOr[js.Array[HorizontalAlignment]] = js.undefined
  var colWidths: js.UndefOr[js.Array[Double | Null]] = js.undefined
  var head: js.UndefOr[js.Array[String]] = js.undefined
  var rowAligns: js.UndefOr[js.Array[VerticalAlignment]] = js.undefined
  var rowHeights: js.UndefOr[js.Array[Double | Null]] = js.undefined
  var style: js.UndefOr[Partial[AnonBorder]] = js.undefined
  var truncate: js.UndefOr[String] = js.undefined
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}

object TableConstructorOptions {
  @scala.inline
  def apply(
    chars: PartialRecordCharNamestri = null,
    colAligns: js.Array[HorizontalAlignment] = null,
    colWidths: js.Array[Double | Null] = null,
    head: js.Array[String] = null,
    rowAligns: js.Array[VerticalAlignment] = null,
    rowHeights: js.Array[Double | Null] = null,
    style: Partial[AnonBorder] = null,
    truncate: String = null,
    wordWrap: js.UndefOr[Boolean] = js.undefined
  ): TableConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars.asInstanceOf[js.Any])
    if (colAligns != null) __obj.updateDynamic("colAligns")(colAligns.asInstanceOf[js.Any])
    if (colWidths != null) __obj.updateDynamic("colWidths")(colWidths.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (rowAligns != null) __obj.updateDynamic("rowAligns")(rowAligns.asInstanceOf[js.Any])
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableConstructorOptions]
  }
}

