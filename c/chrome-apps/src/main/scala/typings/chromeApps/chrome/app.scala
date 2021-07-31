package typings.chromeApps.chrome

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.Window
import typings.chromeApps.anon.ABOUTPAGE
import typings.chromeApps.anon.FULLSCREEN
import typings.chromeApps.anon.NEWNOTE
import typings.chromeApps.anon.PANEL
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.ABOUT_PAGE
import typings.chromeApps.chromeAppsStrings.APP_LAUNCHER
import typings.chromeApps.chromeAppsStrings.BACKGROUND
import typings.chromeApps.chromeAppsStrings.CHROME_INTERNAL
import typings.chromeApps.chromeAppsStrings.COMMAND_LINE
import typings.chromeApps.chromeAppsStrings.CONTEXT_MENU
import typings.chromeApps.chromeAppsStrings.EPHEMERAL_APP
import typings.chromeApps.chromeAppsStrings.EXTENSIONS_PAGE
import typings.chromeApps.chromeAppsStrings.FILE_HANDLER
import typings.chromeApps.chromeAppsStrings.INSTALLED_NOTIFICATION
import typings.chromeApps.chromeAppsStrings.KEYBOARD
import typings.chromeApps.chromeAppsStrings.KIOSK
import typings.chromeApps.chromeAppsStrings.LOAD_AND_LAUNCH
import typings.chromeApps.chromeAppsStrings.MANAGEMENT_API
import typings.chromeApps.chromeAppsStrings.MAXIMIZED
import typings.chromeApps.chromeAppsStrings.MINIMIZED
import typings.chromeApps.chromeAppsStrings.NEW_NOTE
import typings.chromeApps.chromeAppsStrings.NEW_TAB_PAGE
import typings.chromeApps.chromeAppsStrings.NORMAL
import typings.chromeApps.chromeAppsStrings.RELOAD
import typings.chromeApps.chromeAppsStrings.RESTART
import typings.chromeApps.chromeAppsStrings.SYSTEM_TRAY
import typings.chromeApps.chromeAppsStrings.TEST
import typings.chromeApps.chromeAppsStrings.UNTRACKED
import typings.chromeApps.chromeAppsStrings.URL_HANDLER
import typings.chromeApps.chromeAppsStrings.about_page_
import typings.chromeApps.chromeAppsStrings.app_launcher_
import typings.chromeApps.chromeAppsStrings.background_
import typings.chromeApps.chromeAppsStrings.chrome_internal_
import typings.chromeApps.chromeAppsStrings.command_line_
import typings.chromeApps.chromeAppsStrings.context_menu_
import typings.chromeApps.chromeAppsStrings.ephemeral_app_
import typings.chromeApps.chromeAppsStrings.extensions_page_
import typings.chromeApps.chromeAppsStrings.file_handler_
import typings.chromeApps.chromeAppsStrings.fullscreen_
import typings.chromeApps.chromeAppsStrings.installed_notification_
import typings.chromeApps.chromeAppsStrings.keyboard_
import typings.chromeApps.chromeAppsStrings.kiosk_
import typings.chromeApps.chromeAppsStrings.load_and_launch_
import typings.chromeApps.chromeAppsStrings.management_api_
import typings.chromeApps.chromeAppsStrings.maximized_
import typings.chromeApps.chromeAppsStrings.minimized_
import typings.chromeApps.chromeAppsStrings.new_note_
import typings.chromeApps.chromeAppsStrings.new_tab_page_
import typings.chromeApps.chromeAppsStrings.none_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.reload_
import typings.chromeApps.chromeAppsStrings.restart_
import typings.chromeApps.chromeAppsStrings.shell
import typings.chromeApps.chromeAppsStrings.system_tray_
import typings.chromeApps.chromeAppsStrings.test_
import typings.chromeApps.chromeAppsStrings.untracked_
import typings.chromeApps.chromeAppsStrings.url_handler_
import typings.filesystem.FileEntry
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////
// App Window //
////////////////
/**
  * @since Chrome 24.
  * @description
  * Use the chrome.app.window API to create windows.
  * Windows have an optional frame with title bar and size controls.
  * They are not associated with any Chrome browser windows.
  * See the Window State Sample for a demonstration of these options.
  */
object app {
  
  @js.native
  trait AppWindow extends StObject {
    
