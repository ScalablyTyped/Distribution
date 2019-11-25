package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInputResult extends js.Object {
  var buttonType: typings.chayns.chayns.dialog.buttonType
  var text: String
}

object DialogInputResult {
  @scala.inline
  def apply(buttonType: buttonType, text: String): DialogInputResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DialogInputResult]
  }
}

