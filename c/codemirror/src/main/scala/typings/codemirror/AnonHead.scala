package typings.codemirror

import typings.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHead extends js.Object {
  var anchor: Position
  var head: Position
}

object AnonHead {
  @scala.inline
  def apply(anchor: Position, head: Position): AnonHead = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHead]
  }
}