    /** Clear attention to the window. */
    def clearAttention(): Unit = js.native
    
    /** Close the window. */
    def close(): Unit = js.native
    
    /** The JavaScript 'window' object for the created child. */
    var contentWindow: Window = js.native
    
    /** Draw attention to the window. */
    def drawAttention(): Unit = js.native
    
    /** Focus the window. */
    def focus(): Unit = js.native
    
    /**
      * Fullscreens the window.
      * The user will be able to restore the window by pressing ESC.
      * An application can prevent the fullscreen state to be left when ESC is pressed by requesting the
      * app.window.fullscreen.overrideEsc permission and canceling the event by calling .preventDefault(),
      * in the keydown and keyup handlers, like this:
      * @example window.onkeydown = window.onkeyup = function(e) { if (e.keyCode == 27 <<--``ESC``) { e.preventDefault(); }
      * Note window.fullscreen() will cause the entire window to become fullscreen and does not require a user gesture.
      * The HTML5 fullscreen API can also be used to enter fullscreen mode(see Web APIs for more details).
      **/
    def fullscreen(): Unit = js.native
    
    /**
      * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
      * Get the window's inner bounds as a ContentBounds object.
      */
    def getBounds(): ContentBounds = js.native
    
    /** Hide the window. Does nothing if the window is already hidden. */
    def hide(): Unit = js.native
    
    /** The id the window was created with. */
    var id: String = js.native
    
    /**
      * The position, size and constraints of the window's content, which does not include window decorations.
      * @since This property is new in Chrome 36.
      * */
    var innerBounds: Bounds = js.native
    
    /** Is the window always on top? */
    def isAlwaysOnTop(): Boolean = js.native
    
    /** Is the window fullscreen? This will be true if the window has been created fullscreen or was made fullscreen via the AppWindow or HTML5 fullscreen APIs. */
    def isFullscreen(): Boolean = js.native
    
    /** Is the window maximized? */
    def isMaximized(): Boolean = js.native
    
    /** Is the window minimized? */
    def isMinimized(): Boolean = js.native
    
    /** Maximize the window. */
    def maximize(): Unit = js.native
    
    /** Minimize the window. */
    def minimize(): Unit = js.native
    
    /**
      * Move the window to the position (|left|, |top|).
      * @deprecated Deprecated since Chrome 43. Use outerBounds.
      */
    def moveTo(left: integer, top: integer): Unit = js.native
    
    /** Fired when the window is resized. */
    var onBoundsChanged: WindowEvent = js.native
    
    /**
      * Fired when the window is closed.
      * Note, this should be listened to from a window other than the window being closed, for example from the background page.
      * This is because the window being closed will be in the process of being torn down when the event is fired,
      * which means not all APIs in the window's script context will be functional.
      */
    var onClosed: WindowEvent = js.native
    
    /** Fired when the window is fullscreened (either via the AppWindow or HTML5 APIs). */
    var onFullscreened: WindowEvent = js.native
    
    /** Fired when the window is maximized. */
    var onMaximized: WindowEvent = js.native
    
    /** Fired when the window is minimized. */
    var onMinimized: WindowEvent = js.native
    
    /** Fired when the window is restored from being minimized or maximized. */
    var onRestored: WindowEvent = js.native
    
    /**
      * The position, size and constraints of the window, which includes window decorations, such as the title bar and frame.
      * @since This property is new in Chrome 36.
      */
    var outerBounds: Bounds = js.native
    
    /**
      * Resize the window to |width|x|height| pixels in size.
      * @deprecated Deprecated since Chrome 43. Use outerBounds.
      */
    def resizeTo(width: integer, height: integer): Unit = js.native
    
    /** Restore the window, exiting a maximized, minimized, or fullscreen state. */
    def restore(): Unit = js.native
    
    /** Set whether the window should stay above most other windows. Requires the alwaysOnTopWindows permission. */
    def setAlwaysOnTop(alwaysOnTop: Boolean): Unit = js.native
    
    /**
      * Set the window's inner bounds.
      * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
      */
    def setBounds(bounds: ContentBounds): Unit = js.native
    
    /**
      * @requires Permission: 'app.window.shape'
      * Set window shape
      */
    def setShape(rects: js.Array[ContentBounds]): Unit = js.native
    
