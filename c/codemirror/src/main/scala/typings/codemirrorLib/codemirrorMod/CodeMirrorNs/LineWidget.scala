package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

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
  def apply(changed: js.Function0[scala.Unit], clear: js.Function0[scala.Unit]): LineWidget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changed")(changed)
    __obj.updateDynamic("clear")(clear)
    __obj.asInstanceOf[LineWidget]
  }
}

