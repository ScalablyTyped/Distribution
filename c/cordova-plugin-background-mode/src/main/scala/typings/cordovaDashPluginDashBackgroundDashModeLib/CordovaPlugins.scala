package typings
package cordovaDashPluginDashBackgroundDashModeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var backgroundMode: CordovaPluginBackgroundMode
}

object CordovaPlugins {
  @scala.inline
  def apply(backgroundMode: CordovaPluginBackgroundMode): CordovaPlugins = {
    val __obj = js.Dynamic.literal(backgroundMode = backgroundMode)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