    /** Set whether the window is visible on all workspaces. (Only for platforms that support this). */
    def setVisibleOnAllWorkspaces(alwaysVisible: Boolean): Unit = js.native
    
    /** Show the window. Does nothing if the window is already visible. Focus the window if |focused| is set to true or omitted. */
    def show(): Unit = js.native
    def show(focused: Boolean): Unit = js.native
  }
  
  @js.native
  trait Bounds extends StObject {
    
    /** This property can be used to read or write the current height of the content or window. */
    var height: integer = js.native
    
    /** This property can be used to read or write the current X coordinate of the content or window. */
    var left: integer = js.native
    
    /** This property can be used to read or write the current maximum height of the content or window. A value of null indicates 'unspecified'. */
    var maxHeight: js.UndefOr[integer | Null] = js.native
    
    /** This property can be used to read or write the current maximum width of the content or window. A value of null indicates 'unspecified'. */
    var maxWidth: js.UndefOr[integer | Null] = js.native
    
    /** This property can be used to read or write the current minimum height of the content or window. A value of null indicates 'unspecified'. */
    var minHeight: js.UndefOr[integer | Null] = js.native
    
    /** This property can be used to read or write the current minimum width of the content or window. A value of null indicates 'unspecified'. */
    var minWidth: js.UndefOr[integer | Null] = js.native
    
    /**
      * Set the maximum size constraints of the content or window.
      * The maximum width or height can be set to null to remove the constraint.
      * A value of undefined will leave a constraint unchanged.
      */
    def setMaximumSize(): Unit = js.native
    def setMaximumSize(maxWidth: Null, maxHeight: integer): Unit = js.native
    def setMaximumSize(maxWidth: Unit, maxHeight: integer): Unit = js.native
    def setMaximumSize(maxWidth: integer): Unit = js.native
    def setMaximumSize(maxWidth: integer, maxHeight: integer): Unit = js.native
    
    /** Set the minimum size constraints of the content or window.
      * The minimum width or height can be set to null to remove the constraint.
      * A value of undefined will leave a constraint unchanged.
      **/
    def setMinimumSize(): Unit = js.native
    def setMinimumSize(minWidth: Null, minHeight: integer): Unit = js.native
    def setMinimumSize(minWidth: Unit, minHeight: integer): Unit = js.native
    def setMinimumSize(minWidth: integer): Unit = js.native
    def setMinimumSize(minWidth: integer, minHeight: integer): Unit = js.native
    
    /** Set the left and top position of the content or window. */
    def setPosition(left: integer, top: integer): Unit = js.native
    
    /** Set the width and height of the content or window. */
    def setSize(width: integer, height: integer): Unit = js.native
    
    /** This property can be used to read or write the current Y coordinate of the content or window. */
    var top: integer = js.native
    
    /** This property can be used to read or write the current width of the content or window. */
    var width: integer = js.native
  }
  
  trait BoundsSpecification extends StObject {
    
    /** The height of the content or window. */
    var height: js.UndefOr[integer] = js.undefined
    
    /** The X coordinate of the content or window. */
    var left: js.UndefOr[integer] = js.undefined
    
    /** The maximum height of the content or window. */
    var maxHeight: js.UndefOr[integer] = js.undefined
    
    /** The maximum width of the content or window. */
    var maxWidth: js.UndefOr[integer] = js.undefined
    
    /** The minimum height of the content or window. */
    var minHeight: js.UndefOr[integer] = js.undefined
    
    /** The minimum width of the content or window. */
    var minWidth: js.UndefOr[integer] = js.undefined
    
    /** The Y coordinate of the content or window. */
    var top: js.UndefOr[integer] = js.undefined
    
    /** The width of the content or window. */
    var width: js.UndefOr[integer] = js.undefined
  }
  object BoundsSpecification {
    
