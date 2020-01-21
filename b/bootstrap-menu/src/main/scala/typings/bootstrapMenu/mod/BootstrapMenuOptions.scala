package typings.bootstrapMenu.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapMenuOptions extends js.Object {
  /**
    * In some weird cases, another plugin may be installing 'click' listeners
    * in the anchors used for each action of the context menu, and stopping
    * the event bubbling before it reachs this plugin's listener.
    *
    * For those cases, _actionSelectEvent can be used to change the event we
    * listen to, for example to 'mousedown'.
    *
    * Unless the context menu is not working due to this and a workaround is
    * needed, this option can be safely ignored.
    */
  var _actionSelectEvent: js.UndefOr[String] = js.undefined
  /**
    * Array or object containing the list of actions to be rendered in the context menu.
    */
  var actions: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]
  /**
    * Array to group actions to render them next to each other, with a separator between each group.
    */
  var actionsGroups: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  /**
    * Container of the context menu, where it will be created and where event listeners will be installed.
    */
  var container: js.UndefOr[String] = js.undefined
  /**
    * Obtain specific data about the currently opened element, to pass it to the rest of user-defined functions of an action.
    */
  var fetchElementData: js.UndefOr[js.Function1[/* jqueryElement */ JQuery_[HTMLElement], BootstrapMenuRowElement]] = js.undefined
  /**
    * The event to listen to open the menu. Valid values are *click*, *right-click*, *hover*. Defaults to *right-click*.
    */
  var menuEvent: js.UndefOr[BootstrapMenuEvent] = js.undefined
  /**
    * How to calculate the position of the context menu based on its source. Valid values are *aboveLeft*, *aboveRight*, *belowLeft*, and *belowRight*. Defaults to *belowLeft*.
    */
  var menuPosition: js.UndefOr[BootstrapMenuPosition] = js.undefined
  /**
    * What the source of the context menu should be when opened. Valid values are *mouse* and *element*. Defaults to *mouse*.
    */
  var menuSource: js.UndefOr[BootstrapMenuSource] = js.undefined
  /**
    * Message to show when there are no actions to show in a menu
    * (isShown() returned false on all actions)
    */
  var noActionsMessage: js.UndefOr[String] = js.undefined
}

object BootstrapMenuOptions {
  @scala.inline
  def apply(
    actions: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions],
    _actionSelectEvent: String = null,
    actionsGroups: js.Array[js.Array[String]] = null,
    container: String = null,
    fetchElementData: /* jqueryElement */ JQuery_[HTMLElement] => BootstrapMenuRowElement = null,
    menuEvent: BootstrapMenuEvent = null,
    menuPosition: BootstrapMenuPosition = null,
    menuSource: BootstrapMenuSource = null,
    noActionsMessage: String = null
  ): BootstrapMenuOptions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (_actionSelectEvent != null) __obj.updateDynamic("_actionSelectEvent")(_actionSelectEvent.asInstanceOf[js.Any])
    if (actionsGroups != null) __obj.updateDynamic("actionsGroups")(actionsGroups.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (fetchElementData != null) __obj.updateDynamic("fetchElementData")(js.Any.fromFunction1(fetchElementData))
    if (menuEvent != null) __obj.updateDynamic("menuEvent")(menuEvent.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (menuSource != null) __obj.updateDynamic("menuSource")(menuSource.asInstanceOf[js.Any])
    if (noActionsMessage != null) __obj.updateDynamic("noActionsMessage")(noActionsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapMenuOptions]
  }
}

