package typings
package cordovaDashPluginDashXDashSocialsharingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var plugins: CordovaPlugins
}

object Window {
  @scala.inline
  def apply(plugins: CordovaPlugins): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[Window]
  }
}

