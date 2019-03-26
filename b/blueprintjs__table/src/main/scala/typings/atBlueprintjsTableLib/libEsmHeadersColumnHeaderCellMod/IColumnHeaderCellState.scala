package typings
package atBlueprintjsTableLib.libEsmHeadersColumnHeaderCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnHeaderCellState extends js.Object {
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
}

object IColumnHeaderCellState {
  @scala.inline
  def apply(isActive: js.UndefOr[scala.Boolean] = js.undefined): IColumnHeaderCellState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    __obj.asInstanceOf[IColumnHeaderCellState]
  }
}

