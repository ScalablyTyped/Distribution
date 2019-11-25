package typings.atBlueprintjsTable.libEsmHeadersEditableNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableNameState extends js.Object {
  var dirtyName: js.UndefOr[String] = js.undefined
  var isEditing: js.UndefOr[Boolean] = js.undefined
  var savedName: js.UndefOr[String] = js.undefined
}

object IEditableNameState {
  @scala.inline
  def apply(dirtyName: String = null, isEditing: js.UndefOr[Boolean] = js.undefined, savedName: String = null): IEditableNameState = {
    val __obj = js.Dynamic.literal()
    if (dirtyName != null) __obj.updateDynamic("dirtyName")(dirtyName.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.asInstanceOf[js.Any])
    if (savedName != null) __obj.updateDynamic("savedName")(savedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditableNameState]
  }
}

