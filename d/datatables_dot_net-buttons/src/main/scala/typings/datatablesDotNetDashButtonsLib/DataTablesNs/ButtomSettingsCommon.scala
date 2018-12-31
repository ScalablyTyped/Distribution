package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtomSettingsCommon extends js.Object {
  /**
    * Action to take when the button is activated
    */
  var action: js.UndefOr[FunctionButtonAction] = js.undefined
  /**
    * Ensure that any requirements have been satisfied before initialising a button
    */
  var available: js.UndefOr[FunctionButtonAvailable] = js.undefined
  /**
    * Set the class name for the button
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function that is called when the button is destroyed
    */
  var destroy: js.UndefOr[FunctionButtonInit] = js.undefined
  /**
    * Set a button's initial enabled state
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Define which button type the button should be based on
    */
  var extend: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Initialisation function that can be used to add events specific to this button
    */
  var init: js.UndefOr[FunctionButtonInit] = js.undefined
  /**
    * Define an activation key for a button
    */
  var key: js.UndefOr[java.lang.String | ButtonKey] = js.undefined
  /**
    * Set a name for each selection
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique namespace for every button
    */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to show in the button
    */
  var text: js.UndefOr[java.lang.String | FunctionButtonText] = js.undefined
  /**
    * Button 'title' attribute text
    */
  var titleAttr: js.UndefOr[java.lang.String] = js.undefined
}

