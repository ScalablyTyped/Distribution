package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Context Menus
////////////////////
/**
  * Use the chrome.contextMenus API to add items to Google Chrome's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
  * Availability: Since Chrome 6.
  * Permissions:  "contextMenus"
  */
object contextMenus {
  
  trait CreateProperties extends StObject {
    
    /** Optional. The initial state of a checkbox or radio item: true for selected and false for unselected. Only one radio item can be selected at a time in a given group of radio items.  */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. List of contexts this menu item will appear in. Defaults to ['page'] if not specified.  */
    var contexts: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This applies to frames as well.) For details on the format of a pattern, see Match Patterns.  */
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 20.
      * Whether this context menu item is enabled or disabled. Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 21.
      * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for chrome.contextMenus.onClicked.
      * @param info Information sent when a context menu item is clicked.
      * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
      */
    var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.undefined
    
    /** Optional. The ID of a parent menu item; this makes the item a child of a previously added item.  */
    var parentId: js.UndefOr[js.Any] = js.undefined
    
    /** Optional. Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.  */
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. The text to be displayed in the item; this is required unless type is 'separator'. When the context is 'selection', you can use %s within the string to show the selected text. For example, if this parameter's value is "Translate '%s' to Pig Latin" and the user selects the word "cool", the context menu item for the selection is "Translate 'cool' to Pig Latin".  */
    var title: js.UndefOr[String] = js.undefined
    
    /** Optional. The type of menu item. Defaults to 'normal' if not specified.  */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 62.
      * Whether the item is visible in the menu.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CreateProperties {
    
    @scala.inline
    def apply(): CreateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateProperties]
    }
    
    @scala.inline
    implicit class CreatePropertiesMutableBuilder[Self <: CreateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      @scala.inline
      def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      @scala.inline
      def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type MenuClickedEvent = Event[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]]
  
  trait OnClickData extends StObject {
    
    /**
      * Optional.
      * Since Chrome 35.
      * A flag indicating the state of a checkbox or radio item after it is clicked.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Since Chrome 35.
      * A flag indicating whether the element is editable (text input, textarea, etc.).
      */
    var editable: Boolean
    
    /**
      * Optional.
      * Since Chrome 35.
      * The ID of the frame of the element where the context menu was
      * clicked, if it was in a frame.
      */
    var frameId: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * The URL of the frame of the element where the context menu was clicked, if it was in a frame.
      */
    var frameUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * If the element is a link, the URL it points to.
      */
    var linkUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
      */
    var mediaType: js.UndefOr[String] = js.undefined
    
    /**
      * Since Chrome 35.
      * The ID of the menu item that was clicked.
      */
    var menuItemId: js.Any
    
    /**
      * Since Chrome 35.
      * The URL of the page where the menu item was clicked. This property is not set if the click occured in a context where there is no current page, such as in a launcher context menu.
      */
    var pageUrl: String
    
    /**
      * Optional.
      * Since Chrome 35.
      * The parent ID, if any, for the item clicked.
      */
    var parentMenuItemId: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * The text for the context selection, if any.
      */
    var selectionText: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * Will be present for elements with a 'src' URL.
      */
    var srcUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * Since Chrome 35.
      * A flag indicating the state of a checkbox or radio item before it was clicked.
      */
    var wasChecked: js.UndefOr[Boolean] = js.undefined
  }
  object OnClickData {
    
    @scala.inline
    def apply(editable: Boolean, menuItemId: js.Any, pageUrl: String): OnClickData = {
      val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    @scala.inline
    implicit class OnClickDataMutableBuilder[Self <: OnClickData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
      
      @scala.inline
      def setFrameUrl(value: String): Self = StObject.set(x, "frameUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUrlUndefined: Self = StObject.set(x, "frameUrl", js.undefined)
      
      @scala.inline
      def setLinkUrl(value: String): Self = StObject.set(x, "linkUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUrlUndefined: Self = StObject.set(x, "linkUrl", js.undefined)
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setMenuItemId(value: js.Any): Self = StObject.set(x, "menuItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuItemId(value: js.Any): Self = StObject.set(x, "parentMenuItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuItemIdUndefined: Self = StObject.set(x, "parentMenuItemId", js.undefined)
      
      @scala.inline
      def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
      
      @scala.inline
      def setSrcUrl(value: String): Self = StObject.set(x, "srcUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUrlUndefined: Self = StObject.set(x, "srcUrl", js.undefined)
      
      @scala.inline
      def setWasChecked(value: Boolean): Self = StObject.set(x, "wasChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasCheckedUndefined: Self = StObject.set(x, "wasChecked", js.undefined)
    }
  }
  
  trait UpdateProperties extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var contexts: js.UndefOr[js.Array[String]] = js.undefined
    
    var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. Since Chrome 20.  */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var onclick: js.UndefOr[js.Function] = js.undefined
    
    /** Optional. Note: You cannot change an item to be a child of one of its own descendants.  */
    var parentId: js.UndefOr[js.Any] = js.undefined
    
    var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * @since Chrome 62.
      * Whether the item is visible in the menu.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateProperties {
    
    @scala.inline
    def apply(): UpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProperties]
    }
    
    @scala.inline
    implicit class UpdatePropertiesMutableBuilder[Self <: UpdateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setDocumentUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
      
      @scala.inline
      def setDocumentUrlPatternsVarargs(value: String*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setOnclick(value: js.Function): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setParentId(value: js.Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTargetUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
      
      @scala.inline
      def setTargetUrlPatternsVarargs(value: String*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
