package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogDateResult extends js.Object {
  var buttonType: typings.chayns.chayns.dialog.buttonType
  var timestamp: Double
}

object DialogDateResult {
  @scala.inline
  def apply(buttonType: buttonType, timestamp: Double): DialogDateResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogDateResult]
  }
}

