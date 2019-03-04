package typings
package cordovaDashPluginDashInsomniaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var plugins: Plugins
}

object Window {
  @scala.inline
  def apply(plugins: Plugins): Window = {
    val __obj = js.Dynamic.literal(plugins = plugins)
  
    __obj.asInstanceOf[Window]
  }
}

