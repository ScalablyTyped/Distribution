package typings.bootstrapMenu

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bootstrap-menu", JSImport.Namespace)
  @js.native
  class ^ protected () extends BootstrapMenu {
    /**
      * @param selector Css selector of the element to attach the Menu to
      * @param options Options to configure the menu
      */
    def this(selector: String, options: BootstrapMenuOptions) = this()
  }
  
  @js.native
  trait BootstrapMenu extends StObject {
    
    /**
      * Close the context menu
      */
    def close(): Unit = js.native
    
    /**
      * Close the menu and remove every event listeners
      */
    def destroy(): Unit = js.native
  }
  object BootstrapMenu {
    
    @scala.inline
    def apply(close: () => Unit, destroy: () => Unit): BootstrapMenu = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[BootstrapMenu]
    }
    
    @scala.inline
    implicit class BootstrapMenuMutableBuilder[Self <: BootstrapMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Every function attribute is called before rendering the menu each time it is opened.
    * If `fetchElementData` was defined, these functions will receive as first argument its returned value for the currently selected element.
    */
  @js.native
  trait BootstrapMenuActions extends StObject {
    
    /**
      * Optional, classes to add to the action.
      */
    var classNames: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.native
    
    /**
      * Optional, Font Awesome class of the icon to show for the action.
      */
    var iconClass: js.UndefOr[String] = js.native
    
    /**
      * Optional, decides if the action should appear enabled or disabled in the context menu.
      */
    var isEnabled: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.native
    
    /**
      * Optional, decides if the action should be shown or hidden in the context menu.
      */
    var isShown: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.native
    
    /**
      * The name of the action.
      */
    var name: String = js.native
    
    /**
      * Handler to run when an action is clicked.
      */
    def onClick(rowElement: BootstrapMenuRowElement): Unit = js.native
  }
  object BootstrapMenuActions {
    
    @scala.inline
    def apply(name: String, onClick: BootstrapMenuRowElement => Unit): BootstrapMenuActions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[BootstrapMenuActions]
    }
    
    @scala.inline
    implicit class BootstrapMenuActionsMutableBuilder[Self <: BootstrapMenuActions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: String | js.Object | (js.Function0[String | js.Object])): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesFunction0(value: () => String | js.Object): Self = StObject.set(x, "classNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: /* rowElement */ BootstrapMenuRowElement => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setIsShown(value: /* rowElement */ BootstrapMenuRowElement => Boolean): Self = StObject.set(x, "isShown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsShownUndefined: Self = StObject.set(x, "isShown", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: BootstrapMenuRowElement => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bootstrapMenu.bootstrapMenuStrings.click
    - typings.bootstrapMenu.bootstrapMenuStrings.`right-click`
    - typings.bootstrapMenu.bootstrapMenuStrings.hover
  */
  trait BootstrapMenuEvent extends StObject
  object BootstrapMenuEvent {
    
    @scala.inline
    def click: typings.bootstrapMenu.bootstrapMenuStrings.click = "click".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.click]
    
    @scala.inline
    def hover: typings.bootstrapMenu.bootstrapMenuStrings.hover = "hover".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.hover]
    
    @scala.inline
    def `right-click`: typings.bootstrapMenu.bootstrapMenuStrings.`right-click` = "right-click".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.`right-click`]
  }
  
  @js.native
  trait BootstrapMenuOptions extends StObject {
    
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
    implicit class BootstrapMenuOptionsMutableBuilder[Self <: BootstrapMenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: StringDictionary[BootstrapMenuActions] | js.Array[BootstrapMenuActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsGroups(value: js.Array[js.Array[String]]): Self = StObject.set(x, "actionsGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsGroupsUndefined: Self = StObject.set(x, "actionsGroups", js.undefined)
      
      @scala.inline
      def setActionsGroupsVarargs(value: js.Array[String]*): Self = StObject.set(x, "actionsGroups", js.Array(value :_*))
      
      @scala.inline
      def setActionsVarargs(value: BootstrapMenuActions*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setFetchElementData(value: /* jqueryElement */ JQuery[HTMLElement] => BootstrapMenuRowElement): Self = StObject.set(x, "fetchElementData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchElementDataUndefined: Self = StObject.set(x, "fetchElementData", js.undefined)
      
      @scala.inline
      def setMenuEvent(value: BootstrapMenuEvent): Self = StObject.set(x, "menuEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuEventUndefined: Self = StObject.set(x, "menuEvent", js.undefined)
      
      @scala.inline
      def setMenuPosition(value: BootstrapMenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      @scala.inline
      def setMenuSource(value: BootstrapMenuSource): Self = StObject.set(x, "menuSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuSourceUndefined: Self = StObject.set(x, "menuSource", js.undefined)
      
      @scala.inline
      def setNoActionsMessage(value: String): Self = StObject.set(x, "noActionsMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoActionsMessageUndefined: Self = StObject.set(x, "noActionsMessage", js.undefined)
      
      @scala.inline
      def set_actionSelectEvent(value: String): Self = StObject.set(x, "_actionSelectEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_actionSelectEventUndefined: Self = StObject.set(x, "_actionSelectEvent", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bootstrapMenu.bootstrapMenuStrings.aboveLeft
    - typings.bootstrapMenu.bootstrapMenuStrings.aboveRight
    - typings.bootstrapMenu.bootstrapMenuStrings.belowLeft
    - typings.bootstrapMenu.bootstrapMenuStrings.belowRight
  */
  trait BootstrapMenuPosition extends StObject
  object BootstrapMenuPosition {
    
    @scala.inline
    def aboveLeft: typings.bootstrapMenu.bootstrapMenuStrings.aboveLeft = "aboveLeft".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.aboveLeft]
    
    @scala.inline
    def aboveRight: typings.bootstrapMenu.bootstrapMenuStrings.aboveRight = "aboveRight".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.aboveRight]
    
    @scala.inline
    def belowLeft: typings.bootstrapMenu.bootstrapMenuStrings.belowLeft = "belowLeft".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.belowLeft]
    
    @scala.inline
    def belowRight: typings.bootstrapMenu.bootstrapMenuStrings.belowRight = "belowRight".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.belowRight]
  }
  
  type BootstrapMenuRowElement = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.bootstrapMenu.bootstrapMenuStrings.mouse
    - typings.bootstrapMenu.bootstrapMenuStrings.element
  */
  trait BootstrapMenuSource extends StObject
  object BootstrapMenuSource {
    
    @scala.inline
    def element: typings.bootstrapMenu.bootstrapMenuStrings.element = "element".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.element]
    
    @scala.inline
    def mouse: typings.bootstrapMenu.bootstrapMenuStrings.mouse = "mouse".asInstanceOf[typings.bootstrapMenu.bootstrapMenuStrings.mouse]
  }
}
