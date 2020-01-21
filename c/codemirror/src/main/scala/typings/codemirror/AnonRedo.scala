package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRedo extends js.Object {
  var redo: Double
  var undo: Double
}

object AnonRedo {
  @scala.inline
  def apply(redo: Double, undo: Double): AnonRedo = {
    val __obj = js.Dynamic.literal(redo = redo.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRedo]
  }
}

