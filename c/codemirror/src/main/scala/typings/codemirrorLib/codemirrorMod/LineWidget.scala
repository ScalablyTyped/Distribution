package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineWidget extends js.Object {
  /** Call this if you made some change to the widget's DOM node that might affect its height.
    It'll force CodeMirror to update the height of the line that contains the widget. */
  def changed(): scala.Unit
  /** Removes the widget. */
  def clear(): scala.Unit
}

object LineWidget {
  @scala.inline
  def apply(changed: () => scala.Unit, clear: () => scala.Unit): LineWidget = {
    val __obj = js.Dynamic.literal(changed = js.Any.fromFunction0(changed), clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[LineWidget]
  }
}

