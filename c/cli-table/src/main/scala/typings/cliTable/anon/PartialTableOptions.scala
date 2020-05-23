package typings.cliTable.anon

import typings.cliTable.cliTableStrings.left
import typings.cliTable.cliTableStrings.middle
import typings.cliTable.cliTableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cli-table.cli-table.TableOptions> */
trait PartialTableOptions extends js.Object {
  var chars: js.UndefOr[PartialRecordtoptopmidtop] = js.undefined
  var colAligns: js.UndefOr[js.Array[left | middle | right]] = js.undefined
  var colWidths: js.UndefOr[js.Array[Double]] = js.undefined
  var colors: js.UndefOr[Boolean] = js.undefined
  var head: js.UndefOr[js.Array[String]] = js.undefined
  var style: js.UndefOr[Partialpaddingleftnumberp] = js.undefined
  var truncate: js.UndefOr[String] = js.undefined
}

object PartialTableOptions {
  @scala.inline
  def apply(
    chars: PartialRecordtoptopmidtop = null,
    colAligns: js.Array[left | middle | right] = null,
    colWidths: js.Array[Double] = null,
    colors: js.UndefOr[Boolean] = js.undefined,
    head: js.Array[String] = null,
    style: Partialpaddingleftnumberp = null,
    truncate: String = null
  ): PartialTableOptions = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars.asInstanceOf[js.Any])
    if (colAligns != null) __obj.updateDynamic("colAligns")(colAligns.asInstanceOf[js.Any])
    if (colWidths != null) __obj.updateDynamic("colWidths")(colWidths.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.get.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTableOptions]
  }
}

