package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Redo extends js.Object {
  var redo: Double
  var undo: Double
}

object Anon_Redo {
  @scala.inline
  def apply(redo: Double, undo: Double): Anon_Redo = {
    val __obj = js.Dynamic.literal(redo = redo, undo = undo)
  
    __obj.asInstanceOf[Anon_Redo]
  }
}

