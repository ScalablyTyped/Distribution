package typings
package chromeLib.chromeNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends js.Object {
  /** Fired when the button is clicked. */
  var onClicked: ButtonClickedEvent = js.native
  /**
    * Updates the attributes of the button. If some of the arguments are omitted or null, the corresponding attributes are not updated.
    * @param iconPath Path to the new icon of the button.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    */
  def update(): scala.Unit = js.native
  def update(iconPath: java.lang.String): scala.Unit = js.native
  def update(iconPath: java.lang.String, tooltipText: java.lang.String): scala.Unit = js.native
  def update(iconPath: java.lang.String, tooltipText: java.lang.String, disabled: scala.Boolean): scala.Unit = js.native
  def update(iconPath: java.lang.String, tooltipText: scala.Null, disabled: scala.Boolean): scala.Unit = js.native
  def update(iconPath: scala.Null, tooltipText: java.lang.String): scala.Unit = js.native
  def update(iconPath: scala.Null, tooltipText: java.lang.String, disabled: scala.Boolean): scala.Unit = js.native
  def update(iconPath: scala.Null, tooltipText: scala.Null, disabled: scala.Boolean): scala.Unit = js.native
}

