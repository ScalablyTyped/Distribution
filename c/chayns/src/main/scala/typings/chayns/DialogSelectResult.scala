package typings.chayns

import typings.chayns.chaynsNs.dialogNs.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSelectResult extends js.Object {
  var buttonType: typings.chayns.chaynsNs.dialogNs.buttonType
  var selection: js.Array[DialogSelectResultItem]
}

object DialogSelectResult {
  @scala.inline
  def apply(buttonType: buttonType, selection: js.Array[DialogSelectResultItem]): DialogSelectResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, selection = selection)
  
    __obj.asInstanceOf[DialogSelectResult]
  }
}

