package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redo extends js.Object {
  var redo: Double
  var undo: Double
}

object Redo {
  @scala.inline
  def apply(redo: Double, undo: Double): Redo = {
    val __obj = js.Dynamic.literal(redo = redo.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redo]
  }
}

