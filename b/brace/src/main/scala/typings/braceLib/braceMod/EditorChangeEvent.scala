package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorChangeEvent extends js.Object {
  var action: java.lang.String
  var end: Position
   // insert, remove
  var lines: js.Array[_]
  var start: Position
}

object EditorChangeEvent {
  @scala.inline
  def apply(action: java.lang.String, end: Position, lines: js.Array[_], start: Position): EditorChangeEvent = {
    val __obj = js.Dynamic.literal(action = action, end = end, lines = lines, start = start)
  
    __obj.asInstanceOf[EditorChangeEvent]
  }
}

