package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hints extends js.Object {
  var from: Position
  var list: js.Array[Hint | java.lang.String]
  var to: Position
}

object Hints {
  @scala.inline
  def apply(from: Position, list: js.Array[Hint | java.lang.String], to: Position): Hints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Hints]
  }
}

