package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Windows
////////////////////
/**
  * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
  * @since Chrome 5.
  */
object windows {
  
  trait CreateData extends StObject {
    
    /**
      * Optional. If true, opens an active window. If false, opens an inactive window.
      * @since Chrome 12.
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional.
      * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Optional. Whether the new window should be an incognito window. */
    var incognito: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional.
      * The number of pixels to position the new window from the left edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, the newly-created window's 'window.opener' is set to the caller and is in the same [unit of related browsing contexts](https://www.w3.org/TR/html51/browsers.html#unit-of-related-browsing-contexts) as the caller.
      * @since Chrome 64.
      */
    var setSelfAsOpener: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional. The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
      * @since Chrome 44.
      */
    var state: js.UndefOr[windowStateEnum] = js.undefined
    
    /**
      * Optional. The id of the tab for which you want to adopt to the new window.
      * @since Chrome 10.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * The number of pixels to position the new window from the top edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /** Optional. Specifies what type of browser window to create. */
    var `type`: js.UndefOr[createTypeEnum] = js.undefined
    
    /**
      * Optional.
      * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
      */
    var url: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Optional.
      * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CreateData {
    
    inline def apply(): CreateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateData]
    }
    
    extension [Self <: CreateData](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setSetSelfAsOpener(value: Boolean): Self = StObject.set(x, "setSelfAsOpener", value.asInstanceOf[js.Any])
      
      inline def setSetSelfAsOpenerUndefined: Self = StObject.set(x, "setSelfAsOpener", js.undefined)
      
      inline def setState(value: windowStateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: createTypeEnum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait QueryOptions extends StObject {
    
    /**
      * Optional.
      * If true, the windows.Window object will have a tabs property that contains a list of the tabs.Tab objects.
      * The Tab objects only contain the url, pendingUrl, title and favIconUrl properties if the extension's manifest file includes the "tabs" permission.
      */
    var populate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, the Window returned is filtered based on its type. If unset, the default filter is set to ['normal', 'popup'].
      */
    var windowTypes: js.UndefOr[js.Array[windowTypeEnum]] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    extension [Self <: QueryOptions](x: Self) {
      
      inline def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      inline def setWindowTypes(value: js.Array[windowTypeEnum]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      inline def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
      
      inline def setWindowTypesVarargs(value: windowTypeEnum*): Self = StObject.set(x, "windowTypes", js.Array(value*))
    }
  }
  
  trait UpdateInfo extends StObject {
    
    /**
      * Optional. If true, causes the window to be displayed in a manner that draws the user's attention to the window, without changing the focused window. The effect lasts until the user changes focus to the window. This option has no effect if the window already has focus. Set to false to cancel a previous draw attention request.
      * @since Chrome 14.
      */
    var drawAttention: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional. If true, brings the window to the front. If false, brings the next window in the z-order to the front.
      * @since Chrome 8.
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The height to resize the window to in pixels. This value is ignored for panels. */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Optional. The offset from the left edge of the screen to move the window to in pixels. This value is ignored for panels. */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
      * @since Chrome 17.
      */
    var state: js.UndefOr[windowStateEnum] = js.undefined
    
    /** Optional. The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels. */
    var top: js.UndefOr[Double] = js.undefined
    
    /** Optional. The width to resize the window to in pixels. This value is ignored for panels. */
    var width: js.UndefOr[Double] = js.undefined
  }
  object UpdateInfo {
    
    inline def apply(): UpdateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateInfo]
    }
    
    extension [Self <: UpdateInfo](x: Self) {
      
      inline def setDrawAttention(value: Boolean): Self = StObject.set(x, "drawAttention", value.asInstanceOf[js.Any])
      
      inline def setDrawAttentionUndefined: Self = StObject.set(x, "drawAttention", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setState(value: windowStateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Window extends StObject {
    
    /**
      * Whether the window is set to be always on top.
      * @since Chrome 19.
      */
    var alwaysOnTop: Boolean
    
    /** Whether the window is currently the focused window. */
    var focused: Boolean
    
    /** Optional. The height of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned height property, for example when querying closed windows from the sessions API. */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Optional. The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may not be assigned an ID, for example when querying windows using the sessions API, in which case a session ID may be present. */
    var id: js.UndefOr[Double] = js.undefined
    
    /** Whether the window is incognito. */
    var incognito: Boolean
    
    /** Optional. The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may not be assigned left property, for example when querying closed windows from the sessions API. */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. The session ID used to uniquely identify a Window obtained from the sessions API.
      * @since Chrome 31.
      */
    var sessionId: js.UndefOr[String] = js.undefined
    
    /**
      * The state of this browser window.
      * @since Chrome 17.
      */
    var state: js.UndefOr[windowStateEnum] = js.undefined
    
    /** Optional. Array of tabs.Tab objects representing the current tabs in the window. */
    var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
    
    /** Optional. The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may not be assigned top property, for example when querying closed windows from the sessions API. */
    var top: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of browser window this is.
      */
    var `type`: js.UndefOr[windowTypeEnum] = js.undefined
    
    /** Optional. The width of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned width property, for example when querying closed windows from the sessions API. */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Window {
    
    inline def apply(alwaysOnTop: Boolean, focused: Boolean, incognito: Boolean): Window = {
      val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setState(value: windowStateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: windowTypeEnum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait WindowEventFilter extends StObject {
    
    /**
      * Conditions that the window's type being created must satisfy. By default it will satisfy ['app', 'normal', 'panel', 'popup'], with 'app' and 'panel' window types limited to the extension's own windows.
      */
    var windowTypes: js.Array[windowTypeEnum]
  }
  object WindowEventFilter {
    
    inline def apply(windowTypes: js.Array[windowTypeEnum]): WindowEventFilter = {
      val __obj = js.Dynamic.literal(windowTypes = windowTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowEventFilter]
    }
    
    extension [Self <: WindowEventFilter](x: Self) {
      
      inline def setWindowTypes(value: js.Array[windowTypeEnum]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      inline def setWindowTypesVarargs(value: windowTypeEnum*): Self = StObject.set(x, "windowTypes", js.Array(value*))
    }
  }
  
  @js.native
  trait WindowIdEvent
    extends StObject
       with Event[js.Function1[/* windowId */ Double, Unit]] {
    
    def addListener(callback: js.Function1[/* windowId */ Double, Unit], filters: WindowEventFilter): Unit = js.native
  }
  
  @js.native
  trait WindowReferenceEvent
    extends StObject
       with Event[js.Function1[/* window */ Window, Unit]] {
    
    def addListener(callback: js.Function1[/* window */ Window, Unit], filters: WindowEventFilter): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.normal
    - typings.chrome.chromeStrings.popup
    - typings.chrome.chromeStrings.panel
  */
  trait createTypeEnum extends StObject
  object createTypeEnum {
    
    inline def normal: typings.chrome.chromeStrings.normal = "normal".asInstanceOf[typings.chrome.chromeStrings.normal]
    
    inline def panel: typings.chrome.chromeStrings.panel = "panel".asInstanceOf[typings.chrome.chromeStrings.panel]
    
    inline def popup: typings.chrome.chromeStrings.popup = "popup".asInstanceOf[typings.chrome.chromeStrings.popup]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.normal
    - typings.chrome.chromeStrings.minimized
    - typings.chrome.chromeStrings.maximized
    - typings.chrome.chromeStrings.fullscreen
    - typings.chrome.chromeStrings.`locked-fullscreen`
  */
  trait windowStateEnum extends StObject
  object windowStateEnum {
    
    inline def fullscreen: typings.chrome.chromeStrings.fullscreen = "fullscreen".asInstanceOf[typings.chrome.chromeStrings.fullscreen]
    
    inline def `locked-fullscreen`: typings.chrome.chromeStrings.`locked-fullscreen` = "locked-fullscreen".asInstanceOf[typings.chrome.chromeStrings.`locked-fullscreen`]
    
    inline def maximized: typings.chrome.chromeStrings.maximized = "maximized".asInstanceOf[typings.chrome.chromeStrings.maximized]
    
    inline def minimized: typings.chrome.chromeStrings.minimized = "minimized".asInstanceOf[typings.chrome.chromeStrings.minimized]
    
    inline def normal: typings.chrome.chromeStrings.normal = "normal".asInstanceOf[typings.chrome.chromeStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.normal
    - typings.chrome.chromeStrings.popup
    - typings.chrome.chromeStrings.panel
    - typings.chrome.chromeStrings.app
    - typings.chrome.chromeStrings.devtools
  */
  trait windowTypeEnum extends StObject
  object windowTypeEnum {
    
    inline def app: typings.chrome.chromeStrings.app = "app".asInstanceOf[typings.chrome.chromeStrings.app]
    
    inline def devtools: typings.chrome.chromeStrings.devtools = "devtools".asInstanceOf[typings.chrome.chromeStrings.devtools]
    
    inline def normal: typings.chrome.chromeStrings.normal = "normal".asInstanceOf[typings.chrome.chromeStrings.normal]
    
    inline def panel: typings.chrome.chromeStrings.panel = "panel".asInstanceOf[typings.chrome.chromeStrings.panel]
    
    inline def popup: typings.chrome.chromeStrings.popup = "popup".asInstanceOf[typings.chrome.chromeStrings.popup]
  }
}
