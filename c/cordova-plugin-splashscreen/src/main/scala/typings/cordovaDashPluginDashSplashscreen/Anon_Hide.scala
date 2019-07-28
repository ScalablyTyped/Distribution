package typings.cordovaDashPluginDashSplashscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hide extends js.Object {
  /** Dismiss the splash screen. */
  def hide(): Unit
  /** Displays the splash screen. */
  def show(): Unit
}

object Anon_Hide {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): Anon_Hide = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Anon_Hide]
  }
}

