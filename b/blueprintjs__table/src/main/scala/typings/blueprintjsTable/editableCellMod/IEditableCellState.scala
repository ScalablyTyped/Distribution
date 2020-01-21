package typings.blueprintjsTable.editableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableCellState extends js.Object {
  var dirtyValue: js.UndefOr[String] = js.undefined
  var isEditing: js.UndefOr[Boolean] = js.undefined
  var savedValue: js.UndefOr[String] = js.undefined
}

object IEditableCellState {
  @scala.inline
  def apply(
    dirtyValue: String = null,
    isEditing: js.UndefOr[Boolean] = js.undefined,
    savedValue: String = null
  ): IEditableCellState = {
    val __obj = js.Dynamic.literal()
    if (dirtyValue != null) __obj.updateDynamic("dirtyValue")(dirtyValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.asInstanceOf[js.Any])
    if (savedValue != null) __obj.updateDynamic("savedValue")(savedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditableCellState]
  }
}

