package typings.codemirror

import typings.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnchorHead extends js.Object {
  var anchor: Position
  var head: Position
}

object AnonAnchorHead {
  @scala.inline
  def apply(anchor: Position, head: Position): AnonAnchorHead = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnchorHead]
  }
}

