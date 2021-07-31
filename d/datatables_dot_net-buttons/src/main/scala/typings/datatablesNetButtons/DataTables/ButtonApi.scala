package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonApi extends StObject {
  
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
  def active(): Boolean = js.native
  /**
    * Set the active state for the selected button.
    */
  def active(state: Boolean): Api = js.native
  
  def add(index: String, config: String): Api = js.native
  def add(index: String, config: ButtonSettings): Api = js.native
  def add(index: String, config: FunctionButtom): Api = js.native
  /**
    * Create a new button, adding it to the selected button instance and inserting immediately into the document.
    */
  def add(index: Double, config: String): Api = js.native
  def add(index: Double, config: ButtonSettings): Api = js.native
  def add(index: Double, config: FunctionButtom): Api = js.native
  
  /**
    * Disable the selected buttons.
    */
  def disable(): Api = js.native
  
  /**
    * Set the enabled state for the selected button.
    */
  def enable(): Api = js.native
  def enable(state: Boolean): Api = js.native
  
  /**
    * Get a jQuery object that contains a reference to the node for the selected button.
    */
  def node(): JQuery = js.native
  
  def nodes(): JQuery = js.native
  
  /**
    * Determine if a button is currently in the processing state or not.
    */
  def processing(): Boolean = js.native
  /**
    * Set the processing state for the selected button.
    */
  def processing(set: Boolean): Api = js.native
  
  /**
    * Remove the selected button from the display. The button is destroyed and can no longer be used once removed.
    */
  def remove(): Api = js.native
  
  /**
    * Get / Set the display text for the selected button
    */
  def text(): Api = js.native
  def text(title: String): Api = js.native
  def text(title: FunctionButtonText): Api = js.native
  
  /**
    * Programmatically trigger the action of the selected button.
    */
  def trigger(): Api = js.native
}
