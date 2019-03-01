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

object ButtomSettingsCommon {
  @scala.inline
  def apply(
    action: FunctionButtonAction = null,
    available: FunctionButtonAvailable = null,
    className: java.lang.String = null,
    destroy: FunctionButtonInit = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    init: FunctionButtonInit = null,
    key: java.lang.String | ButtonKey = null,
    name: java.lang.String = null,
    namespace: java.lang.String = null,
    text: java.lang.String | FunctionButtonText = null,
    titleAttr: java.lang.String = null
  ): ButtomSettingsCommon = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (available != null) __obj.updateDynamic("available")(available)
    if (className != null) __obj.updateDynamic("className")(className)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (init != null) __obj.updateDynamic("init")(init)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (titleAttr != null) __obj.updateDynamic("titleAttr")(titleAttr)
    __obj.asInstanceOf[ButtomSettingsCommon]
  }
}

