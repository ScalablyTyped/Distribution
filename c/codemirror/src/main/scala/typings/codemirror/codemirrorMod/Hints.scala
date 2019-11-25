package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hints extends js.Object {
  var from: Position
  var list: js.Array[Hint | String]
  var to: Position
}

object Hints {
  @scala.inline
  def apply(from: Position, list: js.Array[Hint | String], to: Position): Hints = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Hints]
  }
}

