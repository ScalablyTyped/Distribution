package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSelectResult extends js.Object {
  var buttonType: typings.chayns.chayns.dialog.buttonType
  var selection: js.Array[DialogSelectResultItem]
}

object DialogSelectResult {
  @scala.inline
  def apply(buttonType: buttonType, selection: js.Array[DialogSelectResultItem]): DialogSelectResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectResult]
  }
}

