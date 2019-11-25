package typings.chromeDashApps.chrome.app

import typings.chromeDashApps.Anon_FULLSCREEN
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.fullscreen
import typings.chromeDashApps.chromeDashAppsStrings.maximized
import typings.chromeDashApps.chromeDashAppsStrings.minimized
import typings.chromeDashApps.chromeDashAppsStrings.none_
import typings.chromeDashApps.chromeDashAppsStrings.normal
import typings.chromeDashApps.chromeDashAppsStrings.shell
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWindowOptions extends ContentBounds {
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
    none_ | typings.chromeDashApps.chromeDashAppsStrings.chrome | FrameOptions | FrameOptionsChrome
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
      Anon_FULLSCREEN, 
      String, 
      Exclude[String, normal | fullscreen | maximized | minimized]
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
  def apply(
    alphaEnabled: js.UndefOr[Boolean] = js.undefined,
    alwaysOnTop: js.UndefOr[Boolean] = js.undefined,
    bounds: ContentBounds = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    frame: none_ | typings.chromeDashApps.chromeDashAppsStrings.chrome | FrameOptions | FrameOptionsChrome = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    id: String = null,
    ime: js.UndefOr[Boolean] = js.undefined,
    innerBounds: BoundsSpecification = null,
    left: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    outerBounds: BoundsSpecification = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    showInShelf: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    state: ToStringLiteral[
      Anon_FULLSCREEN, 
      String, 
      Exclude[String, normal | fullscreen | maximized | minimized]
    ] = null,
    top: Int | Double = null,
    `type`: shell = null,
    visibleOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): CreateWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alphaEnabled)) __obj.updateDynamic("alphaEnabled")(alphaEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysOnTop)) __obj.updateDynamic("alwaysOnTop")(alwaysOnTop.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ime)) __obj.updateDynamic("ime")(ime.asInstanceOf[js.Any])
    if (innerBounds != null) __obj.updateDynamic("innerBounds")(innerBounds.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (outerBounds != null) __obj.updateDynamic("outerBounds")(outerBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(showInShelf)) __obj.updateDynamic("showInShelf")(showInShelf.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleOnAllWorkspaces)) __obj.updateDynamic("visibleOnAllWorkspaces")(visibleOnAllWorkspaces.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWindowOptions]
  }
}

