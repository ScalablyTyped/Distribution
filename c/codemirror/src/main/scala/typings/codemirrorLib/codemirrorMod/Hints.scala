package typings
package codemirrorLib.codemirrorMod

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
    val __obj = js.Dynamic.literal(from = from, list = list, to = to)
  
    __obj.asInstanceOf[Hints]
  }
}

