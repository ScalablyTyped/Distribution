package typings
package cordovaDashPluginDashInsomniaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins extends js.Object {
  var insomnia: cordovaDashPluginDashInsomniaLib.InsomniaPluginNs.Insomnia
}

object Plugins {
  @scala.inline
  def apply(insomnia: cordovaDashPluginDashInsomniaLib.InsomniaPluginNs.Insomnia): Plugins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insomnia")(insomnia)
    __obj.asInstanceOf[Plugins]
  }
}

