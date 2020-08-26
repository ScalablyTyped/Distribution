package typings.chromeApps.chrome.app

import typings.chromeApps.anon.FULLSCREEN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.MAXIMIZED
import typings.chromeApps.chromeAppsStrings.MINIMIZED
import typings.chromeApps.chromeAppsStrings.NORMAL
import typings.chromeApps.chromeAppsStrings.chrome
import typings.chromeApps.chromeAppsStrings.fullscreen_
import typings.chromeApps.chromeAppsStrings.maximized_
import typings.chromeApps.chromeAppsStrings.minimized_
import typings.chromeApps.chromeAppsStrings.none_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.shell
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWindowOptions extends ContentBounds {
  /**
    * @requires(dev) Chrome dev only
    * @requires Permissions: 'app.window.alpha'
    * @description
    * Enable alpha on frame 'none'
    */
  var alphaEnabled: js.UndefOr[Boolean] = js.native
  /**
    * @requires Permissions: 'alwaysOnTopWindows' or 'app.window.alwaysOnTop'
    * @description
    * If true, the window will stay above most other windows.
    * If there are multiple windows of this kind, the currently focused window will be in the foreground.
    * Call setAlwaysOnTop() on the window to change this property after creation.
    * @default false
    */
  var alwaysOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Size and position of the content in the window (excluding the titlebar).
    * If an id is also specified and a window with a matching id has been shown before,
    * the remembered bounds of the window will be used instead.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var bounds: js.UndefOr[ContentBounds] = js.native
  /** If true, the window will be focused when created. Defaults to true. */
  var focused: js.UndefOr[Boolean] = js.native
  /**
    * Frame type: none or chrome (defaults to chrome).
    * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
    * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
    * @since Use of FrameOptions is new in M36.
    */
  var frame: js.UndefOr[none_ | chrome | FrameOptions | FrameOptionsChrome] = js.native
  /**
    * If true, the window will be created in a hidden state. Call show() on the window to show it once it has been created. Defaults to false.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * URL of the window icon.
    * A window can have its own icon when showInShelf is set to true.
    * The URL should be a global or an app's local URL.
    * @since Chrome 54.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Id to identify the window.
    *
    * This will be used to remember the size and position of the window and restore that geometry when a window with the same id is later opened.
    * If a window with a given id is created while another window with the same id already exists,
    * the currently opened window will be focused instead of creating a new window.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * @requires frame = 'none'
    * @requires Permissions: 'app.window.ime'
    * @description
    * Windows API - ime (No fullscreen window in kiosk mode)
    */
  var ime: js.UndefOr[Boolean] = js.native
  /**
    * Used to specify the initial position, initial size and constraints of the window's content (excluding window decorations).
    * If an id is also specified and a window with a matching id has been shown before, the remembered bounds will be used instead.
    * Note that the padding between the inner and outer bounds is determined by the OS.
    * Therefore setting the same bounds property for both the innerBounds and outerBounds will result in an error.
    * @since This property is new in Chrome 36.
    */
  var innerBounds: js.UndefOr[BoundsSpecification] = js.native
  /**
    * Maximum height of the window.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var maxHeight: js.UndefOr[integer] = js.native
  /**
    * Maximum width of the window.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var maxWidth: js.UndefOr[integer] = js.native
  /**
    * Minimum height of the window.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var minHeight: js.UndefOr[integer] = js.native
  /**
    * Minimum width of the window.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  var minWidth: js.UndefOr[integer] = js.native
  /**
    * Used to specify the initial position, initial size and constraints of the window (including window decorations such as the title bar and frame).
    * If an id is also specified and a window with a matching id has been shown before, the remembered bounds will be used instead.
    * Note that the padding between the inner and outer bounds is determined by the OS.
    * Therefore setting the same bounds property for both the innerBounds and outerBounds will result in an error.
    * @since This property is new in Chrome 36.
    */
  var outerBounds: js.UndefOr[BoundsSpecification] = js.native
  /**
    * If true, the window will be resizable by the user. Defaults to true.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * If true, the window will have its own shelf icon.
    * Otherwise the window will be grouped in the shelf with other windows that are associated with the app.
    * If showInShelf is set to true you need to specify an id for the window.
    * @default false
    * @since Chrome 54.
    */
  var showInShelf: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Deprecated since Chrome 34. Multiple windows with the same id is no longer supported.
    * By default if you specify an id for the window,
    * the window will only be created if another window with the same id doesn't already exist.
    * If a window with the same id already exists that window is activated instead.
    * If you do want to create multiple windows with the same id, you can set this property to false.
    */
  var singleton: js.UndefOr[Boolean] = js.native
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
  ] = js.native
  /**
    * @deprecated Deprecated since Chrome 69. All app windows use the 'shell' window type.
    * @description Type of window to create
    **/
  var `type`: js.UndefOr[shell] = js.native
  /**
    * If true, and supported by the platform, the window will be visible on all workspaces.
    * @since Chrome 39.
    */
  var visibleOnAllWorkspaces: js.UndefOr[Boolean] = js.native
}

object CreateWindowOptions {
  @scala.inline
  def apply(): CreateWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWindowOptions]
  }
  @scala.inline
  implicit class CreateWindowOptionsOps[Self <: CreateWindowOptions] (val x: Self) extends AnyVal {
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
    def setAlphaEnabled(value: Boolean): Self = this.set("alphaEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaEnabled: Self = this.set("alphaEnabled", js.undefined)
    @scala.inline
    def setAlwaysOnTop(value: Boolean): Self = this.set("alwaysOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysOnTop: Self = this.set("alwaysOnTop", js.undefined)
    @scala.inline
    def setBounds(value: ContentBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setFrame(value: none_ | chrome | FrameOptions | FrameOptionsChrome): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIme(value: Boolean): Self = this.set("ime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIme: Self = this.set("ime", js.undefined)
    @scala.inline
    def setInnerBounds(value: BoundsSpecification): Self = this.set("innerBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerBounds: Self = this.set("innerBounds", js.undefined)
    @scala.inline
    def setMaxHeight(value: integer): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: integer): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: integer): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: integer): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOuterBounds(value: BoundsSpecification): Self = this.set("outerBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterBounds: Self = this.set("outerBounds", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setShowInShelf(value: Boolean): Self = this.set("showInShelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInShelf: Self = this.set("showInShelf", js.undefined)
    @scala.inline
    def setSingleton(value: Boolean): Self = this.set("singleton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleton: Self = this.set("singleton", js.undefined)
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
    ): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setType(value: shell): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisibleOnAllWorkspaces(value: Boolean): Self = this.set("visibleOnAllWorkspaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleOnAllWorkspaces: Self = this.set("visibleOnAllWorkspaces", js.undefined)
  }
  
}

