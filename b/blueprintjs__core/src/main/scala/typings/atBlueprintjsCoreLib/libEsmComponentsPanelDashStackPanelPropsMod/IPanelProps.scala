package typings
package atBlueprintjsCoreLib.libEsmComponentsPanelDashStackPanelPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelProps extends js.Object {
  /**
    * Call this method to programatically close this panel. If this is the only
    * panel on the stack then this method will do nothing.
    *
    * Remember that the panel header always contains a "back" button that
    * closes this panel on click (unless there is only one panel on the stack).
    */
  def closePanel(): scala.Unit
  /**
    * Call this method to open a new panel on the top of the stack.
    */
  def openPanel[P](panel: IPanel[P]): scala.Unit
}

object IPanelProps {
  @scala.inline
  def apply(closePanel: () => scala.Unit, openPanel: IPanel[js.Any] => scala.Unit): IPanelProps = {
    val __obj = js.Dynamic.literal(closePanel = js.Any.fromFunction0(closePanel), openPanel = js.Any.fromFunction1(openPanel))
  
    __obj.asInstanceOf[IPanelProps]
  }
}

