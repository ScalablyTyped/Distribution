package typings.chayns

import typings.chayns.chaynsNs.dialogNs.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInputResult extends js.Object {
  var buttonType: typings.chayns.chaynsNs.dialogNs.buttonType
  var text: String
}

object DialogInputResult {
  @scala.inline
  def apply(buttonType: buttonType, text: String): DialogInputResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, text = text)
  
    __obj.asInstanceOf[DialogInputResult]
  }
}

