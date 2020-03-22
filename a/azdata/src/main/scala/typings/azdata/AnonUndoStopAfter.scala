package typings.azdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUndoStopAfter extends js.Object {
  var undoStopAfter: Boolean
  var undoStopBefore: Boolean
}

object AnonUndoStopAfter {
  @scala.inline
  def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): AnonUndoStopAfter = {
    val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter.asInstanceOf[js.Any], undoStopBefore = undoStopBefore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUndoStopAfter]
  }
}

