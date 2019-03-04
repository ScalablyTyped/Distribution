package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInputResult extends js.Object {
  var buttonType: chaynsLib.chaynsNs.dialogNs.buttonType
  var text: java.lang.String
}

object DialogInputResult {
  @scala.inline
  def apply(buttonType: chaynsLib.chaynsNs.dialogNs.buttonType, text: java.lang.String): DialogInputResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, text = text)
  
    __obj.asInstanceOf[DialogInputResult]
  }
}

