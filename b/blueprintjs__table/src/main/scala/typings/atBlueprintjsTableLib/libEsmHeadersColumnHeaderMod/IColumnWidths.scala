package typings
package atBlueprintjsTableLib.libEsmHeadersColumnHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnWidths extends js.Object {
  var defaultColumnWidth: js.UndefOr[scala.Double] = js.undefined
  var maxColumnWidth: js.UndefOr[scala.Double] = js.undefined
  var minColumnWidth: js.UndefOr[scala.Double] = js.undefined
}

object IColumnWidths {
  @scala.inline
  def apply(
    defaultColumnWidth: scala.Int | scala.Double = null,
    maxColumnWidth: scala.Int | scala.Double = null,
    minColumnWidth: scala.Int | scala.Double = null
  ): IColumnWidths = {
    val __obj = js.Dynamic.literal()
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (maxColumnWidth != null) __obj.updateDynamic("maxColumnWidth")(maxColumnWidth.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnWidths]
  }
}

