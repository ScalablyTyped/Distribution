package typings
package chromeDashAppsLib.chromeNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeAppWindow extends AppWindow {
  /**
    * @enum
    * Window state enum
    */
  val State: chromeDashAppsLib.Anon_NORMAL = js.native
  val WindowType: chromeDashAppsLib.Anon_SHELL = js.native
  /**
    * Whether the current platform supports windows being visible on all workspaces.
    */
  def canSetVisibleOnAllWorkspaces(): scala.Boolean = js.native
  /**
    * The size and position of a window can be specified in a number of different ways. The most simple option is not specifying anything at all, in which case a default size and platform dependent position will be used.
    * To set the position, size and constraints of the window, use the innerBounds or outerBounds properties. Inner bounds do not include window decorations. Outer bounds include the window's title bar and frame. Note that the padding between the inner and outer bounds is determined by the OS. Therefore setting the same property for both inner and outer bounds is considered an error (for example, setting both innerBounds.left and outerBounds.left).
    * To automatically remember the positions of windows you can give them ids. If a window has an id, This id is used to remember the size and position of the window whenever it is moved or resized. This size and position is then used instead of the specified bounds on subsequent opening of a window with the same id. If you need to open a window with an id at a location other than the remembered default, you can create it hidden, move it to the desired location, then show it.
    *
    * @param url
    * @param [options]
    * @param [callback] Called in the creating window (parent) before the load event is called in the created window (child). The parent can set fields or functions on the child usable from onload. E.g. background.js: function(createdWindow) { createdWindow.contentWindow.foo = function () { }; }; window.js: window.onload = function () { foo(); } If you specify the callback parameter, it should be a function that looks like this: function(AppWindow createdWindow) {...};
    */
  def create(url: java.lang.String): scala.Unit = js.native
  def create(url: java.lang.String, options: CreateWindowOptions): scala.Unit = js.native
  def create(
    url: java.lang.String,
    options: CreateWindowOptions,
    callback: js.Function1[/* created_window */ AppWindow, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns an AppWindow object for the current script context (ie JavaScript 'window' object). This can also be called on a handle to a script context for another page, for example: otherWindow.chrome.app.window.current().
    */
  def current(): AppWindow = js.native
  /**
    * Gets an AppWindow with the given id. If no window with the given id exists null is returned. This method is new in Chrome 33.
    */
  def get(id: java.lang.String): AppWindow = js.native
  /**
    * Gets an array of all currently created app windows. This method is new in Chrome 33.
    */
  def getAll(): js.Array[AppWindow] = js.native
}

