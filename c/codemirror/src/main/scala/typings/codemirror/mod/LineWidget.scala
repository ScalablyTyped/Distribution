package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineWidget extends js.Object {
  /** Call this if you made some change to the widget's DOM node that might affect its height.
    It'll force CodeMirror to update the height of the line that contains the widget. */
  def changed(): Unit
  /** Removes the widget. */
  def clear(): Unit
}

object LineWidget {
  @scala.inline
  def apply(changed: () => Unit, clear: () => Unit): LineWidget = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction0(changed), clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[LineWidget]
  }
}

