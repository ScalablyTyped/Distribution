package typings.cordovaIonic.Ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  /**
    * Whether or not the keyboard is currently visible.
    */
  var isVisible: Boolean
  /**
    * Close the keyboard if it is open.
    */
  def close(): Unit
  /**
    * Disable native scrolling, useful if you are using JavaScript to scroll
    *
    * @param disbale
    */
  def disableScroll(disbale: Boolean): Unit
  /**
    * Hide the keyboard accessory bar with the next, previous and done buttons.
    *
    * @param hide
    */
  def hideKeyboardAccessoryBar(hide: Boolean): Unit
  /**
    * Force keyboard to be shown on Android.
    * This typically helps if autofocus on a text element does not pop up the keyboard automatically
    *
    * Supported Platforms: Android, Blackberry 10
    */
  def show(): Unit
}

object Keyboard {
  @scala.inline
  def apply(
    close: () => Unit,
    disableScroll: Boolean => Unit,
    hideKeyboardAccessoryBar: Boolean => Unit,
    isVisible: Boolean,
    show: () => Unit
  ): Keyboard = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), disableScroll = js.Any.fromFunction1(disableScroll), hideKeyboardAccessoryBar = js.Any.fromFunction1(hideKeyboardAccessoryBar), isVisible = isVisible.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Keyboard]
  }
}

