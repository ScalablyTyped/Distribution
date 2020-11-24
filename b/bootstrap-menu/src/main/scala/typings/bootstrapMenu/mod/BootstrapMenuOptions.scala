package typings.bootstrapMenu.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var _actionSelectEvent: js.UndefOr[String] = js.native
  
  /**
    * Array or object containing the list of actions to be rendered in the context menu.
    */
  var actions: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions] = js.native
  
  /**
    * Array to group actions to render them next to each other, with a separator between each group.
    */
  var actionsGroups: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  /**
    * Container of the context menu, where it will be created and where event listeners will be installed.
    */
  var container: js.UndefOr[String] = js.native
  
  /**
    * Obtain specific data about the currently opened element, to pass it to the rest of user-defined functions of an action.
    */
  var fetchElementData: js.UndefOr[js.Function1[/* jqueryElement */ JQuery[HTMLElement], BootstrapMenuRowElement]] = js.native
  
  /**
    * The event to listen to open the menu. Valid values are *click*, *right-click*, *hover*. Defaults to *right-click*.
    */
  var menuEvent: js.UndefOr[BootstrapMenuEvent] = js.native
  
  /**
    * How to calculate the position of the context menu based on its source. Valid values are *aboveLeft*, *aboveRight*, *belowLeft*, and *belowRight*. Defaults to *belowLeft*.
    */
  var menuPosition: js.UndefOr[BootstrapMenuPosition] = js.native
  
  /**
    * What the source of the context menu should be when opened. Valid values are *mouse* and *element*. Defaults to *mouse*.
    */
  var menuSource: js.UndefOr[BootstrapMenuSource] = js.native
  
  /**
    * Message to show when there are no actions to show in a menu
    * (isShown() returned false on all actions)
    */
  var noActionsMessage: js.UndefOr[String] = js.native
}
object BootstrapMenuOptions {
  
  @scala.inline
  def apply(actions: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]): BootstrapMenuOptions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapMenuOptions]
  }
  
  @scala.inline
  implicit class BootstrapMenuOptionsOps[Self <: BootstrapMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: BootstrapMenuActions*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actionSelectEvent(value: String): Self = this.set("_actionSelectEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_actionSelectEvent: Self = this.set("_actionSelectEvent", js.undefined)
    
    @scala.inline
    def setActionsGroupsVarargs(value: js.Array[String]*): Self = this.set("actionsGroups", js.Array(value :_*))
    
    @scala.inline
    def setActionsGroups(value: js.Array[js.Array[String]]): Self = this.set("actionsGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsGroups: Self = this.set("actionsGroups", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setFetchElementData(value: /* jqueryElement */ JQuery[HTMLElement] => BootstrapMenuRowElement): Self = this.set("fetchElementData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFetchElementData: Self = this.set("fetchElementData", js.undefined)
    
    @scala.inline
    def setMenuEvent(value: BootstrapMenuEvent): Self = this.set("menuEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuEvent: Self = this.set("menuEvent", js.undefined)
    
    @scala.inline
    def setMenuPosition(value: BootstrapMenuPosition): Self = this.set("menuPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuPosition: Self = this.set("menuPosition", js.undefined)
    
    @scala.inline
    def setMenuSource(value: BootstrapMenuSource): Self = this.set("menuSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuSource: Self = this.set("menuSource", js.undefined)
    
    @scala.inline
    def setNoActionsMessage(value: String): Self = this.set("noActionsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoActionsMessage: Self = this.set("noActionsMessage", js.undefined)
  }
}
