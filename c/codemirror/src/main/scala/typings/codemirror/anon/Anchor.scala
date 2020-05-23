package typings.codemirror.anon

import typings.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends js.Object {
  var anchor: Position
  var head: Position
}

object Anchor {
  @scala.inline
  def apply(anchor: Position, head: Position): Anchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
}

