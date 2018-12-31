package typings
package cordovaDashPluginDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyboard extends js.Object {
  /**
    * Specifies whenether content of page would be autoamtically scrolled to the top of the page when keyboard is hiding.
    *
    * Set this to true if you need that page scroll to beginning when keyboard is hiding.
    * This is allows to fix issue with elements declared with position: fixed, after keyboard is hiding.
    *
    * Supported Platforms:
    *  - iOS
    *
    * Example:
    * <code>
    *     Keyboard.automaticScrollToTopOnHiding = true;
    * </code>
    *
    */
  var automaticScrollToTopOnHiding: scala.Boolean = js.native
  // Properties
  /**
    * Determine if the keyboard is visible.
    *
    * Read this property to determine if the keyboard is visible.
    *
    * Supported Platforms:
    *  - iOS
    *
    * Example:
    * <code>
    * if (Keyboard.isVisible) {
    * // do something
    * }
    * </code>
    *
    */
  var isVisible: scala.Boolean = js.native
  /**
    * Disable scrolling when the the WebView is shrunk.
    *
    * Set to true to disable scrolling when the WebView is shrunk.
    *
    * Supported Platforms:
    *  - iOS
    *
    * Example:
    * <code>
    * Keyboard.disableScrollingInShrinkView(true);
    * Keyboard.disableScrollingInShrinkView(false);
    * </code>
    *
    * @param disable
    * @param successCallback A success callbackfunction
    */
  def disableScrollingInShrinkView(disable: scala.Boolean): scala.Unit = js.native
  def disableScrollingInShrinkView(disable: scala.Boolean, successCallback: js.Function1[/* currentValue */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Hide the keyboard
    *
    * Call this method to hide the keyboard
    *
    * Supported Platforms:
    *  - iOS
    *  - Android
    *
    * Example:
    * <code>
    * Keyboard.hide();
    * </code>
    */
  def hide(): scala.Unit = js.native
  /**
    * Hide the keyboard toolbar.
    *
    * Set to true to hide the additional toolbar that is on top of the keyboard.
    * This toolbar features the Prev, Next, and Done buttons.
    *
    * Supported Platforms:
    *  - iOS
    *
    * Example:
    * <code>
    * Keyboard.hideFormAccessoryBar(true);
    * Keyboard.hideFormAccessoryBar(false);
    * Keyboard.hideFormAccessoryBar(null, function (currentValue) { console.log(currentValue); });
    * </code>
    *
    * @param hide
    * @param successCallback A success callbackfunction
    */
  def hideFormAccessoryBar(hide: scala.Boolean): scala.Unit = js.native
  def hideFormAccessoryBar(hide: scala.Boolean, successCallback: js.Function1[/* currentValue */ js.Any, scala.Unit]): scala.Unit = js.native
  def onhide(): scala.Unit = js.native
  def onhiding(): scala.Unit = js.native
  /**
    * Deprecated Events
    */
  def onshow(): scala.Unit = js.native
  def onshowing(): scala.Unit = js.native
  /**
    * Show the keyboard
    *
    * Call this method to show the keyboard.
    *
    * Supported Platforms:
    *  - Android
    *
    * Example:
    * <code>
    * Keyboard.show();
    * </code>
    */
  def show(): scala.Unit = js.native
  // Methods
  /**
    * Shrink the WebView when the keyboard comes up.
    *
    * Set to true to shrink the WebView when the keyboard comes up.
    * The WebView shrinks instead of the viewport shrinking and the page scrollable.
    * This applies to apps that position their elements relative to the bottom of the WebView.
    * This is the default behaviour on Android, and makes a lot of sense when building apps as opposed to webpages.
    *
    * Supported Platforms:
    *  - iOS
    *
    * Example:
    * <code>
    * Keyboard.shrinkView(true);
    * Keyboard.shrinkView(false);
    * Keyboard.shrinkView(null, function (currentValue) { console.log(currentValue); });
    * </code>
    *
    * @param shrink
    * @param successCallback A success callbackfunction
    */
  def shrinkView(shrink: scala.Boolean): scala.Unit = js.native
  def shrinkView(shrink: scala.Boolean, successCallback: js.Function1[/* currentValue */ js.Any, scala.Unit]): scala.Unit = js.native
}

