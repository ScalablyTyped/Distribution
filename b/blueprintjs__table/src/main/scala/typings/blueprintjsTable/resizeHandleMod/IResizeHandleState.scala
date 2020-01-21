package typings.blueprintjsTable.resizeHandleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeHandleState extends js.Object {
  /**
    * A boolean that is true while the user is dragging the resize handle
    */
  var isDragging: Boolean
}

object IResizeHandleState {
  @scala.inline
  def apply(isDragging: Boolean): IResizeHandleState = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResizeHandleState]
  }
}

