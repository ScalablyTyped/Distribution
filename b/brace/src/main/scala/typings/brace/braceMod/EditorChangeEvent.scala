package typings.brace.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorChangeEvent extends js.Object {
  var action: String
  var end: Position
   // insert, remove
  var lines: js.Array[_]
  var start: Position
}

object EditorChangeEvent {
  @scala.inline
  def apply(action: String, end: Position, lines: js.Array[_], start: Position): EditorChangeEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorChangeEvent]
  }
}

