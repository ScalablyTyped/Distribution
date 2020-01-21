package typings.cordovaPluginSplashscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHide extends js.Object {
  /** Dismiss the splash screen. */
  def hide(): Unit
  /** Displays the splash screen. */
  def show(): Unit
}

object AnonHide {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): AnonHide = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[AnonHide]
  }
}

