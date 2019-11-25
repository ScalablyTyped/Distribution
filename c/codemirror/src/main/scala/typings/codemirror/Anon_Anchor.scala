package typings.codemirror

import typings.codemirror.codemirrorMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anchor extends js.Object {
  var anchor: Position
  var head: Position
}

object Anon_Anchor {
  @scala.inline
  def apply(anchor: Position, head: Position): Anon_Anchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Anchor]
  }
}

