package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHistory extends js.Object {
  var history: String
}

object AnonHistory {
  @scala.inline
  def apply(history: String): AnonHistory = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHistory]
  }
}

