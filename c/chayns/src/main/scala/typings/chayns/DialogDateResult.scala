package typings.chayns

import typings.chayns.chaynsNs.dialogNs.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogDateResult extends js.Object {
  var buttonType: typings.chayns.chaynsNs.dialogNs.buttonType
  var timestamp: Double
}

object DialogDateResult {
  @scala.inline
  def apply(buttonType: buttonType, timestamp: Double): DialogDateResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, timestamp = timestamp)
  
    __obj.asInstanceOf[DialogDateResult]
  }
}

