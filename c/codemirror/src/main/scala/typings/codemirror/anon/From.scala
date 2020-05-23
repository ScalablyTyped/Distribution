package typings.codemirror.anon

import typings.codemirror.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var from: Position
  var to: Position
}

object From {
  @scala.inline
  def apply(from: Position, to: Position): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

