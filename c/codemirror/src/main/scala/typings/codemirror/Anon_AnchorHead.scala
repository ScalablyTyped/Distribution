package typings.codemirror

import typings.codemirror.codemirrorMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnchorHead extends js.Object {
  var anchor: Position
  var head: Position
}

object Anon_AnchorHead {
  @scala.inline
  def apply(anchor: Position, head: Position): Anon_AnchorHead = {
    val __obj = js.Dynamic.literal(anchor = anchor, head = head)
  
    __obj.asInstanceOf[Anon_AnchorHead]
  }
}

