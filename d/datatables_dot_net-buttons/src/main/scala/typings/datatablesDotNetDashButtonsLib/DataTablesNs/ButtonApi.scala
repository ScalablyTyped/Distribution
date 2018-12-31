package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonApi extends js.Object {
  /**
    * Get the action function for the selected button.
    */
  def action(): FunctionButtonAction = js.native
  /**
    * Set the action function for the selected button.
    */
  def action(set: FunctionButtonAction): Api = js.native
  /**
    * Get the active state for the selected button.
    */
  def active(): scala.Boolean = js.native
  /**
    * Set the active state for the selected button.
    */
  def active(state: scala.Boolean): Api = js.native
  def add(index: java.lang.String, config: ButtonSettings): Api = js.native
  def add(index: java.lang.String, config: FunctionButtom): Api = js.native
  def add(index: java.lang.String, config: java.lang.String): Api = js.native
  def add(index: scala.Double, config: ButtonSettings): Api = js.native
  def add(index: scala.Double, config: FunctionButtom): Api = js.native
  /**
    * Create a new button, adding it to the selected button instance and inserting immediately into the document.
    */
  def add(index: scala.Double, config: java.lang.String): Api = js.native
  /**
    * Disable the selected buttons.
    */
  def disable(): Api = js.native
  /**
    * Set the enabled state for the selected button.
    */
  def enable(): Api = js.native
  def enable(state: scala.Boolean): Api = js.native
  /**
    * Get a jQuery object that contains a reference to the node for the selected button.
    */
  def node(): datatablesDotNetLib.JQuery = js.native
  def nodes(): datatablesDotNetLib.JQuery = js.native
  /**
    * Determine if a button is currently in the processing state or not.
    */
  def processing(): scala.Boolean = js.native
  /**
    * Set the processing state for the selected button.
    */
  def processing(set: scala.Boolean): Api = js.native
  /**
    * Remove the selected button from the display. The button is destroyed and can no longer be used once removed.
    */
  def remove(): Api = js.native
  /**
    * Get / Set the display text for the selected button
    */
  def text(): Api = js.native
  def text(title: FunctionButtonText): Api = js.native
  def text(title: java.lang.String): Api = js.native
  /**
    * Programmatically trigger the action of the selected button.
    */
  def trigger(): Api = js.native
}

