package typings
package chromeDashAppsLib.chromeNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppWindow extends js.Object {
  /** The JavaScript 'window' object for the created child. */
  var contentWindow: chromeDashAppsLib.Window = js.native
  /** The id the window was created with. */
  var id: java.lang.String = js.native
  /**
    * The position, size and constraints of the window's content, which does not include window decorations.
    * @since This property is new in Chrome 36.
    * */
  var innerBounds: Bounds = js.native
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
  /** Clear attention to the window. */
  def clearAttention(): scala.Unit = js.native
  /** Close the window. */
  def close(): scala.Unit = js.native
  /** Draw attention to the window. */
  def drawAttention(): scala.Unit = js.native
  /** Focus the window. */
  def focus(): scala.Unit = js.native
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
  def fullscreen(): scala.Unit = js.native
  /**
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    * Get the window's inner bounds as a ContentBounds object.
    */
  def getBounds(): ContentBounds = js.native
  /** Hide the window. Does nothing if the window is already hidden. */
  def hide(): scala.Unit = js.native
  /** Is the window always on top? */
  def isAlwaysOnTop(): scala.Boolean = js.native
  /** Is the window fullscreen? This will be true if the window has been created fullscreen or was made fullscreen via the AppWindow or HTML5 fullscreen APIs. */
  def isFullscreen(): scala.Boolean = js.native
  /** Is the window maximized? */
  def isMaximized(): scala.Boolean = js.native
  /** Is the window minimized? */
  def isMinimized(): scala.Boolean = js.native
  /** Maximize the window. */
  def maximize(): scala.Unit = js.native
  /** Minimize the window. */
  def minimize(): scala.Unit = js.native
  /**
    * Move the window to the position (|left|, |top|).
    * @deprecated Deprecated since Chrome 43. Use outerBounds.
    */
  def moveTo(left: chromeDashAppsLib.chromeNs.integer, top: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /**
    * Resize the window to |width|x|height| pixels in size.
    * @deprecated Deprecated since Chrome 43. Use outerBounds.
    */
  def resizeTo(width: chromeDashAppsLib.chromeNs.integer, height: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /** Restore the window, exiting a maximized, minimized, or fullscreen state. */
  def restore(): scala.Unit = js.native
  /** Set whether the window should stay above most other windows. Requires the alwaysOnTopWindows permission. */
  def setAlwaysOnTop(alwaysOnTop: scala.Boolean): scala.Unit = js.native
  /**
    * Set the window's inner bounds.
    * @deprecated Deprecated since Chrome 36. Use innerBounds or outerBounds.
    */
  def setBounds(bounds: ContentBounds): scala.Unit = js.native
  /**
    * @requires Permission: 'app.window.shape'
    * Set window shape
    */
  def setShape(rects: js.Array[ContentBounds]): scala.Unit = js.native
  /** Set whether the window is visible on all workspaces. (Only for platforms that support this). */
  def setVisibleOnAllWorkspaces(alwaysVisible: scala.Boolean): scala.Unit = js.native
  /** Show the window. Does nothing if the window is already visible. Focus the window if |focused| is set to true or omitted. */
  def show(): scala.Unit = js.native
  def show(focused: scala.Boolean): scala.Unit = js.native
}

