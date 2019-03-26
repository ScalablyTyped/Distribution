package typings
package atBlueprintjsTableLib.libEsmCellEditableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableCellState extends js.Object {
  var dirtyValue: js.UndefOr[java.lang.String] = js.undefined
  var isEditing: js.UndefOr[scala.Boolean] = js.undefined
  var savedValue: js.UndefOr[java.lang.String] = js.undefined
}

object IEditableCellState {
  @scala.inline
  def apply(
    dirtyValue: java.lang.String = null,
    isEditing: js.UndefOr[scala.Boolean] = js.undefined,
    savedValue: java.lang.String = null
  ): IEditableCellState = {
    val __obj = js.Dynamic.literal()
    if (dirtyValue != null) __obj.updateDynamic("dirtyValue")(dirtyValue)
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing)
    if (savedValue != null) __obj.updateDynamic("savedValue")(savedValue)
    __obj.asInstanceOf[IEditableCellState]
  }
}

