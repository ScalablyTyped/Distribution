package typings
package cordovaDashPluginDashSplashscreenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hide extends js.Object {
  /** Dismiss the splash screen. */
  def hide(): scala.Unit
  /** Displays the splash screen. */
  def show(): scala.Unit
}

object Anon_Hide {
  @scala.inline
  def apply(hide: js.Function0[scala.Unit], show: js.Function0[scala.Unit]): Anon_Hide = {
    val __obj = js.Dynamic.literal(hide = hide, show = show)
  
    __obj.asInstanceOf[Anon_Hide]
  }
}

