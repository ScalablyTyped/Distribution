package typings
package atBlueprintjsTableLib.libEsmHeadersEditableNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableNameState extends js.Object {
  var dirtyName: js.UndefOr[java.lang.String] = js.undefined
  var isEditing: js.UndefOr[scala.Boolean] = js.undefined
  var savedName: js.UndefOr[java.lang.String] = js.undefined
}

object IEditableNameState {
  @scala.inline
  def apply(
    dirtyName: java.lang.String = null,
    isEditing: js.UndefOr[scala.Boolean] = js.undefined,
    savedName: java.lang.String = null
  ): IEditableNameState = {
    val __obj = js.Dynamic.literal()
    if (dirtyName != null) __obj.updateDynamic("dirtyName")(dirtyName)
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing)
    if (savedName != null) __obj.updateDynamic("savedName")(savedName)
    __obj.asInstanceOf[IEditableNameState]
  }
}