    @scala.inline
    def apply(): BoundsSpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoundsSpecification]
    }
    
    @scala.inline
    implicit class BoundsSpecificationMutableBuilder[Self <: BoundsSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: integer): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: integer): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: integer): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: integer): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: integer): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setTop(value: integer): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ChromeAppWindow
    extends StObject
       with AppWindow {
    
    /**
      * @enum
      * Window state enum
      */
    val State: FULLSCREEN = js.native
    
    val WindowType: PANEL = js.native
    
    /**
      * Whether the current platform supports windows being visible on all workspaces.
      */
    def canSetVisibleOnAllWorkspaces(): Boolean = js.native
    
    /**
      * The size and position of a window can be specified in a number of different ways. The most simple option is not specifying anything at all, in which case a default size and platform dependent position will be used.
      * To set the position, size and constraints of the window, use the innerBounds or outerBounds properties. Inner bounds do not include window decorations. Outer bounds include the window's title bar and frame. Note that the padding between the inner and outer bounds is determined by the OS. Therefore setting the same property for both inner and outer bounds is considered an error (for example, setting both innerBounds.left and outerBounds.left).
      * To automatically remember the positions of windows you can give them ids. If a window has an id, This id is used to remember the size and position of the window whenever it is moved or resized. This size and position is then used instead of the specified bounds on subsequent opening of a window with the same id. If you need to open a window with an id at a location other than the remembered default, you can create it hidden, move it to the desired location, then show it.
      *
      * @param url
      * @param [options]
      * @param [callback] Called in the creating window (parent) before the load event is called in the created window (child). The parent can set fields or functions on the child usable from onload. E.g. background.js: function(createdWindow) { createdWindow.contentWindow.foo = function () { }; }; window.js: window.onload = function () { foo(); } If you specify the callback parameter, it should be a function that looks like this: function(AppWindow createdWindow) {...};
      */
    def create(url: String): Unit = js.native
    def create(url: String, options: Unit, callback: js.Function1[/* created_window */ AppWindow, Unit]): Unit = js.native
    def create(url: String, options: CreateWindowOptions): Unit = js.native
    def create(
      url: String,
      options: CreateWindowOptions,
      callback: js.Function1[/* created_window */ AppWindow, Unit]
    ): Unit = js.native
    
    /**
      * Returns an AppWindow object for the current script context (ie JavaScript 'window' object). This can also be called on a handle to a script context for another page, for example: otherWindow.chrome.app.window.current().
      */
    def current(): AppWindow = js.native
    
    /**
      * Gets an AppWindow with the given id. If no window with the given id exists null is returned. This method is new in Chrome 33.
      */
    def get(id: String): AppWindow = js.native
    
    /**
      * Gets an array of all currently created app windows. This method is new in Chrome 33.
      */
    def getAll(): js.Array[AppWindow] = js.native
  }
  
  trait ContentBounds extends StObject {
    
    var height: js.UndefOr[integer] = js.undefined
    
    var left: js.UndefOr[integer] = js.undefined
    
    var top: js.UndefOr[integer] = js.undefined
    
    var width: js.UndefOr[integer] = js.undefined
  }
  object ContentBounds {
    
    @scala.inline
    def apply(): ContentBounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentBounds]
    }
    
    @scala.inline
    implicit class ContentBoundsMutableBuilder[Self <: ContentBounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: integer): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: integer): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CreateWindowOptions
    extends StObject
       with ContentBounds {
    
    /**
      * @requires(dev) Chrome dev only
      * @requires Permissions: 'app.window.alpha'
      * @description
      * Enable alpha on frame 'none'
      */
    var alphaEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @requires Permissions: 'alwaysOnTopWindows' or 'app.window.alwaysOnTop'
      * @description
      * If true, the window will stay above most other windows.
      * If there are multiple windows of this kind, the currently focused window will be in the foreground.
      * Call setAlwaysOnTop() on the window to change this property after creation.
      * @default false
      */
    var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Size and position of the content in the window (excluding the titlebar).
      * If an id is also specified and a window with a matching id has been shown before,
      * the remembered bounds of the window will be used instead.
      * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
      */
    var bounds: js.UndefOr[ContentBounds] = js.undefined
    
    /** If true, the window will be focused when created. Defaults to true. */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Frame type: none or chrome (defaults to chrome).
      * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
      * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
      * @since Use of FrameOptions is new in M36.
      */
    var frame: js.UndefOr[
        none_ | typings.chromeApps.chromeAppsStrings.chrome | FrameOptions | FrameOptionsChrome
      ] = js.undefined
    
    /**
      * If true, the window will be created in a hidden state. Call show() on the window to show it once it has been created. Defaults to false.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * URL of the window icon.
      * A window can have its own icon when showInShelf is set to true.
      * The URL should be a global or an app's local URL.
      * @since Chrome 54.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Id to identify the window.
      *
      * This will be used to remember the size and position of the window and restore that geometry when a window with the same id is later opened.
      * If a window with a given id is created while another window with the same id already exists,
      * the currently opened window will be focused instead of creating a new window.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * @requires frame = 'none'
      * @requires Permissions: 'app.window.ime'
      * @description
      * Windows API - ime (No fullscreen window in kiosk mode)
      */
    var ime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to specify the initial position, initial size and constraints of the window's content (excluding window decorations).
      * If an id is also specified and a window with a matching id has been shown before, the remembered bounds will be used instead.
      * Note that the padding between the inner and outer bounds is determined by the OS.
      * Therefore setting the same bounds property for both the innerBounds and outerBounds will result in an error.
      * @since This property is new in Chrome 36.
      */
    var innerBounds: js.UndefOr[BoundsSpecification] = js.undefined
    
    /**
      * Maximum height of the window.
      * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
      */
    var maxHeight: js.UndefOr[integer] = js.undefined
    
    /**
      * Maximum width of the window.
      * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
      */
    var maxWidth: js.UndefOr[integer] = js.undefined
    
    /**
      * Minimum height of the window.
      * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
      */
    var minHeight: js.UndefOr[integer] = js.undefined
    
    /**
      * Minimum width of the window.
      * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
      */
    var minWidth: js.UndefOr[integer] = js.undefined
    
    /**
      * Used to specify the initial position, initial size and constraints of the window (including window decorations such as the title bar and frame).
      * If an id is also specified and a window with a matching id has been shown before, the remembered bounds will be used instead.
      * Note that the padding between the inner and outer bounds is determined by the OS.
      * Therefore setting the same bounds property for both the innerBounds and outerBounds will result in an error.
      * @since This property is new in Chrome 36.
      */
    var outerBounds: js.UndefOr[BoundsSpecification] = js.undefined
    
    /**
      * If true, the window will be resizable by the user. Defaults to true.
      */
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the window will have its own shelf icon.
      * Otherwise the window will be grouped in the shelf with other windows that are associated with the app.
      * If showInShelf is set to true you need to specify an id for the window.
      * @default false
      * @since Chrome 54.
      */
    var showInShelf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Deprecated since Chrome 34. Multiple windows with the same id is no longer supported.
      * By default if you specify an id for the window,
      * the window will only be created if another window with the same id doesn't already exist.
      * If a window with the same id already exists that window is activated instead.
      * If you do want to create multiple windows with the same id, you can set this property to false.
      */
    var singleton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial state of the window, allowing it to be created already fullscreen, maximized, or minimized. Defaults to 'normal'.
      */
    var state: js.UndefOr[
        ToStringLiteral[
          FULLSCREEN, 
          /* keyof chrome-apps.anon.FULLSCREEN */ NORMAL | typings.chromeApps.chromeAppsStrings.FULLSCREEN | MAXIMIZED | MINIMIZED, 
          Exclude[
            /* keyof chrome-apps.anon.FULLSCREEN */ NORMAL | typings.chromeApps.chromeAppsStrings.FULLSCREEN | MAXIMIZED | MINIMIZED, 
            normal_ | fullscreen_ | maximized_ | minimized_
          ]
        ]
      ] = js.undefined
    
    /**
      * @deprecated Deprecated since Chrome 69. All app windows use the 'shell' window type.
      * @description Type of window to create
      **/
    var `type`: js.UndefOr[shell] = js.undefined
    
    /**
      * If true, and supported by the platform, the window will be visible on all workspaces.
      * @since Chrome 39.
      */
    var visibleOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined
  }
  object CreateWindowOptions {
    
    @scala.inline
    def apply(): CreateWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateWindowOptions]
    }
    
    @scala.inline
    implicit class CreateWindowOptionsMutableBuilder[Self <: CreateWindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaEnabled(value: Boolean): Self = StObject.set(x, "alphaEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaEnabledUndefined: Self = StObject.set(x, "alphaEnabled", js.undefined)
      
      @scala.inline
      def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      @scala.inline
      def setBounds(value: ContentBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setFrame(value: none_ | typings.chromeApps.chromeAppsStrings.chrome | FrameOptions | FrameOptionsChrome): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIme(value: Boolean): Self = StObject.set(x, "ime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImeUndefined: Self = StObject.set(x, "ime", js.undefined)
      
      @scala.inline
      def setInnerBounds(value: BoundsSpecification): Self = StObject.set(x, "innerBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerBoundsUndefined: Self = StObject.set(x, "innerBounds", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: integer): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: integer): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: integer): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: integer): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOuterBounds(value: BoundsSpecification): Self = StObject.set(x, "outerBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterBoundsUndefined: Self = StObject.set(x, "outerBounds", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setShowInShelf(value: Boolean): Self = StObject.set(x, "showInShelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInShelfUndefined: Self = StObject.set(x, "showInShelf", js.undefined)
      
      @scala.inline
      def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
      
      @scala.inline
      def setState(
        value: ToStringLiteral[
              FULLSCREEN, 
              /* keyof chrome-apps.anon.FULLSCREEN */ NORMAL | typings.chromeApps.chromeAppsStrings.FULLSCREEN | MAXIMIZED | MINIMIZED, 
              Exclude[
                /* keyof chrome-apps.anon.FULLSCREEN */ NORMAL | typings.chromeApps.chromeAppsStrings.FULLSCREEN | MAXIMIZED | MINIMIZED, 
                normal_ | fullscreen_ | maximized_ | minimized_
              ]
            ]
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setType(value: shell): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisibleOnAllWorkspaces(value: Boolean): Self = StObject.set(x, "visibleOnAllWorkspaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleOnAllWorkspacesUndefined: Self = StObject.set(x, "visibleOnAllWorkspaces", js.undefined)
    }
  }
  
  trait FrameOptions extends StObject {
    
    /**
      * @requires(dev) Chrome dev only
      * @requires Permissions: 'app.window.alpha'
      * @description
      * Enable alpha on frame 'none'
      */
    var alphaEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Frame type: none or chrome (defaults to chrome).
      *
      * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
      * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
      */
    var `type`: none_
  }
  object FrameOptions {
    
    @scala.inline
    def apply(): FrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("none")
      __obj.asInstanceOf[FrameOptions]
    }
    
    @scala.inline
    implicit class FrameOptionsMutableBuilder[Self <: FrameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaEnabled(value: Boolean): Self = StObject.set(x, "alphaEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaEnabledUndefined: Self = StObject.set(x, "alphaEnabled", js.undefined)
      
      @scala.inline
      def setType(value: none_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameOptionsChrome extends StObject {
    
    /**
      * Allows the frame color of the window when active to be set. Frame coloring is only available if the frame type is chrome.
      * Frame coloring is only available if the frame type is chrome.
      * @since Frame coloring is new in Chrome 36.
      */
    var activeColor: js.UndefOr[String] = js.undefined
    
    /**
      * Allows the frame color to be set. Frame coloring is only available if the frame type is chrome.
      * @since Frame coloring is new in Chrome 36.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Allows the frame color of the window when inactive to be set differently to the active color. Frame coloring is only available if the frame type is chrome.
      * inactiveColor must be used in conjunction with color.
      * @since Frame coloring is new in Chrome 36.
      */
    var inactiveColor: js.UndefOr[String] = js.undefined
    
    /**
      * Frame type: none or chrome (defaults to chrome).
      *
      * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
      * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
      */
    var `type`: typings.chromeApps.chromeAppsStrings.chrome
  }
  object FrameOptionsChrome {
    
    @scala.inline
    def apply(): FrameOptionsChrome = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("chrome")
      __obj.asInstanceOf[FrameOptionsChrome]
    }
    
    @scala.inline
    implicit class FrameOptionsChromeMutableBuilder[Self <: FrameOptionsChrome] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setInactiveColor(value: String): Self = StObject.set(x, "inactiveColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveColorUndefined: Self = StObject.set(x, "inactiveColor", js.undefined)
      
      @scala.inline
      def setType(value: typings.chromeApps.chromeAppsStrings.chrome): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type WindowEvent = Event[js.Function0[Unit]]
  
  @js.native
  trait WindowParams
    extends StObject
       with AppWindow
       with /* key */ StringDictionary[js.Any] {
    
    var existingWindow: js.UndefOr[Boolean] = js.native
    
    var frameId: js.UndefOr[integer] = js.native
  }
  
  // #endregion
  // #region chrome.app.*
  /////////////////
  // App Runtime //
  /////////////////
  /**
    * @since Chrome 24.
    * @description
    * Use the chrome.app.runtime API to manage the app lifecycle.
    * The app runtime manages app installation, controls the event page,
    * and can shut down the app at anytime.
    */
  object runtime {
    
    trait LaunchData extends StObject {
      
      /**
        * Contains data that specifies the ActionType this app was launched with. This is null if the app was not launched with a specific action intent.
        *  ______________________________________________________________________________
        * | type of 'new_note' | actionType | new_note                                   |
        * |                    |            | The user wants to quickly take a new note. |
        * |____________________|____________|____________________________________________|
        * @since Chrome 54.
        */
      var actionData: js.UndefOr[ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]] = js.undefined
      
      /**
        * The ID of the file or URL handler that the app is being invoked with.
        * Handler IDs are the top-level keys in the file_handlers and/or url_handlers dictionaries in the manifest.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the app is being launched in a Chrome OS kiosk session.
        */
      var isKioskSession: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether the app is being launched in a Chrome OS public session.
        * @since Chrome 47.
        */
      var isPublicSession: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The file entries for the onLaunched event triggered by a matching file handler in the file_handlers manifest key.
        */
      var items: js.UndefOr[js.Array[LaunchDataItem]] = js.undefined
      
      /**
        * The referrer URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
        */
      var referrerUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Where the app is launched from.
        * @see enum LaunchSource
        */
      var source: js.UndefOr[
            ToStringLiteral[
              ABOUTPAGE, 
              /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
              Exclude[
                /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
                command_line_ | background_ | url_handler_ | system_tray_ | context_menu_ | chrome_internal_ | installed_notification_ | kiosk_ | restart_ | reload_ | new_tab_page_ | test_ | extensions_page_ | file_handler_ | management_api_ | about_page_ | load_and_launch_ | untracked_ | app_launcher_ | keyboard_ | ephemeral_app_
              ]
            ]
          ] = js.undefined
      
      /**
        * The URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
        */
      var url: js.UndefOr[String] = js.undefined
    }
    object LaunchData {
      
      @scala.inline
      def apply(): LaunchData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LaunchData]
      }
      
      @scala.inline
      implicit class LaunchDataMutableBuilder[Self <: LaunchData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActionData(value: ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]): Self = StObject.set(x, "actionData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionDataUndefined: Self = StObject.set(x, "actionData", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setIsKioskSession(value: Boolean): Self = StObject.set(x, "isKioskSession", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsKioskSessionUndefined: Self = StObject.set(x, "isKioskSession", js.undefined)
        
        @scala.inline
        def setIsPublicSession(value: Boolean): Self = StObject.set(x, "isPublicSession", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPublicSessionUndefined: Self = StObject.set(x, "isPublicSession", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[LaunchDataItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: LaunchDataItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setReferrerUrl(value: String): Self = StObject.set(x, "referrerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReferrerUrlUndefined: Self = StObject.set(x, "referrerUrl", js.undefined)
        
        @scala.inline
        def setSource(
          value: ToStringLiteral[
                  ABOUTPAGE, 
                  /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
                  Exclude[
                    /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
                    command_line_ | background_ | url_handler_ | system_tray_ | context_menu_ | chrome_internal_ | installed_notification_ | kiosk_ | restart_ | reload_ | new_tab_page_ | test_ | extensions_page_ | file_handler_ | management_api_ | about_page_ | load_and_launch_ | untracked_ | app_launcher_ | keyboard_ | ephemeral_app_
                  ]
                ]
        ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait LaunchDataItem extends StObject {
      
      /**
        * Entry for the item
        */
      var entry: FileEntry
      
      /**
        * The MIME type of the file.
        */
      var `type`: js.UndefOr[String] = js.undefined
    }
    object LaunchDataItem {
      
      @scala.inline
      def apply(entry: FileEntry): LaunchDataItem = {
        val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
        __obj.asInstanceOf[LaunchDataItem]
      }
      
      @scala.inline
      implicit class LaunchDataItemMutableBuilder[Self <: LaunchDataItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEntry(value: FileEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
  }
}
