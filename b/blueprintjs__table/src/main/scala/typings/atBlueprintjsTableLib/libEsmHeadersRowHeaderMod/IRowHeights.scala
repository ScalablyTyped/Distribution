package typings
package atBlueprintjsTableLib.libEsmHeadersRowHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowHeights extends js.Object {
  var defaultRowHeight: js.UndefOr[scala.Double] = js.undefined
  var maxRowHeight: js.UndefOr[scala.Double] = js.undefined
  var minRowHeight: js.UndefOr[scala.Double] = js.undefined
}

object IRowHeights {
  @scala.inline
  def apply(
    defaultRowHeight: scala.Int | scala.Double = null,
    maxRowHeight: scala.Int | scala.Double = null,
    minRowHeight: scala.Int | scala.Double = null
  ): IRowHeights = {
    val __obj = js.Dynamic.literal()
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (maxRowHeight != null) __obj.updateDynamic("maxRowHeight")(maxRowHeight.asInstanceOf[js.Any])
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowHeights]
  }
}

