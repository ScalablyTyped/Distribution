package typings
package cordovaDashIonicLib.IonicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  /**
    * Whether or not the keyboard is currently visible.
    */
  var isVisible: scala.Boolean
  /**
    * Close the keyboard if it is open.
    */
  def close(): scala.Unit
  /**
    * Disable native scrolling, useful if you are using JavaScript to scroll
    *
    * @param disbale
    */
  def disableScroll(disbale: scala.Boolean): scala.Unit
  /**
    * Hide the keyboard accessory bar with the next, previous and done buttons.
    *
    * @param hide
    */
  def hideKeyboardAccessoryBar(hide: scala.Boolean): scala.Unit
  /**
    * Force keyboard to be shown on Android.
    * This typically helps if autofocus on a text element does not pop up the keyboard automatically
    *
    * Supported Platforms: Android, Blackberry 10
    */
  def show(): scala.Unit
}

object Keyboard {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    disableScroll: scala.Boolean => scala.Unit,
    hideKeyboardAccessoryBar: scala.Boolean => scala.Unit,
    isVisible: scala.Boolean,
    show: () => scala.Unit
  ): Keyboard = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), disableScroll = js.Any.fromFunction1(disableScroll), hideKeyboardAccessoryBar = js.Any.fromFunction1(hideKeyboardAccessoryBar), isVisible = isVisible, show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Keyboard]
  }
}

